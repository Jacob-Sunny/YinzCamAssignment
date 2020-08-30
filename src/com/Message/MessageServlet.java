package com.Message;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;

@WebServlet(name = "/Message", urlPatterns = {"/Message"})
public class MessageServlet extends HttpServlet {
 MessageDao messageDao = new MessageDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      String message = request.getParameter("PostMessageTextBox");
      String hashtag = request.getParameter("hashtag");
      Message message1 =  new Message();

      if(message!="" && hashtag !="") {
        message1.setMessage(message);
        message1.setHashtag(hashtag);

        try {
          messageDao.Message(message1);
        } catch (ClassNotFoundException e) {
          e.printStackTrace();
        }
        response.sendRedirect("Message.jsp");
      }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      PrintWriter out=response.getWriter();
      String hashTagSearch = request.getParameter("hashSearch");
      out.print("<h1>Display Messages</h1>");
      out.print("<table border='1'><tr><th>Message</th><th>#</th></tr>");

      try {
        Class.forName(("com.mysql.cj.jdbc.Driver"));
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatapplication", "root", "root");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select Message,HashTags from message where HashTags='"+ hashTagSearch +"'");
        while(rs.next()){
          out.print("<tr><td>");
          out.print(rs.getString(1));
          out.print("</td>");
          out.print("<td>");
          out.print(rs.getString(2));
          out.print("</td>");
          out.print("</tr>");
        }
      }catch(Exception p){
        System.out.println(p);
      }
      out.print("</table>");

    }
}
