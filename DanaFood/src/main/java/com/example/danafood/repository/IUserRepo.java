package com.example.danafood.repository;

import com.example.danafood.dto.UserDto;
import com.example.danafood.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface IUserRepo extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
