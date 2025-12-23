package com.xworkz.ticket.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/bus",loadOnStartup = 1)
public class Bus extends GenericServlet {

    public Bus(){
        System.out.println("Bus object created");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Bus servlet initalized");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method of Bus");
    }

    @Override
    public void destroy() {
        System.out.println("destroyed server...");
    }
}