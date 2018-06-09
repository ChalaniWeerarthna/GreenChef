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
        urlPatterns = {"/sessionValidate"}
)

public class sessionValidate extends HttpServlet {

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
        HttpSession session = req.getSession();

        if(session.getAttribute("Email")==null){
            out.println("Invalidate login");
        }
        else{
            String name = (String)session.getAttribute("Email");
            out.println("Session is validate "+name);
            RequestDispatcher requestdispatcher = req.getRequestDispatcher("/Form.html");
            requestdispatcher.forward(req,res);
        }




    }
}
