package com.Message;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessageDao {

  public int Message(Message message) throws ClassNotFoundException {

    String INSERT_MESSAGE = "INSERT INTO message" +
      " (Message, HashTags) VALUES " +
      "(?,?);";

      int result = 0;
      Class.forName("com.mysql.jdbc.Driver");

      try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatapplication?useSSL=false","root","root");

          PreparedStatement preparedStatement = connection.prepareStatement(INSERT_MESSAGE)){
          preparedStatement.setString(1, message.getMessage());
          preparedStatement.setString(2, message.getHashtag());

          System.out.println(preparedStatement);
          result = preparedStatement.executeUpdate();

      } catch (SQLException e) {
        e.printStackTrace();
      }
      return result;
  }

}
