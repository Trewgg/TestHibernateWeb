<%@ page import="test.beans.UsersList" %>
<%@ page import="test.entity.UsersEntity" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

    <div class="sidebar1">
      <h4>Список:</h4>
      <ul class="nav">
        <% UsersList userList = new UsersList();
          for (UsersEntity usersEntity : userList.getUsers()) {
        %>
        <li><a href="#"><%= usersEntity.getUserName()%></a></li>
        <%}%>
      </ul>
      <p>&nbsp;</p>
    </div>

  </body>
</html>
