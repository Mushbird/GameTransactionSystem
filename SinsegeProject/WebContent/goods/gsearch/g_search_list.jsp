<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "kr.or.sinsege.dto.Goods"%>
<%@ page import = "kr.or.sinsege.dto.Grade"%>
<%@ page import = "java.util.*" %>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��ǰ �˻�</title>
</head>
<body>
	<div class="progress">
	  <div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%"></div>
	</div>
<!-- top �κ� -->
<%@ include file="/module/top.jsp" %>
<!-- middle �κ� -->
<%@ include file = "/goods/gsearch/g_search_form.jsp" %>
<%
List list=(List)request.getAttribute("list"); // ����Ʈ ����
int listcount=((Integer)request.getAttribute("listcount")).intValue(); // �� ��
int nowpage=((Integer)request.getAttribute("page")).intValue(); // ���� ������ ��
int maxpage=((Integer)request.getAttribute("maxpage")).intValue(); // �ִ� ������ ��
int startpage=((Integer)request.getAttribute("startpage")).intValue(); // ���� �������� ǥ���� ù ������ ��
int endpage=((Integer)request.getAttribute("endpage")).intValue(); // ���� �������� ǥ���� �� ������ ��
System.out.println(listcount + " : listcount");
%>
<table class="table table-hover">
<thead>
	<tr class="table-active">
		<td>������ �ڵ�</td>
		<td>���</td>
		<td>ī�װ�</td>
		<td>������ �̸�</td>
		<td>�Ǹ��� ID</td>
		<td>����</td>
		<td>�߰�����(Gold)</td>
		<td>������(%)</td>
		<td>�� ����(Gold)</td>
		<td>����</td>
		<td>�����</td>
	</tr>
</thead>
<tbody>
<%
	if(request.getAttribute("join") == null) {
		response.sendRedirect(request.getContextPath() +"/member/mlogin/m_login_form.jsp");
	}else{
		/* ArrayList<Goods> result = (ArrayList<Goods>)request.getAttribute("join"); */
		ArrayList<Goods> result2 = (ArrayList<Goods>)request.getAttribute("arraylist2");
		Grade grade = (Grade)request.getAttribute("grade");
		/* System.out.println(grade+"<--grade g_search_list");
		/* System.out.println(result+"<--result g_search_list"); */
		/* System.out.println(result2+"<--result2 g_list"); */
	
		for(int i=0; i<list.size(); i++){
			Goods goods = (Goods)list.get(i);
			Goods goods2 = (Goods)result2.get(i);
			String g_code = goods.getG_code();
			String gl_name = goods.getGl_name();
			String g_cate = goods.getG_cate();
			String g_name = goods.getG_name();
			String g_id = goods.getG_id();
			int g_price = goods.getG_price();
			String g_detail = goods.getG_detail();
			String g_state = goods.getG_state();
			String g_date = goods.getG_date().substring(0, 10);
			String g_update = goods.getG_update().substring(0, 10);
			double a = g_price;
			double b = goods2.getG_price();
			double c = grade.getB_per();
			double d = a + b;
			double e = c/100;
			double f = d*e;
			double g = d-f;
			int h = (int)g;
%>
			<tr>
				<td><%= g_code %></td>
				<td><%= gl_name %></td>
				<td><%= g_cate %></td>
				<td><a href="<%=request.getContextPath() %>/Glist/g_detail.sinsege?g_code=<%= g_code %>&o_total=<%= h %>"><%= g_name %></a></td>
				<td><%= g_id %></td>
				<td><%= g_price %></td>
				<td><%= goods2.getG_price() %></td>
				<td><%= grade.getB_per() %></td>
				<td><%= h %></td>
				<td><%= g_state %></td>
				<td><%= g_date %></td>	
			</tr>
<%
		}
	}
%>
</tbody>
</table>

	<%if(nowpage<=1){ %>
		[����]&nbsp;
	<%}else{ %>
		<a href="<%= request.getContextPath() %>/Gsearch/g_search_list.sinsege?page=<%= nowpage-1 %>">����</a>&nbsp;
	<%} %>
	
	<%for(int a=startpage;a<=endpage;a++){
		if(a==nowpage){%>
			[<%=a %>]
		<%}else{ %>
			<a href="<%= request.getContextPath() %>/Gsearch/g_search_list.sinsege?page=<%=a %>">[<%=a %>]</a>&nbsp;
		<%} %>
	<%} %> 
	
	<%if(nowpage>=maxpage){ %>
		[����]
	<%}else{ %>
		<a href="<%= request.getContextPath() %>/Gsearch/g_search_list.sinsege?page=<%= nowpage+1 %>">����</a>&nbsp;
	<%}%>
</body>
</html>