package com.example.danafood.controller;

import com.example.danafood.dto.response.ResponseMessage;
import com.example.danafood.model.User;
import com.example.danafood.service.Role.IRoleService;
import com.example.danafood.service.Shop.IShopService;
import com.example.danafood.service.User.IUserService;
import com.example.danafood.service.UserDetails.UserPrinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/", allowedHeaders = "*")
public class RegisterController {
    @Autowired
    private IUserService userService;
    @Autowired
    private IShopService shopService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private IRoleService iRoleService;
    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/register")
    public ResponseEntity<?> signUp(@RequestBody User user) {
        User newUser = new User(user.getUserName(), passwordEncoder.encode(user.getPassword()), user.getRole());
        userService.signUp(newUser);
        return new ResponseEntity<>(new ResponseMessage("Create success"), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        Authentication auth = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(auth);
//        UserPrinciple userPrinciple = (UserPrinciple) auth.getPrincipal();
        return new ResponseEntity<>(new ResponseMessage("Login success"), HttpStatus.OK);
    }

}
