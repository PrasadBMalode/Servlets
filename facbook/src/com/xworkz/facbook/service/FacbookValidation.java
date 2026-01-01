package com.xworkz.facbook.service;

import com.xworkz.facbook.dto.FacbookDTO;

public class FacbookValidation {
    public boolean displayValidation(FacbookDTO facbookDTO){
        if (facbookDTO.getName()!=null && facbookDTO.getAge()>22 && facbookDTO.getMail()!=null){
            return true;
        }else {
            return false;
        }

    }
}
