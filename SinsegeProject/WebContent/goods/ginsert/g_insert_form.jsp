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
<title>��ǰ���ȭ��</title>
</head>
<body>
	<div class="progress">
	  <div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%"></div>
	</div>
<!-- top �κ� -->
<%@ include file="/module/top.jsp" %>
<!-- middle �κ� -->	
<form action="<%= request.getContextPath() %>/Gin/g_insert_pro.sinsege" method="post">
<input type="hidden" name="gl_name" value="<%= gl_name %>">
<input type="hidden" name="g_state" value="�Ǹ���">
<input type="hidden" name="g_id" value = "<%=id %>" readonly> 
<%-- <input type="hidden" name="ora_id" value="<%= id %>"> --%>
<table class="table table-hover">
	<tr class="table-active">
		<td> ��ǰ ��� </td>
		<td></td>
	</tr>
	<tr>
		<td>��ǰ��� :</td>
		<td><%= gl_name %></td>
	</tr>
	<tr>
		<td>��ǰ ī�װ� :</td>
		<td>
			<select name="g_cate">
				<option value="����">����</option>
				<option value="��">��</option>
				<option value="��ű�">��ű�</option>
				<option value="�Ź�">�Ź�</option>
				<option value="�Ҹ�ǰ">�Ҹ�ǰ</option>
			</select>	
		</td>
	</tr>
	<tr>
		<td>��ǰ��  :</td>
		<td><input type="text" name="g_name"></td>
	</tr>
	<tr>
		<td>��    �� :</td>
		<td><input type="text" name="g_price" placeholder=" ���ڸ� �Է�"></td>
	</tr>
	<tr>
		<td>�󼼼��� :</td>
		<td><textarea name="g_detail" rows="3"></textarea></td>
	</tr>
	<tr>
		<td><input type="submit" value="��ǰ��Ϲ�ư"></td>
		<td></td>
	</tr>
</table>
</form>
</body>
</html>