<%@ page import="test.beans.RolesList" %>
<%@ page import="test.entity.RolesEntity" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h4>параметр</h4>
    ${param.idRole}

    <%
        String id = "1";
//        String id = request.getParameter("idRole");

    %>

    <div class="roles_list">
        <h4>Список ролей:</h4>
        <ul class="nav">
            <% RolesList rolesList = new RolesList();
                for (RolesEntity rolesEntity : rolesList.getRoles(id)) {
            %>
            <li><a href="#"><%= rolesEntity.getRoleName()%></a></li>
            <%}%>
        </ul>
    </div>

</body>
</html>
