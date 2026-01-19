package com.xworkz.digitalForm.service;

import com.xworkz.digitalForm.dto.AgeDTO;

public class AgeService {
    public boolean ageValidation(AgeDTO ageDTO){
        if (ageDTO.getAge()>18 && ageDTO.getAge()<60){
            return true;
        }else {
            return false;
        }

    }
}
