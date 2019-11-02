package servlets;

import beans.Authentication;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet("/Controller")
public class Controller extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String user = request.getParameter("user");
        String password = request.getParameter("password");

        Authentication auth = new Authentication();

        if(auth.apiAccess(user,password)){
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("Votation.jsp");
            requestDispatcher.forward(request,response);
            System.out.println(request.getParameter("user"));
            System.out.println(request.getParameter("password"));
        }else{
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/");
            requestDispatcher.forward(request,response);
            System.out.println(request.getParameter("user"));
            System.out.println(request.getParameter("password"));
        }
    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    }
}
