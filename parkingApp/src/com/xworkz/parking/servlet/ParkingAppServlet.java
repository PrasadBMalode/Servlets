package com.xworkz.parking.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/parking", loadOnStartup = 1)
public class ParkingAppServlet extends HttpServlet {
    public ParkingAppServlet(){
        System.out.println("its ParkingAppServlet servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String password=req.getParameter("password");

        System.out.println(name);
        System.out.println(email);
        System.out.println(password);

        req.setAttribute("message","form submited successfully");
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("ResponsForParking.jsp");
        requestDispatcher.forward(req,resp);

    }
}
