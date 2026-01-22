package com.xworkz.cookie.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/send")
public class SenderServlet extends HttpServlet {
    public SenderServlet(){
        System.out.println("object created of SenderServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        Cookie cookie=new Cookie("recive",name);
        cookie.setMaxAge(60);
        resp.addCookie(cookie);

        HttpSession session = req.getSession();
        session.setAttribute("session",name);


    }
}
