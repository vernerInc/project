<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<html>
<body>
<h2>Check Login</h2>
<table>
    <c:if test="${result != null}">
        <c:choose>
            <c:when test="${result}">
                <tr>
                    <td colspan="2">
                        Success
                    </td>
                </tr>
            </c:when>
            <c:when test="${!result}">
                <tr>
                    <td colspan="2">
                        Not Success
                    </td>
                </tr>
            </c:when>
        </c:choose>
    </c:if>
    <tr>
        <td><label for="login">Login</label></td>
        <td><input type="text" id="login" value="${user.login}"></td>
    </tr>
    <tr>
        <td><label for="password">Password</label></td>
        <td><input type="password" id="password"></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="button" value="Submit"
                   onclick="document.location.href = '/checkLogin?login='+document.getElementById('login').value + '&password='+document.getElementById('password').value"/>
        </td>
    </tr>
</table>
<script>

</script>
</body>
</html>
