package com.xworkz.friendApp.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/friendAppRegisterForm", loadOnStartup = 1)
public class FriendAppRegisterForm extends GenericServlet {

    public FriendAppRegisterForm(){
        System.out.println("object created...");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String language=servletRequest.getParameter("language");
        System.out.println("user language: "+language);

        String userName=servletRequest.getParameter("userName");
        System.out.println("User name=="+userName);

        String userNumber=servletRequest.getParameter("userNumber");
        System.out.println("user number=="+userNumber);

        String userEmail=servletRequest.getParameter("userEmail");
        System.out.println("user Email=="+userEmail);

        String age=servletRequest.getParameter("age");
        System.out.println("User age=="+age);

        String Country=servletRequest.getParameter("Country");
        System.out.println("User country=="+Country);

        String date= servletRequest.getParameter("date");
        System.out.println("DOB=="+date);

        String gender=servletRequest.getParameter("gender");
        System.out.println("Gender=="+gender);

        String password=servletRequest.getParameter("password");
        System.out.println("Password=="+password);

        String ConfirmPassword=servletRequest.getParameter("ConfirmPassword");
        System.out.println("Confirm Password=="+ConfirmPassword);
    }
}
