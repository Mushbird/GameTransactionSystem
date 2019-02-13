<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% request.setCharacterEncoding("EUC-KR"); %>
<%@ page import="kr.or.sinsege.dao.Mdao"%>
<%@ page import="kr.or.sinsege.dto.Member"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<title>Assessment Delete Form</title>
</head>
<body>
<%@ include file ="/module/top.jsp" %>
<%
	Member member = (Member)request.getAttribute("member");
	System.out.println(m_code + " <-- a");
	
	String dbcode = member.getM_code();
	String dbid = member.getM_id();
	String dbname = member.getM_name();
if(session.getAttribute("m_level").equals("관리자")) {
%>
	<div class="card">
		<center>
		  <div class="card-body">
		    <h4 class="card-title">회원 삭제</h4>
		    <h6 class="card-subtitle mb-2 text-muted">회원 코드 : <%= dbcode %> 회원 아이디 : <%= dbid %><br><br>회원 이름 : <%= dbname %></h6>
		    <p class="card-text">삭제하시겠습니까?</p>
		    <a href="<%= request.getContextPath() %>/Mdel/m_delete_pro.sinsege_m?m_code=<%= dbcode %>" class="card-link">삭제</a>
		    <a href="<%= request.getContextPath() %>/Msearch/m_search_list.sinsege_m" class="card-link">취소</a>
		  </div>
		</center>
	</div>
<%
} else if(session.getAttribute("m_level").equals("회원")){
%>	
	<div class="card">
		<center>
		  <div class="card-body">
		    <h4 class="card-title">회원 탈퇴</h4>
		    <h6 class="card-subtitle mb-2 text-muted">회원 아이디 : <%= dbid %><br><br>회원 이름 : <%= dbname %></h6>
		    <p class="card-text">탈퇴하시겠습니까?</p>
		    <a href="<%= request.getContextPath() %>/Mdel/m_delete_pro.sinsege_m?m_code=<%= dbcode %>" class="card-link">탈퇴</a>
		    <a href="<%= request.getContextPath() %>/Mup/m_update_form.sinsege_m?m_code=<%= dbcode %>" class="card-link">취소</a>
		  </div>
		</center>
	</div>
<%
}
%>
</body>
</html>