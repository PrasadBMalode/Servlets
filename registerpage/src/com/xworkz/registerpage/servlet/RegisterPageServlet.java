package com.xworkz.registerpage.servlet;

import com.xworkz.registerpage.dto.RegisterPageDTO;
import com.xworkz.registerpage.service.RegisterPageValidation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/registerpage", loadOnStartup = 1)
public class RegisterPageServlet extends HttpServlet {

    public RegisterPageServlet(){
        System.out.println("RegisterPageServlet object created");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("username");
        int age=Integer.parseInt(req.getParameter("age"));
        String email=req.getParameter("useremail");
        String password=req.getParameter("password");
        String confirmPassword=req.getParameter("ConfirmPassword");

        System.out.println("User name=="+name);
        System.out.println("Age="+age);
        System.out.println("Email="+email);
        System.out.println("Password="+password);
        System.out.println("Confirm password="+confirmPassword);

        RegisterPageDTO registerPageDTO=new RegisterPageDTO(name,age,email,password,confirmPassword);
        RegisterPageValidation registerPageValidation=new RegisterPageValidation();
        boolean isValid=registerPageValidation.registerPageValidation(registerPageDTO);

if (isValid){
    req.setAttribute("msg","Hi You successfully registered");
   RequestDispatcher requestDispatcher= req.getRequestDispatcher("registerSuccess.jsp");
   requestDispatcher.forward(req,resp);
}else {
    req.setAttribute("msg","You Entered Invalid data");
    RequestDispatcher requestDispatcher=req.getRequestDispatcher("registerInvalid.jsp");
    requestDispatcher.forward(req,resp);
}



    }
}
