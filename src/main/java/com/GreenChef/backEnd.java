package com.GreenChef;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        urlPatterns = {"/welcome"}
)

public class backEnd extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Service(request,response);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Service(request,response);

    }

    public void Service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        String email = req.getParameter("email");
        String password = req.getParameter("pass");

        HttpSession session = req.getSession(true);
        session.setAttribute("Email", email);

        RequestDispatcher requestdispatcher = req.getRequestDispatcher("/sessionValidate");
        requestdispatcher.forward(req,res);

        out.println(email);
        out.println(password);

    }
}
