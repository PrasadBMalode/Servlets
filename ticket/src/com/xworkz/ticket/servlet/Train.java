package com.xworkz.ticket.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/train",loadOnStartup = 3)
public class Train extends GenericServlet {

    public Train(){
        System.out.println("Train object created");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Train servlet initalized");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method of Train");
    }

    @Override
    public void destroy() {
        System.out.println("destroyed server...");
    }
}