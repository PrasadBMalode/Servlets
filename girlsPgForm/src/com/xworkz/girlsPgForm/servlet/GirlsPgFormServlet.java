package com.xworkz.girlsPgForm.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/girlsPgFormServlet", loadOnStartup = 1)
public class GirlsPgFormServlet extends GenericServlet {

    public GirlsPgFormServlet(){
        System.out.println("object created..");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String state=servletRequest.getParameter("State");
        System.out.println("Guest state: "+state);

        String guestName=servletRequest.getParameter("guestName");
        System.out.println("guest Name: "+guestName);

        String fatherName=servletRequest.getParameter("fatherName");
        System.out.println("Father Name: "+fatherName);

        String motherName=servletRequest.getParameter("motherName");
        System.out.println("Mother Name: "+motherName);

        String date=servletRequest.getParameter("date");
        System.out.println("Date Of Birth: "+date);

        String age=servletRequest.getParameter("age");
        System.out.println("Age: "+age);

        String guestNumber=servletRequest.getParameter("guestNumber");
        System.out.println("guest Number: "+guestNumber);

        String guistEmail=servletRequest.getParameter("guistEmail");
        System.out.println("Guist Email: "+guistEmail);

        String address=servletRequest.getParameter("address");
        System.out.println("Student Address: "+address);

    }
}
