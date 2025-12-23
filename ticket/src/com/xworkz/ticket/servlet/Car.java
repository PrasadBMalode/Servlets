package com.xworkz.ticket.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/car",loadOnStartup = 2)
public class Car extends GenericServlet {

    public Car(){
        System.out.println("Car object created");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Car servlet initalized");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method of Car");
    }

    @Override
    public void destroy() {
        System.out.println("destroyed server...");
    }
}
