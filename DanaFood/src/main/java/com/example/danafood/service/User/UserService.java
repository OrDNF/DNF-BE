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
    private User user;

    @Override
    public void signUp(UserDto userDto) {
        user = new User();
        user.setUserName(userDto.getUserName());
        user.setPassword(userDto.getPassword());
        user.setRole(userDto.getRole());
        iUserRepo.save(user);
    }
}
