package com.xworkz.snapchat.service;

import com.xworkz.snapchat.dto.InstagramDto;

public class InstagramValidation {
    public boolean displayInstagramValidation(InstagramDto instagramDto){
        if (instagramDto.getName()!=null && String.valueOf(instagramDto.getNumber()).length()==10
             && instagramDto.getPassword()!=null){
            return true;
        }else {
            return false;
        }
    }
}

//validation logic
//if (netflixDto.getName() != null && !netflixDto.getName().isEmpty()
//                && String.valueOf(netflixDto.getPhNumber()).length() == 10
//        && String.valueOf(netflixDto.getOtp()).length() == 4
//        && netflixDto.getIdType() != null && !netflixDto.getIdType().isEmpty()
//                && String.valueOf(netflixDto.getIdNumber()).length() == 12) {