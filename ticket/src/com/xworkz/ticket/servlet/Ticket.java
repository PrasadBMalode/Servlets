package com.xworkz.ticket.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/ticket")
public class Ticket extends GenericServlet {

    public Ticket(){
        System.out.println("ticket object created");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("ticket servlet initalized");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method of ticket");
    }

    @Override
    public void destroy() {
        System.out.println("destroyed server...");
    }
}
