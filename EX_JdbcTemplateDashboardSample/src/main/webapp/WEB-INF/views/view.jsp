<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

내용보기<br>
<hr>
작성자 : ${dto.writer} <br>
제목 : ${dto.title} <br>
내용 : ${dto.content} <br>
<hr>
<br>
<a href="list">목록보기</a>
<p><a href="writeForm">글작성</a></p>
</body>
</html>