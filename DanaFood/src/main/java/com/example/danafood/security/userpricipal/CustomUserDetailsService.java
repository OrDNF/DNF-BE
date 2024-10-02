package com.example.danafood.security.userpricipal;

import com.example.danafood.dto.UserDto;
import com.example.danafood.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private IUserRepo iUserRepo;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserDto user = iUserRepo.findByUserName(userName);
        if (user == null) {
            throw new UsernameNotFoundException("Not found account with username " + userName);
        }
        return UserPrincipal.create(user);
    }
}
