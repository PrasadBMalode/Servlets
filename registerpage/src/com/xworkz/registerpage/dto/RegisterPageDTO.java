package com.xworkz.registerpage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RegisterPageDTO {
    private String userName;
    private int age;
    private String email;
    private String password;
    private String confirmPassword;


}
