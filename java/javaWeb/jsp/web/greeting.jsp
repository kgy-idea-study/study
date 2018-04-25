<%@ page import="java.util.Locale" %>
<%@ page import="java.util.Calendar" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2018/1/3
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Locale locale = request.getLocale();
    Calendar calendar = Calendar.getInstance(locale);
    int hour = calendar.get(Calendar.HOUR_OF_DAY);
    String greeting = "";

    if (hour <= 6) {
        greeting = "凌晨好，您该睡觉了。良好的睡眠是美好一天的开始。";
    } else if (hour <= 9) {
        greeting = "早上好。早餐应该注意营养。";
    } else if (hour <= 12) {
        greeting = "上午好。工作时注意保护眼睛。";
    } else if (hour <= 18) {
        greeting = "下午好。小心工作中打瞌睡。";
    } else if (hour <= 24) {
        greeting = "晚上好。放松一下自己，好好休息。睡觉不要太晚啊~~";
    } else {

    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td><%= greeting %>
        </td>
    </tr>
</table>
</body>
</html>
