package com.xworkz.cookie.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/recive")
public class ReciverServlet extends HttpServlet {
    public ReciverServlet(){
        System.out.println("object created of ReciverServlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie[] cookies = req.getCookies();
        for (Cookie cookie:cookies){
            System.out.println("Name=="+cookie.getName());
            System.out.println("Value=="+cookie.getValue());

            HttpSession session = req.getSession(false);
            String string=(String) session.getAttribute("session");
            System.out.println(string);
        }
    }
}
