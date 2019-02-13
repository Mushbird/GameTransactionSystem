<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%	String id  = (String)session.getAttribute("m_id");
	System.out.println(id+"<--id g_insert_form.jsp");
	String gl_name = (String)session.getAttribute("gl_name");
	System.out.println(gl_name +"<--gl_name g_insert_form.jsp");
	
%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>상품등록화면</title>
</head>
<body>
	<div class="progress">
	  <div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%"></div>
	</div>
<!-- top 부분 -->
<%@ include file="/module/top.jsp" %>
<!-- middle 부분 -->	
<form action="<%= request.getContextPath() %>/Gin/g_insert_pro.sinsege" method="post">
<input type="hidden" name="gl_name" value="<%= gl_name %>">
<input type="hidden" name="g_state" value="판매중">
<input type="hidden" name="g_id" value = "<%=id %>" readonly> 
<%-- <input type="hidden" name="ora_id" value="<%= id %>"> --%>
<table class="table table-hover">
	<tr class="table-active">
		<td> 상품 등록 </td>
		<td></td>
	</tr>
	<tr>
		<td>상품등급 :</td>
		<td><%= gl_name %></td>
	</tr>
	<tr>
		<td>상품 카테고리 :</td>
		<td>
			<select name="g_cate">
				<option value="무기">무기</option>
				<option value="방어구">방어구</option>
				<option value="장신구">장신구</option>
				<option value="신발">신발</option>
				<option value="소모품">소모품</option>
			</select>	
		</td>
	</tr>
	<tr>
		<td>상품명  :</td>
		<td><input type="text" name="g_name"></td>
	</tr>
	<tr>
		<td>가    격 :</td>
		<td><input type="text" name="g_price" placeholder=" 숫자만 입력"></td>
	</tr>
	<tr>
		<td>상세설명 :</td>
		<td><textarea name="g_detail" rows="3"></textarea></td>
	</tr>
	<tr>
		<td><input type="submit" value="상품등록버튼"></td>
		<td></td>
	</tr>
</table>
</form>
</body>
</html>