package com.xworkz.snapchat.servlet;

import com.xworkz.snapchat.dto.InstagramDto;
import com.xworkz.snapchat.service.InstagramValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/instagramServlet", loadOnStartup = 2)
public class InstagramServlet extends HttpServlet {
    public InstagramServlet(){
        System.out.println("object creted of InstagramServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("its do post method of InstagramServlet");

        String name=req.getParameter("name");
        long number=Long.parseLong(req.getParameter("number"));
        String password=req.getParameter("pasword");
        System.out.println(name);
        System.out.println(number);
        System.out.println(password);

        InstagramDto instagramDto=new InstagramDto(name,number,password);
        InstagramValidation instagramValidation=new InstagramValidation();
        boolean isValidation=instagramValidation.displayInstagramValidation(instagramDto);

        PrintWriter printWriter=resp.getWriter();
        if (isValidation){
            printWriter.println("Hi..."+name);
            printWriter.println("Sucessfully registered...");
        }else {
            printWriter.println("invalid data...");
        }

    }
}