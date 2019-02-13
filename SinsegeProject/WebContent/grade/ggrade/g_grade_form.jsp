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
Grade ggrade = (Grade)request.getAttribute("ggrade");
%>
<form action = "<%=request.getContextPath() %>/Ggrade/g_grade_update_pro.sinsege_m" method="post">
<input type="hidden" name="gl_id" value=<%= ggrade.getGl_id() %> readonly>
<input type="hidden" name="g_date" value=<%= ggrade.getGl_date() %> readonly>
<table class="table table-hover">
	<tr class="table-active">
		<td>��� ���� ȭ��</td>
		<td></td>
	</tr>
	<tr>
		<td>�Ǹ��� ����ڵ� : </td>
		<td><input type="text" name="g_grade" value=<%= ggrade.getG_grade() %> readonly></td>
	</tr>
	<tr>	
		<td>��޸� : </td>
		<td><input type="text" name="gl_name" value=<%= ggrade.getGl_name() %>></td>
	</tr>
	<tr>
		<td>��޺� �߰��ݾ� : </td>
		<td><input type="text" name="gl_price" value=<%= ggrade.getGl_price() %>></td>
	</tr>
	
	<tr>
		<td><input type="submit" value="�����Ϸ�"></td>
		<td></td>
	</tr>
</table>
</form>
</body>
</html>