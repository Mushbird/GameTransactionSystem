<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>상품 삭제 폼</title>
</head>
<body>
<!-- top 부분 -->
<%@ include file="/module/top.jsp" %>
<!-- middle 부분 -->
	<% String g_code = request.getParameter("send_gCode"); %>
	<% String g_name = request.getParameter("send_gName"); %>
	<form action="<%=request.getContextPath()%>/Gdel/g_delete_pro.sinsege" method="post">
	<input type="hidden" name="g_code" value="<%= g_code %>">
	<table class="table table-hover">
		<tr class="table-active">
			<td>삭제하시겠습니까?</td>
		</tr>
		<tr>
			<td>상품코드 : <%= g_code %></td>
		</tr>
		<tr>
			<td>상품명 : <%= g_name %></td>
		</tr>
	</table>
	&nbsp;&nbsp;<input type = "submit" value = "삭제하기">
	</form>
</body>
</html>