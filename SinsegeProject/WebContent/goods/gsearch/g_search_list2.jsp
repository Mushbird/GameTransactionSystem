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
<title>상품 검색</title>
</head>
<body>
	<div class="progress">
	  <div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%"></div>
	</div>
<!-- top 부분 -->
<%@ include file="/module/top.jsp" %>
<!-- middle 부분 -->
<%@ include file = "/goods/gsearch/g_search_form.jsp" %>
<table class="table table-hover">
<thead>
	<tr class="table-active">
		<td>Code</td>
		<td>Goods Grade</td>
		<td>Goods Category</td>
		<td>Name</td>
		<td>Seller ID</td>
		<td>Price</td>
		<td>Grade AddPrice</td>
		<td>Grade Discount</td>
		<td>Total Price</td>
		<td>Detail</td>
		<td>Goods State</td>
		<td>Join Date</td>
		<td>Final Update</td>
		<%
		if(m_level.equals("회원")){
		 %>	
		<td>구매</td>
		<%
		}
		%>
		<%
		if(m_level.equals("관리자")){
		%>
		<td>Update</td>
		<td>Delete</td>
		<%
		}
		%>
	</tr>
</thead>
<tbody>
<%
if(request.getAttribute("join") == null) {
	response.sendRedirect(request.getContextPath() +"/member/mlogin/m_login_form.jsp");
}else{
ArrayList<Goods> result = (ArrayList<Goods>)request.getAttribute("join");
ArrayList<Goods> result2 = (ArrayList<Goods>)request.getAttribute("arraylist2");
Grade grade = (Grade)request.getAttribute("grade");
System.out.println(grade+"<--grade g_search_list");
System.out.println(result+"<--result g_search_list");
System.out.println(result2+"<--result2 g_list");

for(int i=0; i<result.size(); i++){
	 Goods goods = (Goods)result.get(i);
	 Goods goods2 = (Goods)result2.get(i);
	String g_code = goods.getG_code();
	String gl_name = goods.getGl_name();
	String g_cate = goods.getG_cate();
	String g_name = goods.getG_name();
	String g_id = goods.getG_id();
	int g_price = goods.getG_price();
	String g_detail = goods.getG_detail();
	String g_state = goods.getG_state();
	String g_date = goods.getG_date();
	String g_update = goods.getG_update();
	double a = g_price;
	double b = goods2.getG_price();
	double c = grade.getB_per();
	double d = a + b;
	double e = c/100;
	double f = d*e;
	double g = d-f;
	int h = (int)g;

	if(g_state.equals("구매불가")){
%>
	<tr>
		<td><%= g_code %></td>
		<td><%= gl_name %></td>
		<td><%= g_cate %></td>
		<td><%= g_name %></td>
		<td><%= g_id %></td>
		<td><%= g_price %></td>
		<td><%= goods2.getG_price() %></td>
		<td><%= grade.getB_per() %></td>
		<td><%= h %></td>
		<td><%= g_detail %></td>
		<td><%= g_state %></td>
		<td><%= g_date %></td>
		<td><%= g_update %></td>
		<%
		if(m_level.equals("회원")) {
		%>
		<td></td>
		<%
		}
		%>
		<%
		if(m_level.equals("관리자")) {
		%>
		<td>
			<a href="<%= request.getContextPath() %>/Gup/g_update_form.sinsege?send_gCode=<%= g_code %>">
			수정
			</a>			
		</td>
		<td>
			<a href="<%= request.getContextPath() %>/Gdel/g_delete_form.sinsege?send_gCode=<%= g_code %>&send_gName=<%= g_name %>">
			삭제
			</a>			
		</td>			
	</tr>
<%
		}
	}else{
%>
	<tr>
		<td><%= g_code %></td>
		<td><%= gl_name %></td>
		<td><%= g_cate %></td>
		<td><%= g_name %></td>
		<td><%= g_id %></td>
		<td><%= g_price %></td>
		<td><%= goods2.getG_price() %></td>
		<td><%= grade.getB_per() %></td>
		<td><%= h %></td>
		<td><%= g_detail %></td>
		<td><%= g_state %></td>
		<td><%= g_date %></td>
		<td><%= g_update %></td>
		<%
		if(m_level.equals("회원")) {
		%>
		<td>
			<a href="<%= request.getContextPath() %>/Oin/o_list_pro.sinsege_o?g_code=<%= g_code %>&g_name=<%= g_name %>&h=<%= h %>&g_state=<%=g_state %>" method="post">
			구매
			</a>			
		</td>
		<%
		}
		%>
		<%
		if(m_level.equals("관리자")){
		%>
		<td>
			<a href="<%= request.getContextPath() %>/Gup/g_update_form.sinsege?send_gCode=<%= g_code %>">
			수정
			</a>			
		</td>
		<td>
			<a href="<%= request.getContextPath() %>/Gdel/g_delete_form.sinsege?send_gCode=<%= g_code %>&send_gName=<%= g_name %>">
			삭제
			</a>			
		</td>			
	</tr>
<%
		}
	}
}
}
%>
</tbody>
</table>
</body>
</html>