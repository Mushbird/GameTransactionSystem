<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="kr.or.sinsege.dao.Adao"%>
<%@ page import="kr.or.sinsege.dto.Assessment"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Assessment Update Form</title>
</head>
<body>
<%
	Assessment a = (Assessment)request.getAttribute("a");
	System.out.println(a + " <- a");
	
	String dbno = a.getA_code();
	String dbgoods = a.getA_goods();
	String dbtitle = a.getA_title();
	String dbid = a.getA_id();
	String dbtext = a.getA_text();
	int dbscore = a.getA_score();
	String dbdate = a.getA_date();
	String dbupdate = a.getA_update();
	String dbcate = a.getA_cate();
%>
	<form action="<%= request.getContextPath() %>/Aup/a_update_pro.sinsege_a" method="post">
		<table border="1">
			<tr>
				<td>No</td>
				<td><input type="text" name="a_code" size="20" value="<%= dbno %>" readonly></td>
			<tr>
			<tr>
				<td>Goods Name</td>
				<td><input type="text" name="a_goods" size="20" value="<%= dbgoods %>"></td>
			<tr>
			<tr>
				<td>Title</td>
				<td><input type="text" name="a_title" size="20" value="<%= dbtitle %>"></td>
			<tr>
			<tr>
				<td>Category</td>
				<td><input type="text" name="a_cate" size="20" value="<%= dbcate %>"></td>
			<tr>
			<tr>
				<td>ID</td>
				<td><input type="text" name="a_id" size="20" value="<%= dbid %>" readonly></td>
			<tr>
			<tr>
				<td>Text</td>
				<td><input type="text" name="a_text" size="20" value="<%= dbtext %>"></td>
			<tr>
			<tr>
				<td>Score</td>
				<td><input type="text" name="a_score" size="20" value="<%= dbscore %>"></td>
			<tr>
			<tr>
				<td>Making Date</td>
				<td><input type="text" name="a_date" size="20" value="<%= dbdate %>" readonly></td>
			<tr>
			<tr>
				<td colspan="4"><input type="submit" value="수정"></td>
			</tr>
		</table>
	</form>
</body>
</html>