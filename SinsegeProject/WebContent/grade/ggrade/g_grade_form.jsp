<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import = "kr.or.sinsege.dto.Grade" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta charset="EUC-KR">
<title>판매자 등급 수정 폼</title>
</head>
<body>
<!-- top 부분 -->
<%@ include file="/module/top.jsp" %>
<!-- middle 부분 -->
<%
request.setCharacterEncoding("euc-kr");
Grade ggrade = (Grade)request.getAttribute("ggrade");
%>
<form action = "<%=request.getContextPath() %>/Ggrade/g_grade_update_pro.sinsege_m" method="post">
<input type="hidden" name="gl_id" value=<%= ggrade.getGl_id() %> readonly>
<input type="hidden" name="g_date" value=<%= ggrade.getGl_date() %> readonly>
<table class="table table-hover">
	<tr class="table-active">
		<td>등급 수정 화면</td>
		<td></td>
	</tr>
	<tr>
		<td>판매자 등급코드 : </td>
		<td><input type="text" name="g_grade" value=<%= ggrade.getG_grade() %> readonly></td>
	</tr>
	<tr>	
		<td>등급명 : </td>
		<td><input type="text" name="gl_name" value=<%= ggrade.getGl_name() %>></td>
	</tr>
	<tr>
		<td>등급별 추가금액 : </td>
		<td><input type="text" name="gl_price" value=<%= ggrade.getGl_price() %>></td>
	</tr>
	
	<tr>
		<td><input type="submit" value="수정완료"></td>
		<td></td>
	</tr>
</table>
</form>
</body>
</html>