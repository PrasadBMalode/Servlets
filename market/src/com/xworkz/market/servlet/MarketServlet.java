package com.xworkz.market.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/market",loadOnStartup = 1)
public class MarketServlet extends GenericServlet {

    public MarketServlet(){
        System.out.println("object created of Market....");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("initilized method of market...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method of market...");
    }

    @Override
    public void destroy() {
        System.out.println("destroyed of market....");
    }
}
