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
Grade bgrade = (Grade)request.getAttribute("bgrade");
%>
<form action = "<%=request.getContextPath() %>/Bgrade/b_grade_update_pro.sinsege_m" method="post">
<input type="hidden" name="b_id" value=<%= bgrade.getB_id() %> readonly>
<input type="hidden" name="b_date" value=<%= bgrade.getB_date() %> readonly>
<table class="table table-hover">
	<tr class="table-active">
		<td>등급 수정 화면</td>
		<td></td>
	</tr>
	<tr>
		<td>구매자 등급코드 : </td>
		<td><input type="text" name="b_grade" value=<%= bgrade.getB_grade() %> readonly></td>
	</tr>
	<tr>	
		<td>등급명 : </td>
		<td><input type="text" name="b_name" value=<%= bgrade.getB_name() %>></td>
	</tr>
	<tr>
		<td>등급 기준 : </td>
		<td><input type="text" name="b_count" value=<%= bgrade.getB_count() %>></td>
	</tr>
	<tr>
		<td>가격 할인율 : </td>
		<td><input type="text" name="b_per" value=<%= bgrade.getB_per() %>></td>
	</tr>
	<tr>
		<td><input type="submit" value="수정완료"></td>
		<td></td>
	</tr>
</table>
</form>
</body>
</html>