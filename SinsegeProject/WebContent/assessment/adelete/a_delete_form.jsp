<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% request.setCharacterEncoding("EUC-KR"); %>
<%@ page import="kr.or.sinsege.dao.Adao"%>
<%@ page import="kr.or.sinsege.dto.Assessment"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<title>Assessment Delete Form</title>
</head>
<body>
<%@ include file ="/module/top.jsp" %>
<%
	Assessment a = (Assessment)request.getAttribute("a");
	System.out.println(a + " <-- a");
	
	String dbno = a.getA_code();
	String dbid = a.getA_id();
	String dbtitle = a.getA_title();
%>
	<div class="card">
		<center>
		  <div class="card-body">
		    <h4 class="card-title">후기 게시물 삭제</h4>
		    <h6 class="card-subtitle mb-2 text-muted">게시글 번호 : <%= dbno %> 게시글 이름 : <%= dbtitle %><br><br>등록자 : <%= dbid %></h6>
		    <p class="card-text">삭제하시겠습니까?</p>
		    <a href="<%= request.getContextPath() %>/Adel/a_delete_pro.sinsege_a?a_code=<%= dbno %>" class="card-link">삭제</a>
		    <a href="<%= request.getContextPath() %>/Alist/a_list.sinsege_a" class="card-link">취소</a>
		  </div>
		</center>
	</div>
</body>
</html>