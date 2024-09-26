package com.example.danafood.repository;

import com.example.danafood.model.UserInfor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserInforRepo extends JpaRepository<UserInfor, Long> {
}
