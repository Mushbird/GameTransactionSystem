<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import = "kr.or.sinsege.dto.Grade" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta charset="EUC-KR">
<title>�Ǹ��� ��� ���� ��</title>
</head>
<body>
<!-- top �κ� -->
<%@ include file="/module/top.jsp" %>
<!-- middle �κ� -->
<%
request.setCharacterEncoding("euc-kr");
Grade bgrade = (Grade)request.getAttribute("bgrade");
%>
<form action = "<%=request.getContextPath() %>/Bgrade/b_grade_update_pro.sinsege_m" method="post">
<input type="hidden" name="b_id" value=<%= bgrade.getB_id() %> readonly>
<input type="hidden" name="b_date" value=<%= bgrade.getB_date() %> readonly>
<table class="table table-hover">
	<tr class="table-active">
		<td>��� ���� ȭ��</td>
		<td></td>
	</tr>
	<tr>
		<td>������ ����ڵ� : </td>
		<td><input type="text" name="b_grade" value=<%= bgrade.getB_grade() %> readonly></td>
	</tr>
	<tr>	
		<td>��޸� : </td>
		<td><input type="text" name="b_name" value=<%= bgrade.getB_name() %>></td>
	</tr>
	<tr>
		<td>��� ���� : </td>
		<td><input type="text" name="b_count" value=<%= bgrade.getB_count() %>></td>
	</tr>
	<tr>
		<td>���� ������ : </td>
		<td><input type="text" name="b_per" value=<%= bgrade.getB_per() %>></td>
	</tr>
	<tr>
		<td><input type="submit" value="�����Ϸ�"></td>
		<td></td>
	</tr>
</table>
</form>
</body>
</html>