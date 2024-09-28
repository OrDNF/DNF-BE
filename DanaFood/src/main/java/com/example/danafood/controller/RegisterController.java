package com.example.danafood.controller;

import com.example.danafood.dto.response.ResponseMessage;
import com.example.danafood.model.Role;
import com.example.danafood.model.User;
import com.example.danafood.service.Role.IRoleService;
import com.example.danafood.service.Shop.IShopService;
import com.example.danafood.service.User.IUserService;
import com.example.danafood.service.UserInfor.IUserInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("/register")
    public ResponseEntity<?> signUp(@RequestBody User user) {
        Role role = iRoleService.getRoleByName("SHOP");
        User newUser = new User(user.getUserName(), passwordEncoder.encode(user.getPassword()),role);
        userService.signUp(newUser);
        return new ResponseEntity<>(new ResponseMessage("Create success"), HttpStatus.OK);
    }
}
