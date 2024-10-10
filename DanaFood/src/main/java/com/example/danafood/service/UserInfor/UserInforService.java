package com.example.danafood.service.UserInfor;

import com.example.danafood.dto.UserInforDto;
import com.example.danafood.model.UserInfor;
import com.example.danafood.repository.IUserInforRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInforService implements IUserInforService {
    @Autowired
    private IUserInforRepo iUserInforRepo;

    public void save(UserInforDto userInforDto) {
        UserInfor userInfor = new UserInfor(userInforDto.getFirstName(), userInforDto.getLastName(), userInforDto.getPhoneNumber(), userInforDto.getEmail(), userInforDto.getAddress(),userInforDto.getUser());
        iUserInforRepo.save(userInfor);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return iUserInforRepo.existsByEmail(email);
    }
}
