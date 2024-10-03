package com.example.danafood.security.userpricipal;

import com.example.danafood.dto.UserDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;
import java.util.stream.Collectors;

public class UserPrinciple implements UserDetails {
    private Long id;
    @JsonIgnore
    private String userName;
    @JsonIgnore
    private String password;

    public UserPrinciple(){}
    public UserPrinciple(UserDto user) {}

    public Collection<? extends GrantedAuthority> authorities;
    public UserPrinciple(Long id, String userName, String password, Collection<? extends GrantedAuthority> authorities) {
        super();
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.authorities = authorities;
    }
    public static UserPrinciple create(UserDto user) {
        List<GrantedAuthority> authorities = Collections.singletonList(user.getRole()).stream().map(role -> new SimpleGrantedAuthority(role.getRoleName())).collect(Collectors.toList());
        return new UserPrinciple(user.getId(), user.getUserName(), user.getPassword(), authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
