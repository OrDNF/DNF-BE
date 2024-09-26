package com.example.danafood.service.UserInfor;

import com.example.danafood.repository.IUserInforRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInforService implements IUserInforService {
    @Autowired
    private IUserInforRepo iUserInforRepo;
}
