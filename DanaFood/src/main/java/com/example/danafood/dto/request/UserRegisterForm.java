package com.example.danafood.dto.request;

import com.example.danafood.model.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;


public class UserRegisterForm {
    @NotNull
    @NotBlank(message = "Tên đăng nhập không được để trống")
    @Size(min = 6, max = 20,  message = "Tên đăng nhập từ 6-20 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Tên đăng nhập chứa ký tự chữ, in hoa và chữ số, không được chứa ký tự đặc biệt!")
    private String userName;

    @NotNull
    @NotBlank(message = "Mật khẩu không được để trống")
    @Size(min = 10, max = 20, message = "Tên đăng nhập từ 10-20 ký tự")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_])[\\S]+$", message = "Mật khẩu phải chứa ít nhất chữ thường, chữ hoa, chữ số và ký tự đặc biệt không chưa khoảng trắng")
    private String password;

    @NotNull
    @NotBlank(message = "Email không được để trống")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@gmail.com$", message = "email phải đúng định dạng vd: nguyenvan@gmail.com")
    private String email;

    @NotNull
    @NotBlank(message = "Số điện thoại không được để trống")
    @Size(min = 10, max = 12)
    @Pattern(regexp = "^(0|\\+?84)(\\d){9}$", message = "Số điện thoại không đúng")
    private String phone;

    private Role role;
    @NotNull
    @NotBlank(message = "Họ không được để trống")
    @Pattern(regexp = "^[a-zA-ZÀ-ỹ]+([ ][a-zA-ZÀ-ỹ]+)*$", message = "Họ không đúng")
    @Length(min = 2, message = "Họ của bạn quá ngắn")
    @Length(max = 20, message = "Họ của bạn quá dài")
    private String firstName;

    @NotNull
    @NotBlank(message = "Tên không được để trống")
    @Pattern(regexp = "^[a-zA-ZÀ-ỹ]+([ ][a-zA-ZÀ-ỹ]+)*$", message = "Tên không đúng")
    @Length(min = 2, message = "Tên của bạn quá ngắn")
    @Length(max = 20, message = "Tên của bạn quá dài")
    private String lastName;

    @NotNull
    @NotBlank(message = "Địa chỉ không được để trống")
    @Length(min = 20, message = "Tên địa chỉ quá ngắn")
    @Length(max = 50, message = "Tên địa chỉ quá dài")
    private String address;

    public UserRegisterForm() {}

    public UserRegisterForm(String userName, String password, String email, String phone, Role role, String firstName, String lastName, String address) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
