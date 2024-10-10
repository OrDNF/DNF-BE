//package com.example.danafood.security.userpricipal;
//
//import com.example.danafood.dto.UserDto;
//import com.example.danafood.model.User;
//import com.example.danafood.repository.IUserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//    @Autowired
//    private IUserRepo iUserRepo;
//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        User user = iUserRepo.findByUserName(userName);
//        UserDto userDto = new UserDto(user.getId(), user.getUserName(), user.getPassword(), user.getRole());
//        if (userDto == null) {
//            throw new UsernameNotFoundException("Not found account with username " + userName);
//        }
//        return UserPrinciple.create(userDto);
//    }
//}
