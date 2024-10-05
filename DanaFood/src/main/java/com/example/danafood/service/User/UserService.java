package com.example.danafood.service.User;

import com.example.danafood.dto.UserDto;
import com.example.danafood.model.User;
import com.example.danafood.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepo iUserRepo;

    @Override
    public void signUp(User user) {
        iUserRepo.save(user);
    }

    @Override
    public User findByName(String name) {
        return iUserRepo.findByUserName(name);
    }


}
