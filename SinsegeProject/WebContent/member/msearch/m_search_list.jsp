<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "kr.or.sinsege.dto.Member" %>
<%@ page import = "java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Search List</title>
</head>
<body>
	<div class="progress">
	  <div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%"></div>
	</div>
<!-- top �κ� -->
<%@ include file="/module/top.jsp" %>
<!-- middle �κ� -->
<%@ include file="/member/msearch/m_search_form.jsp" %>
<%
	List list=(List)request.getAttribute("list"); // ����Ʈ ����
	int listcount=((Integer)request.getAttribute("listcount")).intValue(); // �� ��
	int nowpage=((Integer)request.getAttribute("page")).intValue(); // ���� ������ ��
	int maxpage=((Integer)request.getAttribute("maxpage")).intValue(); // �ִ� ������ ��
	int startpage=((Integer)request.getAttribute("startpage")).intValue(); // ���� �������� ǥ���� ù ������ ��
	int endpage=((Integer)request.getAttribute("endpage")).intValue(); // ���� �������� ǥ���� �� ������ ��
	
	System.out.println(listcount + " : listcount");
	System.out.println(nowpage + " : nowpage");
	System.out.println(endpage + " : endpage");
	System.out.println(maxpage + " : maxpage");

%>
<table class="table table-hover">
<thead>
	<tr class="table-active">
		<td>ȸ���ڵ�</td>
		<td>�����ڵ��</td>
		<td>�Ǹ��ڵ��</td>
		<td>ȸ�� ���̵�</td>
		<td>ȸ�� ��й�ȣ</td>
		<td>ȸ�� ����</td>
		<td>ȸ�� �̸�</td>
		<td>���� ���</td>
		<td>�� ����Ʈ</td>
		<td>�� ����Ƚ��</td>
		<td>ȸ�����Գ�¥</td>
		<td>ȸ��������¥</td>
		<td>��  ��</td>
		<td>��  ��</td>
	</tr>
	</thead>
	<tbody>
<%
	/* ArrayList<Member> result = (ArrayList<Member>)request.getAttribute("request_mem");
	 */
	String in = null;
	String date = null;
	for(int i = 0; i<list.size(); i++){
	Member m = (Member)list.get(i);
	in = m.getM_in().substring(0, 10);
	date = m.getM_date().substring(0, 10);
%>
		<tr>
			<td><%= m.getM_code() %></td><td><%= m.getB_name() %><td><%= m.getGl_name() %></td><td><%= m.getM_id() %></td><td><%= m.getM_pw() %></td><td><%= m.getM_level() %></td>
			<td><%= m.getM_name() %></td><td><%= m.getM_gold() %></td><td><%= m.getM_point() %></td><td><%= m.getM_count() %></td><td><%= in %><td><%= date %></td>
			<td>
				<a href = "<%=request.getContextPath()%>/Mup/m_update_form.sinsege_m?m_code=<%=m.getM_code()%>">����</a>
			</td>
			<td>
				<a href = "<%=request.getContextPath()%>/Mdel/m_delete_pro.sinsege_m?m_code=<%=m.getM_code()%>">����</a>
			</td>
		</tr>
<%	
	}
%>
	</tbody>
</table>

<%if(nowpage<=1){ %>
	[����]&nbsp;
	<%}else{ %>
	<a href="<%= request.getContextPath() %>/Msearch/m_search_list.sinsege_m?page=<%= nowpage-1 %>">����</a>&nbsp;
	<%} %>
	
	<%for(int a=startpage; a<=endpage; a++){
		if(a==nowpage){%>
		[<%=a %>]
		<%}else{ %>
		<a href="<%= request.getContextPath() %>/Msearch/m_search_list.sinsege_m?page=<%=a %>">[<%=a %>]</a>&nbsp;
		<%} %>
	<%} %> 
	
	<%if(nowpage>=maxpage){ %>
	[����]
	<%}else{ %>
	<a href="<%= request.getContextPath() %>/Msearch/m_search_list.sinsege_m?page=<%= nowpage+1 %>">����</a>&nbsp;
	<%}%>

</body>
</html>