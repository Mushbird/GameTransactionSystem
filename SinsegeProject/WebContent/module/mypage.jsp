<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="kr.or.sinsege.dao.Mdao"%>
<%@ page import="kr.or.sinsege.dto.Member"%>
<body>
	<div class="progress">
	  <div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%"></div>
	</div>
<!-- top 부분 -->
<%@ include file="/module/top.jsp" %>
<!-- middle 부분 (마이페이지) -->
<%
if(m_level == null ) {
%>
	<script type = "text/javascript">
	alert('접근 권한이 없습니다.');
	location.href='<%= request.getContextPath() %>/index.jsp';
	</script>
<%	
} else if(m_level.equals("회원")){
%>		
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="<%= request.getContextPath() %>/main.jsp">　 　 　</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
	  	<span class="navbar-toggler-icon"></span>
		</button>
			<div class="collapse navbar-collapse" id="navbarColor01">
			  	<ul class="navbar-nav mr-auto">
			  		<li class="nav-item">
				        <a class="nav-link" href="<%= request.getContextPath() %>/Mup/m_update_form.sinsege_m?m_code=<%=m_code%>">내 정보 수정</a>
				    </li>
					<li class="nav-item">
		 				 <a class="nav-link" href="<%= request.getContextPath() %>/Oin/o_list_form.sinsege_o?m_id=<%=m_id%>">구매내역</a>
					</li>
					<li class="nav-item">
		 				 <a class="nav-link" href="<%= request.getContextPath() %>/Glist/g_list.sinsege?m_id=<%=m_id%>">상품내역</a>
					</li>
			 	</ul>
			</div>
		</nav>
	  
<%
} else if(m_level.equals("관리자")) {
%>	
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="<%= request.getContextPath() %>/main.jsp">　 　 　</a> 
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
	  	<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarColor01">
  			<ul class="navbar-nav mr-auto">
	    			<li class="nav-item">
				        <a class="nav-link" href="<%= request.getContextPath() %>/Mup/m_update_form.sinsege_m?m_code=<%=m_code%>">내 정보 수정</a>
				    </li>
				<li class="nav-item">
	 				 <a class="nav-link" href="<%=request.getContextPath()%>/Bgrade/b_grade_list.sinsege_m">구매자등급설정</a>
				</li>
				<li class="nav-item">
	  				<a class="nav-link" href="<%=request.getContextPath()%>/Ggrade/g_grade_list.sinsege_m">판매자등급설정</a>
	   			</li>
  			</ul>
		</div>
	</nav>
<%	
}
%>