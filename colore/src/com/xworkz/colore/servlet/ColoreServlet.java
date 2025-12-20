package com.xworkz.colore.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/colore", loadOnStartup = 1)
public class ColoreServlet extends GenericServlet {

    public ColoreServlet(){
        System.out.println("colore object created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method of colore");
    }
}
