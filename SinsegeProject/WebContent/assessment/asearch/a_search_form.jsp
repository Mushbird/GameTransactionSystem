<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
request.setCharacterEncoding("euc-kr");
%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
</head>
	<body>
		<form class="navbar navbar-expand-lg navbar-dark bg-dark" action="<%=request.getContextPath()%>/Alist/a_list.sinsege_a" method="post">
			<select class="form-control" name="send">
				<option value="a_date">Date</option>
				<option value="a_id">ID</option>
				<option value="a_goods">Goods Name</option>
				<option value="g_score">Score</option>
				<option value="a_cate">Category</option>
			</select>&nbsp;&nbsp;
			<input class="form-control" type="date" name="send_start">&nbsp;&nbsp;
			<input class="form-control" type="date" name="send_end">&nbsp;&nbsp;
			<input class="form-control" type="text" name="send_tx">&nbsp;
			<input class="btn btn-primary" type="submit" value="검색">&nbsp;
			<a class="form-control btn btn-primary" href="<%=request.getContextPath()%>/Ain/a_insert_form.sinsege_a">작성하기</a>
		</form>
	</body>
</html>