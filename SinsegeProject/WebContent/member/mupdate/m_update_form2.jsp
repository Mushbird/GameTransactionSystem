<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="kr.or.sinsege.dao.Mdao"%>
<%@ page import="kr.or.sinsege.dto.Member"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta charset="EUC-KR">
<title>ȸ�� ���� ȭ��</title>
</head>
<body>
<!-- top �κ� -->
<%@ include file="/module/top.jsp" %>
<!-- middle �κ� -->
<%
request.setCharacterEncoding("euc-kr");
//mSelectforUpdate �޼��� ȣ�� �� ����
Member member = (Member)request.getAttribute("member");
System.out.println(member + "<- member m_update_form.jsp");

if(session.getAttribute("m_level").equals("������")) {
%>
<form action="<%= request.getContextPath() %>/Mup/m_update_pro.sinsege_m" method="post">
<input type="hidden" name="m_code" value="<%= member.getM_code() %>">
<input type="hidden" name="b_name" value="<%= member.getB_name() %>">
<input type="hidden" name="gl_name" value="<%= member.getGl_name() %>">
<input type="hidden" name="m_id" value="<%= member.getM_id() %>">
<input type="hidden" name="m_count" value="<%= member.getM_count() %>">
<table class="table table-hover">
	<tr class="table-active">
		<td>ȸ�� ���� ȭ��</td>
		<td></td>
	</tr>
	<tr>
		<td>ȸ�� �ڵ� : </td>
		<td><%= member.getM_code() %></td>
	</tr>
	<tr>
		<td>���� ��� : </td>
		<td><%= member.getB_name() %></td>
	</tr>
	<tr>
		<td>�Ǹ� ��� : </td>
		<td><%= member.getGl_name() %></td>
	</tr>
	<tr>
		<td>ȸ�� ID : </td>
		<td><%= member.getM_id() %></td>
	</tr>
	<tr>
		<td>ȸ�� PW : </td>
		<td><input type="text" name="m_pw" size="20" value="<%= member.getM_pw() %>"></td>
	</tr>
	<tr>
		<td>ȸ�� ���� : </td>
		<td>
			<select name="m_level">
				<option value="<%= member.getM_level() %>"><%= member.getM_level() %></option>
				<option value="������">������</option>
				<option value="ȸ��">ȸ��</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>ȸ�� �̸� : </td>
		<td><input type="text" name="m_name" size="20" value="<%= member.getM_name() %>"></td>
	</tr>
	<tr>
		<td>���� ��� : </td>
		<td><input type="text" name="m_gold" size="20" value="<%= member.getM_gold() %>"></td>
	</tr>
	<tr>
		<td>���� ����Ʈ : </td>
		<td><input type="text" name="m_point" size="20" value="<%= member.getM_point() %>"></td>
	</tr>
	<tr>
		<td>���� Ƚ�� : </td>
		<td><%= member.getM_count() %></td>
	</tr>
	<tr>
		<td>���� ���� : </td>
		<td><input type="text" name="m_in" size="20" value="<%= member.getM_in() %>" readonly></td>
	</tr>
	<tr>
		<td>���� ���� : </td>
		<td><input type="text" name="m_date" size="20" value="<%= member.getM_date() %>" readonly></td>
	</tr>
	<tr>
		<td><input type="submit" value="ȸ��������ư"></td>
		<td></td>
	</tr>
</table>
</form>
<%	
} else if(session.getAttribute("m_level").equals("ȸ��")) {
%>
<form action="<%= request.getContextPath() %>/Mup/m_update_pro.sinsege_m" method="post">
<input type="hidden" name="m_code" size="20" value="<%= member.getM_code() %>">
<input type="hidden" name="b_name" value="<%= member.getB_name() %>">
<input type="hidden" name="gl_name" value="<%= member.getGl_name() %>">
<input type="hidden" name="m_date" value="<%= member.getM_date() %>">
<input type="hidden" name="m_level" value="<%= member.getM_level() %>">
<input type="hidden" name="m_gold" value="<%= member.getM_gold() %>">
<input type="hidden" name="m_point" value="<%= member.getM_point() %>">
<input type="hidden" name="m_count" value="<%= member.getM_count() %>">
<table class="table table-hover">
	<tr class="table-active">
		<td>�� ���� ����</td>
		<td></td>
	</tr>
	<tr>
		<td>���� ��� : </td>
		<td><%= member.getB_name() %></td>
	</tr>
	<tr>
		<td>�Ǹ� ��� : </td>
		<td><%= member.getGl_name() %></td>
	</tr>
	<tr>
		<td>ȸ�� ���̵� : </td>
		<td><%= member.getM_id() %></td>
	</tr>
	<tr>
		<td>ȸ�� ��й�ȣ : </td>
		<td><input type="text" name="m_pw" size="20" value="<%= member.getM_pw() %>"></td>
	</tr>
	<tr>
		<td>ȸ�� ���� : </td>
		<td><%= member.getM_level() %></td>
	</tr>
	<tr>
		<td>ȸ�� �̸� : </td>
		<td><input type="text" name="m_name" size="20" value="<%= member.getM_name() %>"></td>
	</tr>
	<tr>
		<td>���� ���  : </td>
		<td><%= member.getM_gold() %></td>
	</tr>
	<tr>
		<td>���� ����Ʈ : </td>
		<td><%= member.getM_point() %></td>
	</tr>
	<tr>
		<td>�� ���� Ƚ�� : </td>
		<td><%= member.getM_count() %></td>
	</tr>
	<tr>
		<td>ȸ�����Գ�¥ : </td>
		<td><input type="text" name="m_in" size="20" value="<%= member.getM_in() %>" readonly></td>
	</tr>
	<tr>
		<td><input type="submit" value="ȸ��������ư"></td>
		<td><a href = "<%=request.getContextPath()%>/Mdel/m_delete_form.sinsege_m?m_code=<%=m_code%>">ȸ��������ư</a></td>
		</td>
	</tr>
</table>
</form>
<%	
}
%>
</body>
</html>