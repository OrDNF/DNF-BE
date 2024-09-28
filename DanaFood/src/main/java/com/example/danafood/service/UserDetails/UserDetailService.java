package com.example.danafood.service.UserDetails;

import com.example.danafood.model.User;
import com.example.danafood.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {
    @Autowired
    private IUserRepo iUserRepo;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = iUserRepo.findByUserName(userName);
        if(user == null) {
            throw new UsernameNotFoundException("Không tìm thấy usernam: " + userName);
        }
        return null;
    }
}
