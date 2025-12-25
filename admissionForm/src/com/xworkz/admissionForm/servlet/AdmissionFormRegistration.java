package com.xworkz.admissionForm.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/AdmissionFormRegistration", loadOnStartup = 1)
public class AdmissionFormRegistration extends GenericServlet {

    public AdmissionFormRegistration(){
        System.out.println("object created...");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String state=servletRequest.getParameter("State");
        System.out.println("student state: "+state);

        String studentName=servletRequest.getParameter("studentName");
        System.out.println("Student Name: "+studentName);

        String fatherName=servletRequest.getParameter("fatherName");
        System.out.println("Father Name: "+fatherName);

        String motherName=servletRequest.getParameter("motherName");
        System.out.println("Mother Name: "+motherName);

        String date=servletRequest.getParameter("date");
        System.out.println("Date Of Birth: "+date);

        String age=servletRequest.getParameter("age");
        System.out.println("Age: "+age);

        String studentNumber=servletRequest.getParameter("studentNumber");
        System.out.println("Student number: "+studentNumber);

        String studentEmail=servletRequest.getParameter("studentEmail");
        System.out.println("Student Email: "+studentEmail);

        String gender=servletRequest.getParameter("gender");
        System.out.println("Gender: "+gender);

        String address=servletRequest.getParameter("address");
        System.out.println("Student Address: "+address);


    }
}
