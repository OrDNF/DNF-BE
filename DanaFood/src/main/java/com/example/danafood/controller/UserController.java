package com.example.danafood.controller;

import com.example.danafood.dto.UserDto;
import com.example.danafood.dto.UserInforDto;
import com.example.danafood.dto.request.LoginForm;
import com.example.danafood.dto.request.UserRegisterForm;
import com.example.danafood.dto.response.JwtResponse;
import com.example.danafood.dto.response.ResponseMessage;
import com.example.danafood.model.User;
import com.example.danafood.security.jwt.JwtTokenProvider;
import com.example.danafood.security.userpricipal.UserPrinciple;
import com.example.danafood.service.User.IUserService;
import com.example.danafood.service.UserInfor.IUserInforService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/", allowedHeaders = "*")
public class UserController {
    @Autowired
    private IUserService userService;
    @Autowired
    private IUserInforService userInforService;
    @Autowired
    private JwtTokenProvider jwtTokenProvider;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/user/register")
    public ResponseEntity<?> register(@Valid @RequestBody UserRegisterForm user) {
        if(userService.existsByUserName(user.getUserName()) || userInforService.existsByEmail(user.getEmail())){
            return new ResponseEntity<>(new ResponseMessage("Email or UserName already exists"), HttpStatus.BAD_REQUEST);
        }
        User newUser = new User(user.getUserName(), passwordEncoder.encode(user.getPassword()), user.getRole());
        userService.signUp(newUser);
        User findUser = userService.findByName(newUser.getUserName());
        UserInforDto userInforDto = new UserInforDto(user.getFirstName(), user.getLastName(), user.getPhone(), user.getEmail(), user.getAddress(), findUser);
        userInforService.save(userInforDto);
        return new ResponseEntity<>(new ResponseMessage("Create success"), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginForm loginForm) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginForm.getUserName(), loginForm.getPassword())
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtTokenProvider.generateToken(authentication);
        UserPrinciple userPrinciple = (UserPrinciple) authentication.getPrincipal();
        LocalDateTime time = LocalDateTime.now();
        return new ResponseEntity<>(new JwtResponse(token,userPrinciple.getUsername(),userPrinciple.getAuthorities(),time), HttpStatus.OK);
    }
}
