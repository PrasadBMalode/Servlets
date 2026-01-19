package com.xworkz.digitalForm.service;

import com.xworkz.digitalForm.dto.EmailDTO;

public class EmailService {
    public boolean emailValidation(EmailDTO emailDTO) {
        if (emailDTO.getEmail().length() > 3 &&
                emailDTO.getEmail().length() < 15 &&
                emailDTO.getEmail()!=null &&
                emailDTO.getEmail().contains("@gmail.com")) {
            return true;
        } else {
            return false;
        }
    }
}
