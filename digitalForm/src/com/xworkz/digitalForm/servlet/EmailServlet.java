package com.xworkz.digitalForm.servlet;

import com.xworkz.digitalForm.dto.AgeDTO;
import com.xworkz.digitalForm.dto.EmailDTO;
import com.xworkz.digitalForm.service.AgeService;
import com.xworkz.digitalForm.service.EmailService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/emailServlet", loadOnStartup = 3)
public class EmailServlet extends HttpServlet {
    public EmailServlet() {
        System.out.println("object created of EmailServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");

        System.out.println("User email=" + email);

        EmailDTO emailDTO = new EmailDTO(email);
        EmailService emailService = new EmailService();
        boolean isEmailValid = emailService.emailValidation(emailDTO);

        if (isEmailValid) {
            req.setAttribute("msg", "Hi Your Email Registerd Succecfully");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("rightEmailResponce.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            req.setAttribute("msg", "invalid data, Email length should be min 3 max 15, and it contains '@gmail.com'");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("wrongEmailResponce.jsp");
            requestDispatcher.forward(req, resp);

        }
    }
}