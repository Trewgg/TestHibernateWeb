<%@ page import="test.beans.UsersList" %>
<%@ page import="test.entity.UsersEntity" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Заголовок страницы</title>
  </head>
  <body>

  <div class="container">

    <div class="sidebar1">
        <h4>Список пользователей:</h4>
        <ul class="nav">
            <%--<jsp:useBean id="userList" class="test.beans.UsersList" scope="page"/>--%>

            <% UsersList userList = new UsersList();
                for (UsersEntity usersEntity : userList.getUsersList()) {
            %>
            <li><a href="pages/main.jsp?idRole=<%=usersEntity.getIdrole()%>"><%= usersEntity.getUserName()%></a></li>
            <%}%>
      </ul>
    </div>

  </div>

  </body>
</html>
