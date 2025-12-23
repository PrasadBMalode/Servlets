package com.xworkz.passBook.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/passbook")
public class PassBook extends GenericServlet {

    public  PassBook(){
        System.out.println("Pass book object created...");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("initilization of Pass book");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method of Pass book");
    }

    @Override
    public void destroy() {
        System.out.println("destroyed the server...");
    }
}
