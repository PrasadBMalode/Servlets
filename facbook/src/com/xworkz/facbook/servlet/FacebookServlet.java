package com.xworkz.facbook.servlet;

import com.xworkz.facbook.dto.FacbookDTO;
import com.xworkz.facbook.service.FacbookValidation;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/facbook", loadOnStartup = 1)
public class FacebookServlet extends GenericServlet {
    public FacebookServlet(){
        System.out.println("facbook object created ");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String name=servletRequest.getParameter("userName");
     int age=Integer.parseInt(servletRequest.getParameter("userAge"));
        String mail=servletRequest.getParameter("userMail");

        System.out.println("user name="+name);
        System.out.println("user age="+age);
        System.out.println("user mail="+mail);

        FacbookDTO facbookDTO=new FacbookDTO(age,mail,name);
        FacbookValidation facbookValidation=new FacbookValidation();
        boolean validation=facbookValidation.displayValidation(facbookDTO);
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
