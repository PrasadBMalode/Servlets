package com.xworkz.snapchat.servlet;

import com.xworkz.snapchat.dto.SnapchatDto;
import com.xworkz.snapchat.service.SnapchatValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/snapchatServlet", loadOnStartup = 1)
public class SnapchatServlet  extends HttpServlet {
    public SnapchatServlet(){
        System.out.println("object creted of SnapchatServlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("its do post method of SnapchatServlet");

        String name=req.getParameter("name");
        long number=Long.parseLong(req.getParameter("number"));
        String password=req.getParameter("pasword");
        System.out.println(name);
        System.out.println(number);
        System.out.println(password);

        SnapchatDto snapchatDto=new SnapchatDto(name,number,password);
        SnapchatValidation snapchatValidation=new SnapchatValidation();
        boolean isValidation=snapchatValidation.displaySnapchatValidation(snapchatDto);

        PrintWriter printWriter=resp.getWriter();
        if (isValidation){
            printWriter.println("Hi..."+name);
            printWriter.println("Sucessfully registered...");
        }else {
            printWriter.println("invalid data...");
        }

    }
}