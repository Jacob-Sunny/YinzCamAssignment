package com.login;

import com.Message.Message;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDao {
  public int Login(Login login) throws ClassNotFoundException {

    String INSERT_MESSAGE = "INSERT INTO login" +
      " (Username, Password) VALUES " +
      "(?,?);";

    int result = 0;
    Class.forName("com.mysql.jdbc.Driver");

    try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatapplication?useSSL=false","root","root");

        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_MESSAGE)){
      preparedStatement.setString(1, login.getUsername());
      preparedStatement.setString(2, login.getPassword());

      System.out.println(preparedStatement);
      result = preparedStatement.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return result;
  }


}
