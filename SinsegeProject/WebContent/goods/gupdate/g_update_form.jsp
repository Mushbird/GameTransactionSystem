<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import = "kr.or.sinsege.dto.Goods" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>상품 수정 폼</title>
</head>
<body>
<!-- top 부분 -->
<%@ include file="/module/top.jsp" %>
<!-- middle 부분 -->
<%
	Goods goods = new Goods();
	goods = (Goods)request.getAttribute("goods");
	System.out.println(goods+"<--goods g_update_form.jsp");
%>
<form action="<%= request.getContextPath() %>/Gup/g_update_pro.sinsege" method="post">
<input type="hidden" name="g_code" value="<%= goods.getG_code() %>">
<input type="hidden" name="gl_name" value="<%= goods.getGl_name() %>">
<input type="hidden" name="g_state" value="<%= goods.getG_state() %>">
<input type="hidden" name="g_id" value="<%= goods.getG_id() %>" readonly>
<table class="table table-hover">
	<tr class="table-active">
		<td>상품 수정 화면</td>
		<td></td>
	</tr>
	<tr>
		<td>판매자ID</td>
		<td><%= goods.getG_id() %></td>
	</tr>
	<tr>
		<td>상품코드</td>
		<td><%= goods.getG_code() %></td>
	</tr>
	<tr>
		<td>상품등급</td>
		<td><%= goods.getGl_name() %></td>
	</tr>
	<tr>
		<td>카테고리</td>
		<td>
			<select name="g_cate">
				<option value="<%= goods.getG_cate() %>"><%= goods.getG_cate() %></option>
				<option value="무기">무기</option>
				<option value="방어구">방어구</option>
				<option value="신발">신발</option>
				<option value="장신구">장신구</option>
				<option value="소비">소비</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>상품명</td>
		<td><input type="text" name="g_name" size="20" value="<%= goods.getG_name() %>"></td>
	</tr>
	<tr>
		<td>가	격</td>
		<td><input type="text" name="g_price" size="20" value="<%= goods.getG_price() %>"></td>
	</tr>
	<tr>
		<td>상세설명</td>
		<td><input type="text" name="g_detail" size="20" value="<%= goods.getG_detail() %>"></td>
	</tr>
	<tr>
		<td>상품등록일자</td>
		<td><input type="text" name="g_date" size="20" value="<%= goods.getG_date().substring(0, 10) %>" readonly></td>
	</tr>
	<tr>
		<td>상품수정일자</td>
		<td><input type="text" name="g_update" size="20" value="<%= goods.getG_update().substring(0, 10) %>" readonly></td>
	</tr>
	<tr>
		<td><input type="submit" value="상품수정버튼"></td>
		<td></td>
	</tr>
</table>
</form>
</body>
</html>