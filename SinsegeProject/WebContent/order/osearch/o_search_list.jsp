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
<title>���������� - ���� ����</title>
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
<!-- Top �κ� -->
<%@ include file="/module/mypage.jsp" %>
<!-- middle �κ� (����ȭ��) -->

<!-- 
List list=(List)request.getAttribute("list"); // ����Ʈ ����
int listcount=((Integer)request.getAttribute("listcount")).intValue(); // �� ��
int nowpage=((Integer)request.getAttribute("page")).intValue(); // ���� ������ ��
int maxpage=((Integer)request.getAttribute("maxpage")).intValue(); // �ִ� ������ ��
int startpage=((Integer)request.getAttribute("startpage")).intValue(); // ���� �������� ǥ���� ù ������ ��
int endpage=((Integer)request.getAttribute("endpage")).intValue(); // ���� �������� ǥ���� �� ������ ��
System.out.println(listcount + " : listcount"); 
 -->
 
<table class="table table-hover">
<thead>
	<tr class="table-active">
		<td>�ֹ��ڵ�</td>
		<td>��ǰ�ڵ�</td>
		<td>��ǰ�̸�</td>
		<td>���űݾ�</td>
		<td>��������</td>
<%-- 		
		<%
		if(m_level.equals("ȸ��")){
		 %>	
		<%
		}
		%>
		<%
		if(m_level.equals("������")){
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
System.out.println(result+" : �α��� id�� �ش��ϴ� ���� ���� List �ּ�");

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
--%>

</body>
</html>