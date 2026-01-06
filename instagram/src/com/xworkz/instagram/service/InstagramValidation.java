package com.xworkz.instagram.service;

import com.xworkz.instagram.dto.InstagramDto;

public class InstagramValidation {
    public boolean displayInstaValidation(InstagramDto instagramDto) {

        if (instagramDto == null) {
            return false;
        }

        return instagramDto.getName() != null && !instagramDto.getName().isEmpty()
                && instagramDto.getAge() > 20
                && instagramDto.getLocation() != null && !instagramDto.getLocation().isEmpty()
                && instagramDto.getNumber() != null;
    }
}

