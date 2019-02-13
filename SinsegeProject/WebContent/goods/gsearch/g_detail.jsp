<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import = "kr.or.sinsege.dto.Goods" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>상품 상세보기 폼</title>
</head>
<body>
<!-- top 부분 -->
<%@ include file="/module/top.jsp" %>
<!-- middle 부분 -->
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
		<td><%= goods.getG_cate() %></td>
	</tr>
	<tr>
		<td>상품명</td>
		<td><%= goods.getG_name() %></td>
	</tr>
	<tr>
		<td>총 가격</td>
		<td><%= o_total %></td>
	</tr>
	<tr>
		<td>상세설명</td>
		<td><%= goods.getG_detail() %></td>
	</tr>
	<tr>
		<td>상품등록일자</td>
		<td><%= goods.getG_date().substring(0, 10) %></td>
	</tr>
	<tr>
		<td>상품수정일자</td>
		<td><%= goods.getG_update().substring(0, 10) %></td>
	</tr>
<%
	/* 구매 */
	
	// 1. 판매중 (관리자 또는 판매자 아이디에 해당)인경우
	if(m_level.equals("관리자") || goods.getG_id().equals(m_id)){
%>
	<tr>
		<td>관리자 또는 해당 아이템 판매자인 경우 구매할 수 없습니다.</td>
		<td></td>
	</tr>
<%
	// 1_1. 판매완료인 경우
	}else if(goods.getG_state().equals("판매완료")){
%>
	<tr>
		<td>판매가 완료되어 구매할 수 없습니다.</td>
		<td></td>
	</tr>
<%		
	// 1_2. 판매중인 경우 (관리자 또는 판매자 아이디에 해당하지 않는 경우)
	}else{
%>
	<tr>
		<td><input type="submit" value="구매하기"></td>
		<td></td>
	</tr>
<%
	}
	/* 수정 및 삭제*/
	
	// 2. 판매완료인 경우 (관리자 또는 판매자 아이디에 해당)
	if (goods.getG_state().equals("판매완료") && (m_level.equals("관리자") || goods.getG_id().equals(m_id))){	
%>	
	<tr>
		<td>판매 완료인 아이템은 관리자 및 판매자 아이디인 경우 삭제만 가능합니다.</td>
		<td></td>
	</tr>
	<tr>
		<td><a href="<%= request.getContextPath() %>/Gdel/g_delete_form.sinsege?send_gCode=<%= goods.getG_code() %>&send_gName=<%= goods.getG_name() %>">
			삭제</a></td>
		<td></td>
	</tr>
<%	
	// 2_1. 판매중인 경우 (판매자 아이디에 해당)
	}else if(goods.getG_state().equals("판매중") && ( m_level.equals("관리자") || goods.getG_id().equals(m_id))){
%>
	<tr>
		<td><a href="<%= request.getContextPath() %>/Gup/g_update_form.sinsege?send_gCode=<%= goods.getG_code() %>">
			수정</a></td>
		<td></td>
	</tr>
	<tr>
		<td><a href="<%= request.getContextPath() %>/Gdel/g_delete_form.sinsege?send_gCode=<%= goods.getG_code() %>&send_gName=<%= goods.getG_name() %>">
			삭제</a></td>
		<td></td>
	</tr>
<%	
	}
%>
	<tr>
		<td><a href="<%= request.getContextPath() %>/Gsearch/g_search_list.sinsege">되돌아가기</a></td>
		<td></td>
	</tr>
</table>
</form>
</body>
</html>