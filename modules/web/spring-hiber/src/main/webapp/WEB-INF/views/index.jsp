<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<html>
<body>
<h2>Check Login</h2>
<table>
    <c:choose>
        <c:when test="${result}">
            <tr>
                <td colspan="2">
                    User exists
                </td>
            </tr>
        </c:when>
        <c:when test="${!result}">
            <tr>
                <td colspan="2">
                    User does't exist
                </td>
            </tr>
        </c:when>
    </c:choose>
    <tr>
        <td><label for="login">Login</label></td>
        <td><input id="login"></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="button" value="Submit"
                   onclick="document.location.href = '/checkLogin?login='+document.getElementById('login').value"/>
        </td>
    </tr>
</table>
<script>

</script>
</body>
</html>
