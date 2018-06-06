<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Spring Boot Sample</title>
</head>

<body>
Time: ${time} fdfdfdfdf12
<br>
Message: ${message}

<p>${pageContext.request.contextPath }</p>
<img alt="读取默认配置中的图片" src="${pageContext.request.contextPath }/85487.png">
<br/>
<img alt="读取自定义配置myres中的图片" src="${pageContext.request.contextPath }/myimgs/06de8ddb0d351fa3c49ceed71721148b3bf3f4a03b8e244e675783a712c320c8.jpg">
</body>
</html>