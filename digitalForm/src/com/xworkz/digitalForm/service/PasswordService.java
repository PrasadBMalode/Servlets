package com.xworkz.digitalForm.service;

import com.xworkz.digitalForm.dto.PasswordDTO;

public class PasswordService {
    public boolean passwordValidation(PasswordDTO passwordDTO) {
        String password = passwordDTO.getPassword();
        String confirmPassword = passwordDTO.getConfirmPassword();

        if (password != null
                && password.length() == 8
                && Character.isUpperCase(password.charAt(0))
                && password.replaceAll("[a-zA-Z0-9]", "").length() >= 2
                && password.equals(confirmPassword)) {
            return true;
        } else {
            return false;
        }

    }
}
