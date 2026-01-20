package com.xworkz.groceryShop.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ProductInfoServlet")
public class ProductInfoServlet extends HttpServlet {
    public ProductInfoServlet(){
        System.out.println("object created of ProductInfoServlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("productInfo.jsp");
        requestDispatcher.forward(req,resp);
    }
}
