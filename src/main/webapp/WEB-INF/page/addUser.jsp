<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" isELIgnored="false"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align:center;margin-top:40px">

    <form method="post" action="users">
<%--        user_id： <input name="name" value="" type="text"> <br><br>--%>
        user_name： <input name="name" value="" type="text"> <br><br>
        email： <input name="email" value="" type="text"> <br><br>
        cellphone： <input name="cellphone" value="" type="text"> <br><br>
        password： <input name="password" value="" type="password"> <br><br>
        salt： <input name="salt" value="" type="text"> <br><br>
        state： <input name="state" value="" type="text"> <br><br>
        create_time ： <input name="date" value="<%=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime())%>" type="text"> <br><br>
        <input type="submit" value="注册">
    </form>
</div>
</body>
</html>
