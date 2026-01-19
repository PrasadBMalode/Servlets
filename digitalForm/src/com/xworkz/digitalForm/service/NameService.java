package com.xworkz.digitalForm.service;

import com.xworkz.digitalForm.dto.NameDTO;

public class NameService {
    public boolean nameValidationSave(NameDTO nameDTO){
        if (nameDTO.getName()!=null &&
                nameDTO.getName().length()>3 &&
                nameDTO.getName().length()<10 &&
                nameDTO.getName().matches("[a-zA-Z]+")){
            return true;
        }else {
            return false;
        }

    }
}
