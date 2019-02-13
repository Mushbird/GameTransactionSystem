<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "kr.or.sinsege.dto.Order"%>
<%@ page import = "java.util.*" %>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta charset="EUC-KR">
<title>마이페이지 - 구매 내역</title>
<style>
#jb-container {
        width: 940px;
        margin: 0px auto;
        padding: 20px;
        border: 1px solid #bcbcbc;
      }
      #jb-content {
        width: 900px;
        padding: 80px;
        margin-bottom: 80px;
        float: center;
        border: 1px solid #bcbcbc;
      }
</style>
</head>
<!-- Top 부분 -->
<%@ include file="/module/mypage.jsp" %>
<!-- middle 부분 (수정화면) -->

<!-- 
List list=(List)request.getAttribute("list"); // 리스트 정보
int listcount=((Integer)request.getAttribute("listcount")).intValue(); // 글 수
int nowpage=((Integer)request.getAttribute("page")).intValue(); // 현재 페이지 수
int maxpage=((Integer)request.getAttribute("maxpage")).intValue(); // 최대 페이지 수
int startpage=((Integer)request.getAttribute("startpage")).intValue(); // 현재 페이지에 표시할 첫 페이지 수
int endpage=((Integer)request.getAttribute("endpage")).intValue(); // 현재 페이지에 표시할 끝 페이지 수
System.out.println(listcount + " : listcount"); 
 -->
 
<table class="table table-hover">
<thead>
	<tr class="table-active">
		<td>주문코드</td>
		<td>상품코드</td>
		<td>상품이름</td>
		<td>구매금액</td>
		<td>구매일자</td>
<%-- 		
		<%
		if(m_level.equals("회원")){
		 %>	
		<%
		}
		%>
		<%
		if(m_level.equals("관리자")){
		%>
		<%
		}
		%> 
--%>
	</tr>
</thead>
<tbody>
<%

ArrayList<Order> result = (ArrayList<Order>)request.getAttribute("order");
System.out.println(result+" : 로그인 id에 해당하는 구매 내역 List 주소");

for(int i=0; i<result.size(); i++){
	Order order = (Order)result.get(i);
	
	String o_code = order.getO_code();
	String g_code = order.getG_code();
	String g_name = order.getG_name();
	int o_total = order.getO_total();
	String o_date = order.getO_date();
	
%>
	<tr>
		<td><%= o_code %></td>
		<td><%= g_code %></td>
		<td><%= g_name %></td>
		<td><%= o_total %></td>
		<td><%= o_date %></td>		
	</tr>
<%
}
%>
</tbody>
</table>

<%-- 
	<%if(nowpage<=1){ %>
	[이전]&nbsp;
	<%}else{ %>
	<a href="<%= request.getContextPath() %>/Gsearch/g_search_list.sinsege?page=<%= nowpage-1 %>">이전</a>&nbsp;
	<%} %>
	
	<%for(int a=startpage;a<=endpage;a++){
		if(a==nowpage){%>
		[<%=a %>]
		<%}else{ %>
		<a href="<%= request.getContextPath() %>/Gsearch/g_search_list.sinsege?page=<%=a %>">[<%=a %>]</a>&nbsp;
		<%} %>
	<%} %> 
	
	<%if(nowpage>=maxpage){ %>
	[다음]
	<%}else{ %>
	<a href="<%= request.getContextPath() %>/Gsearch/g_search_list.sinsege?page=<%= nowpage+1 %>">다음</a>&nbsp;
	<%}%> 
--%>

</body>
</html>