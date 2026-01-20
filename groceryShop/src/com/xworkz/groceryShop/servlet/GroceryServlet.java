package com.xworkz.groceryShop.servlet;

import com.xworkz.groceryShop.customEvent.InvalidDataException;
import com.xworkz.groceryShop.dto.GroceryDTO;
import com.xworkz.groceryShop.service.GroceryService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/groceryServlet")
public class GroceryServlet extends HttpServlet {
    public GroceryServlet() {
        System.out.println("object creted of GroceryServlet");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("productId"));
        String name = req.getParameter("productName");
        int price = Integer.parseInt(req.getParameter("productPrice"));
        float rating = Float.parseFloat(req.getParameter("productRating"));
        String review = req.getParameter("productReview");

        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(rating);
        System.out.println(review);

        GroceryDTO groceryDTO = new GroceryDTO(id, name, price, rating, review);
        GroceryService groceryService = new GroceryService();

        req.setAttribute("ID", id);
        req.setAttribute("Name", name);
        req.setAttribute("Price", price);
        req.setAttribute("Rating", rating);
        req.setAttribute("Review", review);

        try {
            boolean isValid = groceryService.productValidationSave(groceryDTO);

        } catch (InvalidDataException e) {
            throw new RuntimeException(e);

        }

        req.setAttribute("msg", "Your Data is successfully saved...!");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("productInfo.jsp");
        requestDispatcher.forward(req, resp);
    }
}
