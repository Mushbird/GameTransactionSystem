<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��ǰ ���� ��</title>
</head>
<body>
<!-- top �κ� -->
<%@ include file="/module/top.jsp" %>
<!-- middle �κ� -->
	<% String g_code = request.getParameter("send_gCode"); %>
	<% String g_name = request.getParameter("send_gName"); %>
	<form action="<%=request.getContextPath()%>/Gdel/g_delete_pro.sinsege" method="post">
	<input type="hidden" name="g_code" value="<%= g_code %>">
	<table class="table table-hover">
		<tr class="table-active">
			<td>�����Ͻðڽ��ϱ�?</td>
		</tr>
		<tr>
			<td>��ǰ�ڵ� : <%= g_code %></td>
		</tr>
		<tr>
			<td>��ǰ�� : <%= g_name %></td>
		</tr>
	</table>
	&nbsp;&nbsp;<input type = "submit" value = "�����ϱ�">
	</form>
</body>
</html>