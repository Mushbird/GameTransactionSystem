<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import = "kr.or.sinsege.dao.Adao" %>
<%@ page import = "kr.or.sinsege.dto.Assessment" %>
<%@ page import = "java.util.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<style>
	#jb-container {
	        width: 1780px auto;
	        margin: 0px auto;
	        color: #343a40;
	        padding: 20px;
	        border: 1px solid #bcbcbc;
	      }
	      #jb-content {
	        width: 900px;
	        padding: 80px;
	        margin-bottom: 80px;
	        color: #343a40;
	        float: center;
	        border: 1px solid #bcbcbc;
	      }
</style>
<title>Assessment List</title>
</head>
<body>
	<div class="progress">
	  <div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%"></div>
	</div>
<%@ include file ="/module/top.jsp" %>
<%@ include file ="/assessment/asearch/a_search_form.jsp" %>
<%
	List list=(List)request.getAttribute("list"); // ����Ʈ ����
	int listcount=((Integer)request.getAttribute("listcount")).intValue(); // �� ��
	int nowpage=((Integer)request.getAttribute("page")).intValue(); // ���� ������ ��
	int maxpage=((Integer)request.getAttribute("maxpage")).intValue(); // �ִ� ������ ��
	int startpage=((Integer)request.getAttribute("startpage")).intValue(); // ���� �������� ǥ���� ù ������ ��
	int endpage=((Integer)request.getAttribute("endpage")).intValue(); // ���� �������� ǥ���� �� ������ ��
	System.out.println(listcount + " : listcount");
%>
	<table id = "jb-container" class="table table-hover">
	  <thead>
	    <tr class="table-active">
	      <th scope="row">No</th>
	      <td>Goods Name</td>
	      <td>Category</td>
	      <td>Title</td>
	      <td>ID</td>
	      <td>Score</td>
	      <td>Making Date</td>
	      <td>Modification</td>
	      <td>Update</td>
	      <td>Delete</td>
	    </tr>
	  </thead>
<%
	/* if(request.getAttribute("request_assessment") == null) {
		response.sendRedirect(request.getContextPath() + "/member/mlogin/m_login_form.jsp");
	} else { */
		
/* 	ArrayList<Assessment> result = (ArrayList<Assessment>)request.getAttribute("request_assessment");
	System.out.println(result + " <- result"); */
	
	
	for(int i=0; i<list.size(); i++) {
		Assessment a = (Assessment)list.get(i);
		String dbno = a.getA_code();
		String dbgoods = a.getA_goods();
		String dbtitle = a.getA_title();
		String dbid = a.getA_id();
		int dbscore = a.getA_score();
		String dbdate = a.getA_date().substring(0, 10);
		String dbupdate = a.getA_update().substring(0, 10);
		String dbcate = a.getA_cate();
%>
		<tr>
			<td><%= dbno %></td>
			<td><%= dbgoods %></td>
			<td><%= dbcate %></td>
			<td><%= dbtitle %></td>
			<td><%= dbid %></td>
			<%
			if(1==dbscore) {	
			%>
			<td>�١١١١�</td>
			<%
			}else if(2==dbscore) {
			%>
			<td>�١١١ڡ�</td>
			<%	
			}else if(3==dbscore) {
			%>
			<td>�١١ڡڡ�</td>
			<%	
			}else if(4==dbscore) {
			%>
			<td>�١ڡڡڡ�</td>
			<%	
			}else {
			%>
			<td>�ڡڡڡڡ�</td>
			<%	
			}
			%>
			<td><%= dbdate %></td>
			<td><%= dbupdate %></td>
<%
if(session.getAttribute("m_level").equals("������") || session.getAttribute("m_id").equals(dbid)){
%>
			<td>
<a href="<%= request.getContextPath() %>/Aup/a_update_form.sinsege_a?a_code=<%= dbno %>">�� ��</a>			
			</td>
			<td>
<a href="<%= request.getContextPath() %>/Adel/a_delete_form.sinsege_a?a_code=<%= dbno %>">�� ��</a>			
			</td>			
		</tr>
<%
}
	 } 
%>
</table>

	<%if(nowpage<=1){ %>
	[����]&nbsp;
	<%}else{ %>
	<a href="<%= request.getContextPath() %>/Alist/a_list.sinsege_a?page=<%= nowpage-1 %>">����</a>&nbsp;
	<%} %>
	
	<%for(int a=startpage;a<=endpage;a++){
		if(a==nowpage){%>
		[<%=a %>]
		<%}else{ %>
		<a href="<%= request.getContextPath() %>/Alist/a_list.sinsege_a?page=<%=a %>">[<%=a %>]</a>&nbsp;
		<%} %>
	<%} %> 
	
	<%if(nowpage>=maxpage){ %>
	[����]
	<%}else{ %>
	<a href="<%= request.getContextPath() %>/Alist/a_list.sinsege_a?page=<%= nowpage+1 %>">����</a>&nbsp;
	<%}%>
</body>
</html>