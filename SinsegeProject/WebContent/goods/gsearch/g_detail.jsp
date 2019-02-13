<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import = "kr.or.sinsege.dto.Goods" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��ǰ �󼼺��� ��</title>
</head>
<body>
<!-- top �κ� -->
<%@ include file="/module/top.jsp" %>
<!-- middle �κ� -->
<%
	Goods goods = new Goods();
	goods = (Goods)request.getAttribute("goods");
	String o_total = (String)request.getAttribute("o_total");
	System.out.println(goods+"<--goods g_update_form.jsp");
	System.out.println(o_total+"<--o_total g_update_form.jsp");
%>
<form action="<%= request.getContextPath() %>/Oin/o_list_pro.sinsege_o" method="post">
<input type="hidden" name="g_code" value="<%= goods.getG_code() %>">
<input type="hidden" name="gl_name" value="<%= goods.getGl_name() %>">
<input type="hidden" name="g_name" value="<%= goods.getG_name() %>">
<input type="hidden" name="g_state" value="<%= goods.getG_state() %>">
<input type="hidden" name="g_price" value="<%= goods.getG_price() %>">
<input type="hidden" name="o_total" value="<%= o_total %>">
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
		<td><%= goods.getG_cate() %></td>
	</tr>
	<tr>
		<td>��ǰ��</td>
		<td><%= goods.getG_name() %></td>
	</tr>
	<tr>
		<td>�� ����</td>
		<td><%= o_total %></td>
	</tr>
	<tr>
		<td>�󼼼���</td>
		<td><%= goods.getG_detail() %></td>
	</tr>
	<tr>
		<td>��ǰ�������</td>
		<td><%= goods.getG_date().substring(0, 10) %></td>
	</tr>
	<tr>
		<td>��ǰ��������</td>
		<td><%= goods.getG_update().substring(0, 10) %></td>
	</tr>
<%
	/* ���� */
	
	// 1. �Ǹ��� (������ �Ǵ� �Ǹ��� ���̵� �ش�)�ΰ��
	if(m_level.equals("������") || goods.getG_id().equals(m_id)){
%>
	<tr>
		<td>������ �Ǵ� �ش� ������ �Ǹ����� ��� ������ �� �����ϴ�.</td>
		<td></td>
	</tr>
<%
	// 1_1. �ǸſϷ��� ���
	}else if(goods.getG_state().equals("�ǸſϷ�")){
%>
	<tr>
		<td>�ǸŰ� �Ϸ�Ǿ� ������ �� �����ϴ�.</td>
		<td></td>
	</tr>
<%		
	// 1_2. �Ǹ����� ��� (������ �Ǵ� �Ǹ��� ���̵� �ش����� �ʴ� ���)
	}else{
%>
	<tr>
		<td><input type="submit" value="�����ϱ�"></td>
		<td></td>
	</tr>
<%
	}
	/* ���� �� ����*/
	
	// 2. �ǸſϷ��� ��� (������ �Ǵ� �Ǹ��� ���̵� �ش�)
	if (goods.getG_state().equals("�ǸſϷ�") && (m_level.equals("������") || goods.getG_id().equals(m_id))){	
%>	
	<tr>
		<td>�Ǹ� �Ϸ��� �������� ������ �� �Ǹ��� ���̵��� ��� ������ �����մϴ�.</td>
		<td></td>
	</tr>
	<tr>
		<td><a href="<%= request.getContextPath() %>/Gdel/g_delete_form.sinsege?send_gCode=<%= goods.getG_code() %>&send_gName=<%= goods.getG_name() %>">
			����</a></td>
		<td></td>
	</tr>
<%	
	// 2_1. �Ǹ����� ��� (�Ǹ��� ���̵� �ش�)
	}else if(goods.getG_state().equals("�Ǹ���") && ( m_level.equals("������") || goods.getG_id().equals(m_id))){
%>
	<tr>
		<td><a href="<%= request.getContextPath() %>/Gup/g_update_form.sinsege?send_gCode=<%= goods.getG_code() %>">
			����</a></td>
		<td></td>
	</tr>
	<tr>
		<td><a href="<%= request.getContextPath() %>/Gdel/g_delete_form.sinsege?send_gCode=<%= goods.getG_code() %>&send_gName=<%= goods.getG_name() %>">
			����</a></td>
		<td></td>
	</tr>
<%	
	}
%>
	<tr>
		<td><a href="<%= request.getContextPath() %>/Gsearch/g_search_list.sinsege">�ǵ��ư���</a></td>
		<td></td>
	</tr>
</table>
</form>
</body>
</html>