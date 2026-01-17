package com.xworkz.parking.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/instgram", loadOnStartup = 4)
public class InstagramServlet extends HttpServlet {
    public InstagramServlet(){
        System.out.println("its InstagramServlet servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String password=req.getParameter("password");

        System.out.println(name);
        System.out.println(email);
        System.out.println(password);

        req.setAttribute("msg","Hi, you successfully registered");
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("instagramResponce.jsp");
        requestDispatcher.forward(req,resp);
    }
}