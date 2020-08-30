package com.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.PrintWriter;

@WebServlet(name = "/Login", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {
  LoginDao loginDao = new LoginDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
      PrintWriter out = response.getWriter();
      Login login =  new Login();
    if(username !="" && password !="") {
      login.setUsername(username);
      login.setPassword(password);
      response.sendRedirect("Message.jsp");
    }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
