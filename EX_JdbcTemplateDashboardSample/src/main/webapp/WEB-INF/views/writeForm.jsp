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
<table width="1000" cellpadding="0" cellspacing="0" bordor="1">
	<form action="write" method="post">
	<tr>
		<td> 작성자 </td>
		<td> <input type="text" name="writer" size="100"> </td>
	</tr>
	<tr>
		<td> 제목 </td>
		<td> <input type="text" name="title" size="100"> </td>
	</tr>
	<tr>	
		<td> 내용 </td>
		<td> <input type="text" name="content" size="100"> </td>
	</tr>
	<tr>
		<td> <input type="submit" value="입력"> &nbsp;&nbsp;<a href="list">목록보기</a>
		</td>
	</tr>
	</form>
</table>
</body>
</html>