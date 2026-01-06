package com.xworkz.twitter.service;

import com.xworkz.twitter.dto.TwitterDto;

public class TwitterValidation {
    public boolean displayTwitter(TwitterDto twitterDto){
        if (twitterDto.getName()!=null && twitterDto.getEmail()!=null && twitterDto.getPassword()!=null){
            return true;
        }else {
            return false;
        }
    }
}
