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
	List list=(List)request.getAttribute("list"); // 리스트 정보
	int listcount=((Integer)request.getAttribute("listcount")).intValue(); // 글 수
	int nowpage=((Integer)request.getAttribute("page")).intValue(); // 현재 페이지 수
	int maxpage=((Integer)request.getAttribute("maxpage")).intValue(); // 최대 페이지 수
	int startpage=((Integer)request.getAttribute("startpage")).intValue(); // 현재 페이지에 표시할 첫 페이지 수
	int endpage=((Integer)request.getAttribute("endpage")).intValue(); // 현재 페이지에 표시할 끝 페이지 수
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
			<td>☆☆☆☆★</td>
			<%
			}else if(2==dbscore) {
			%>
			<td>☆☆☆★★</td>
			<%	
			}else if(3==dbscore) {
			%>
			<td>☆☆★★★</td>
			<%	
			}else if(4==dbscore) {
			%>
			<td>☆★★★★</td>
			<%	
			}else {
			%>
			<td>★★★★★</td>
			<%	
			}
			%>
			<td><%= dbdate %></td>
			<td><%= dbupdate %></td>
<%
if(session.getAttribute("m_level").equals("관리자") || session.getAttribute("m_id").equals(dbid)){
%>
			<td>
<a href="<%= request.getContextPath() %>/Aup/a_update_form.sinsege_a?a_code=<%= dbno %>">수 정</a>			
			</td>
			<td>
<a href="<%= request.getContextPath() %>/Adel/a_delete_form.sinsege_a?a_code=<%= dbno %>">삭 제</a>			
			</td>			
		</tr>
<%
}
	 } 
%>
</table>

	<%if(nowpage<=1){ %>
	[이전]&nbsp;
	<%}else{ %>
	<a href="<%= request.getContextPath() %>/Alist/a_list.sinsege_a?page=<%= nowpage-1 %>">이전</a>&nbsp;
	<%} %>
	
	<%for(int a=startpage;a<=endpage;a++){
		if(a==nowpage){%>
		[<%=a %>]
		<%}else{ %>
		<a href="<%= request.getContextPath() %>/Alist/a_list.sinsege_a?page=<%=a %>">[<%=a %>]</a>&nbsp;
		<%} %>
	<%} %> 
	
	<%if(nowpage>=maxpage){ %>
	[다음]
	<%}else{ %>
	<a href="<%= request.getContextPath() %>/Alist/a_list.sinsege_a?page=<%= nowpage+1 %>">다음</a>&nbsp;
	<%}%>
</body>
</html>