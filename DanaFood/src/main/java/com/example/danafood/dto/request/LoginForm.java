package com.example.danafood.dto.request;

public class LoginForm {
    private String userName;
    private String password;

    public LoginForm() {
    }

    public LoginForm(String password, String userName) {
        this.password = password;
        this.userName = userName;
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
}
