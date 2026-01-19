package com.xworkz.digitalForm.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class PasswordDTO {
    private String password;
    private String confirmPassword;

}
