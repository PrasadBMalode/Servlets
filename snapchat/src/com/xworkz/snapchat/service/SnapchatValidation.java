package com.xworkz.snapchat.service;

import com.xworkz.snapchat.dto.SnapchatDto;

public class SnapchatValidation {
    public boolean displaySnapchatValidation(SnapchatDto snapchatDto){
        if (snapchatDto.getName()!=null && String.valueOf(snapchatDto.getNumber()).length()==10
                && snapchatDto.getPassword()!=null){
            return true;
        }else {
            return false;
        }
    }
}
