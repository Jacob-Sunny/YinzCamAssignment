<%--
  Created by IntelliJ IDEA.
  User: jacob
  Date: 8/30/2020
  Time: 8:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Messages</title>
    <h3 style="text-align: center">Welcome!</h3>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
  <link rel="stylesheet" type="text/css" href="Message.css">

</head>
<body>

<!-- Grid row -->
<div class="row">

  <!-- Grid column -->
  <div class="col-lg-4 col-md-12">

    <!--Card-->
    <div class="card">

      <!--Card image-->
      <div class="view">
        <img src="https://spunout-images.s3.amazonaws.com/spunout/_articleHeader/Article-Cover-CTL-1.png?mtime=20191127110016&focal=none&tmtime=20200415094300" class="card-img-top"
             alt="photo">
        <a href="#">
          <div class="mask rgba-white-slight"></div>
        </a>
      </div>

      <!--Card content-->
      <div class="card-body">
        <form action="Message" method="post">
          <h5>Enter your message</h5>
          <textarea name="PostMessageTextBox" style="resize: none"></textarea>
          <br><br>
          <h5>Enter your hashTags</h5>
          <textarea name="hashtag" style="resize: none"></textarea>

          <input type="submit" value="Post Message">
        </form>
      </div>

    </div>
    <!--/.Card-->

  </div>
  <!-- Grid column -->

  <!-- Grid column -->
  <div class="col-lg-4 col-md-12">

    <!--Panel-->
    <div class="card">
      <h3 class="card-header light-blue lighten-1 white-text text-uppercase font-weight-bold text-center py-5">Message</h3>
      <div class="card-body">
        <form action="Message" method="get">

          <table>
            <tr>
              <td>Enter #</td>
              <td><input type="text" name="hashSearch"></td>
            </tr>
            <tr>
              <td colspan="2"><input type ="submit" value="Search"></td>
            </tr>
          </table>

        </form>
      </div>
    </div>
  </div>
</div>

</body>
</html>
