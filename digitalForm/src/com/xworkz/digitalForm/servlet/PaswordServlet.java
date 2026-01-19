package com.xworkz.digitalForm.servlet;

import com.xworkz.digitalForm.dto.PasswordDTO;
import com.xworkz.digitalForm.service.PasswordService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/paswordServlet", loadOnStartup = 4)
public class PaswordServlet extends HttpServlet {
    public PaswordServlet() {
        System.out.println("object created of PaswordServlet");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        System.out.println("User Password=" + password);
        System.out.println("User Confirm password=" + confirmPassword);

        PasswordDTO passwordDTO = new PasswordDTO(password, confirmPassword);
        PasswordService passwordService = new PasswordService();
        boolean isValidation = passwordService.passwordValidation(passwordDTO);

        if (isValidation) {
            req.setAttribute("msg", "Hi Your Password Registerd Succecfully");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("rightPasswordResponce.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            req.setAttribute("msg", "invalid data, Password should be 1st letter UpperCase and two special charecters," +
                    " total length 8 and match for confirm password also...");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("wrongPasswordResponce.jsp");
            requestDispatcher.forward(req, resp);

        }
    }
}