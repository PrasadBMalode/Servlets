package com.xworkz.twitter.servlet;

import com.xworkz.twitter.dto.TwitterDto;
import com.xworkz.twitter.service.TwitterValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/Twitter", loadOnStartup = 1)
public class TwitterServlet extends HttpServlet {
    public TwitterServlet() {
        System.out.println("object created...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        System.out.println(name);
        System.out.println(email);
        System.out.println(password);

        TwitterDto twitterDto = new TwitterDto(name, email, password);
        TwitterValidation twitterValidation = new TwitterValidation();
        boolean validation = twitterValidation.displayTwitter(twitterDto);
        PrintWriter printWriter = resp.getWriter();
        if (validation) {
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>");
            printWriter.println("srvlet");
            printWriter.println("</title>");
            printWriter.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css' rel='stylesheet'>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("Hi..." + name);
            printWriter.println("<span class='link-success'>Success fully registered</span>");

        } else {
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>");
            printWriter.println("srvlet");
            printWriter.println("</title>");
            printWriter.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css' rel='stylesheet'>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<span class='link-danger'>Invalid data...</span>");
            printWriter.println("</body>");
        }


    }
}
