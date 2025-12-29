package com.xworkz.materimony.servlet;

import com.xworkz.materimony.dto.MatrimonyDTO;
import com.xworkz.materimony.service.MatrimonyValidation;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/matrimonyServlet", loadOnStartup = 1)
public class MatrimonyServlet extends GenericServlet {

    public MatrimonyServlet(){
        System.out.println("object created of MatrimonyServlet...");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String userName=servletRequest.getParameter("userName");
        String userEmail=servletRequest.getParameter("userEmail");
        int age=Integer.parseInt(servletRequest.getParameter("age"));
        System.out.println("user Email=="+userEmail);
        System.out.println("User name=="+userName);
        System.out.println("User age=="+age);

        MatrimonyDTO matrimonyDTO=new MatrimonyDTO(age,userEmail,userName);
        MatrimonyValidation matrimonyValidation=new MatrimonyValidation();
        boolean isCondition=matrimonyValidation.isValidate(matrimonyDTO);
        PrintWriter printWriter=servletResponse.getWriter();
        if (isCondition){

            printWriter.println("successfull register");
        }else {


        printWriter.println("invalid data..");
        }

    }
}
