package com.example.danafood.controller;

import com.example.danafood.dto.UserDto;
import com.example.danafood.dto.response.ResponseMessage;
import com.example.danafood.service.User.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/", allowedHeaders = "*")
public class UserController {
    @Autowired
    private IUserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserDto user) {
        UserDto userDto = new UserDto( passwordEncoder.encode(user.getPassword()), user.getUserName(), user.getRole());
        userService.signUp(userDto);
        return new ResponseEntity<>(new ResponseMessage("Create success"), HttpStatus.OK);
    }
}
