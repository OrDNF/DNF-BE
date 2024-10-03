package com.example.danafood.dto;

import com.example.danafood.model.Role;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class UserDto {
    private Long id;
    private String userName;
    private String password;
    private Role role;

    public UserDto() {
    }

    public UserDto(String userName, String password,  Role role) {
        this.password = password;
        this.userName = userName;
        this.role = role;
    }

    public UserDto(Long id, String userName, String password, Role role) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
