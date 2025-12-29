package com.xworkz.materimony.service;

import com.xworkz.materimony.dto.MatrimonyDTO;

public class MatrimonyValidation {
    public boolean isValidate(MatrimonyDTO matrimonyDTO){
        if (matrimonyDTO.getAge()>22 && matrimonyDTO.getName().length()>5 && matrimonyDTO.getEmail()!=null){
            return true;
        }
        return false;
    }
}
