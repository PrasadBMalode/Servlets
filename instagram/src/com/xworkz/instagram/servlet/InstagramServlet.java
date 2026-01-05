package com.xworkz.instagram.servlet;

import com.xworkz.instagram.dto.InstagramDto;
import com.xworkz.instagram.service.InstagramValidation;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/instagramServlet", loadOnStartup = 1)
public class InstagramServlet extends GenericServlet {
    public InstagramServlet(){
        System.out.println("object created...");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("userName");
        int age=Integer.parseInt(servletRequest.getParameter("userAge"));
        String location=servletRequest.getParameter("userLocation");
        String number=servletRequest.getParameter("userNumber");

        System.out.println("User name="+name);
        System.out.println("User age="+age);
        System.out.println("user location="+location);
        System.out.println("user number="+number);

        InstagramDto instagramDto=new InstagramDto(age,location,name,number);

        InstagramValidation instagramValidation=new InstagramValidation();
        boolean validation=instagramValidation.displayInstaValidation(instagramDto);

        PrintWriter printWriter=servletResponse.getWriter();

       if (validation){
           printWriter.println("<html>");
           printWriter.println("<head>");
           printWriter.println("<title>");
           printWriter.println("srvlet");
           printWriter.println("</title>");
           printWriter.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css' rel='stylesheet'>");
           printWriter.println("</head>");
           printWriter.println("<body>");
           printWriter.println("Hi..."+name);
           printWriter.println("<span class='link-success'>Success fully registered</span>");
           printWriter.println("</body>");
       }else {
           printWriter.println("<html>");
           printWriter.println("<head>");
           printWriter.println("<title>");
           printWriter.println("srvlet");
           printWriter.println("</title>");
           printWriter.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css' rel='stylesheet'>");
           printWriter.println("</head>");
           printWriter.println("<body>");
           printWriter.println("<span class='link-danger'>Invalid data...</span>");
           printWriter.println("</body>");
       }


    }
}
