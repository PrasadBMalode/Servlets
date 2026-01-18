package com.xworkz.registerpage.service;

import com.xworkz.registerpage.dto.RegisterPageDTO;

public class RegisterPageValidation {
    String nameValidation = "^[A-Za-z]{3,10}$";
    String emailValidation="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    String passwordValidation = "^[A-Z](?=(?:.*[@#$%^&*!]){2})[A-Za-z0-9@#$%^&*!]{7}$";


    public boolean registerPageValidation(RegisterPageDTO registerPageDTO) {
        String userName = registerPageDTO.getUserName();
        int age = registerPageDTO.getAge();
        String email = registerPageDTO.getEmail();
        String password = registerPageDTO.getPassword();
        String confirmPassword = registerPageDTO.getConfirmPassword();


        if (userName != null && userName.matches(nameValidation)
                && age >= 18 && age <= 60
                && email != null && email.matches(emailValidation)
        && password!=null && password.matches(passwordValidation)
        && confirmPassword!=null && confirmPassword.matches(password)){

            return true;
        }

        return false;

    }
}

//User ame==Prasad                 // 3-10 letters
//Age=23                           // between 18 and 60
//Email=prasadbm666@gmail.com      // valid email
//Password=Sai@!123               // 8+ chars, 1 uppercase, 2 special chars,
//Confirm password=Sai@!123       // exactly matches password


