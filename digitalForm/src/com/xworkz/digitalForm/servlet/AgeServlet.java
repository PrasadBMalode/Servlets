package com.xworkz.digitalForm.servlet;

import com.xworkz.digitalForm.dto.AgeDTO;
import com.xworkz.digitalForm.service.AgeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/ageServlet", loadOnStartup = 2)
public class AgeServlet extends HttpServlet {
    public AgeServlet() {
        System.out.println("object created of AgeServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int age = Integer.parseInt(req.getParameter("age"));

        System.out.println("User Age=" + age);

        AgeDTO ageDTO = new AgeDTO(age);
        AgeService ageService = new AgeService();
        boolean isAgeValid = ageService.ageValidation(ageDTO);

        if (isAgeValid) {
            req.setAttribute("msg", "Hi Your Age Registerd Succecfully");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("rightAgeResponce.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            req.setAttribute("msg", "invalid data, Age should be above 18 or Bellow 60");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("wrongAgeResponce.jsp");
            requestDispatcher.forward(req, resp);

        }
    }
}