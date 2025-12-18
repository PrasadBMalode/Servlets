package com.xworkz.api.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/mobile", loadOnStartup = 6)
public class MobileServlet extends GenericServlet {
    public MobileServlet(){
        System.out.println("mobile object created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {

    }
}
