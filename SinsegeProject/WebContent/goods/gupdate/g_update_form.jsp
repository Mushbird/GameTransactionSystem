<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import = "kr.or.sinsege.dto.Goods" %>    
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
		<td>��ǰ ���� ȭ��</td>
		<td></td>
	</tr>
	<tr>
		<td>�Ǹ���ID</td>
		<td><%= goods.getG_id() %></td>
	</tr>
	<tr>
		<td>��ǰ�ڵ�</td>
		<td><%= goods.getG_code() %></td>
	</tr>
	<tr>
		<td>��ǰ���</td>
		<td><%= goods.getGl_name() %></td>
	</tr>
	<tr>
		<td>ī�װ�</td>
		<td>
			<select name="g_cate">
				<option value="<%= goods.getG_cate() %>"><%= goods.getG_cate() %></option>
				<option value="����">����</option>
				<option value="��">��</option>
				<option value="�Ź�">�Ź�</option>
				<option value="��ű�">��ű�</option>
				<option value="�Һ�">�Һ�</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>��ǰ��</td>
		<td><input type="text" name="g_name" size="20" value="<%= goods.getG_name() %>"></td>
	</tr>
	<tr>
		<td>��	��</td>
		<td><input type="text" name="g_price" size="20" value="<%= goods.getG_price() %>"></td>
	</tr>
	<tr>
		<td>�󼼼���</td>
		<td><input type="text" name="g_detail" size="20" value="<%= goods.getG_detail() %>"></td>
	</tr>
	<tr>
		<td>��ǰ�������</td>
		<td><input type="text" name="g_date" size="20" value="<%= goods.getG_date().substring(0, 10) %>" readonly></td>
	</tr>
	<tr>
		<td>��ǰ��������</td>
		<td><input type="text" name="g_update" size="20" value="<%= goods.getG_update().substring(0, 10) %>" readonly></td>
	</tr>
	<tr>
		<td><input type="submit" value="��ǰ������ư"></td>
		<td></td>
	</tr>
</table>
</form>
</body>
</html>