package com.example.danafood.controller;

import com.example.danafood.service.Shop.IShopService;
import com.example.danafood.service.User.IUserService;
import com.example.danafood.service.UserInfor.IUserInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/", allowedHeaders = "*")
public class LoginController {
    @Autowired
    private IUserService userService;
    @Autowired
    private IUserInforService userInforService;
    @Autowired
    private IShopService shopService;
}
