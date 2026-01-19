package com.xworkz.digitalForm.servlet;

import com.xworkz.digitalForm.dto.NameDTO;
import com.xworkz.digitalForm.service.NameService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/nameServlet", loadOnStartup = 1)
public class NameServlet extends HttpServlet {
    public NameServlet() {
        System.out.println("object created of PaswordServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");

        System.out.println("User Name=" + name);

        NameDTO nameDTO = new NameDTO(name);
        NameService nameService = new NameService();
        boolean isValidation = nameService.nameValidationSave(nameDTO);

        if (isValidation) {
            req.setAttribute("msg", "Hi Your Name Registerd Succecfully");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("rightNameResponce.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            req.setAttribute("msg", "invalid data, Name should be min 3 Max 10, No numbers, No special characters");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("wrongNameResponce.jsp");
            requestDispatcher.forward(req, resp);

        }
    }
}
