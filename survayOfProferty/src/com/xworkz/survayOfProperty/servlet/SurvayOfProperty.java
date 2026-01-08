package com.xworkz.survayOfProperty.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/survayOfProperty", loadOnStartup = 2)
public class SurvayOfProperty extends HttpServlet {
    public SurvayOfProperty(){
        System.out.println("object created of Servay...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String registration=req.getParameter("registration");
        String age=req.getParameter("age");
        String fatherName=req.getParameter("fatherName");
        String motherName=req.getParameter("motherName");
        String location=req.getParameter("location");
        String email=req.getParameter("email");
        String newPassword=req.getParameter("newPassword");
        String confirmPassword=req.getParameter("confirmPassword");
        String check=req.getParameter("check");

        System.out.println("Name=="+name);
        System.out.println("Registration=="+registration);
        System.out.println("Age=="+age);
        System.out.println("Father name=="+fatherName);
        System.out.println("Mother name=="+motherName);
        System.out.println("Location=="+location);
        System.out.println("Email=="+email);
        System.out.println("New Password=="+newPassword);
        System.out.println("Cinfirm password=="+confirmPassword);
        System.out.println("Check=="+check);

        PrintWriter printWriter=resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>");
        printWriter.println("srvlet");
        printWriter.println("</title>");
        printWriter.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css' rel='stylesheet'>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("Hi..."+name);
        printWriter.println("<span class='link-success'>You are Success fully registered</span>");
        printWriter.println("</body>");




    }
}