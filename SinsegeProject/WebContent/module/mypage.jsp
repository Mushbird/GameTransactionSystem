<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="kr.or.sinsege.dao.Mdao"%>
<%@ page import="kr.or.sinsege.dto.Member"%>
<body>
	<div class="progress">
	  <div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%"></div>
	</div>
<!-- top �κ� -->
<%@ include file="/module/top.jsp" %>
<!-- middle �κ� (����������) -->
<%
if(m_level == null ) {
%>
	<script type = "text/javascript">
	alert('���� ������ �����ϴ�.');
	location.href='<%= request.getContextPath() %>/index.jsp';
	</script>
<%	
} else if(m_level.equals("ȸ��")){
%>		
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="<%= request.getContextPath() %>/main.jsp">�� �� ��</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
	  	<span class="navbar-toggler-icon"></span>
		</button>
			<div class="collapse navbar-collapse" id="navbarColor01">
			  	<ul class="navbar-nav mr-auto">
			  		<li class="nav-item">
				        <a class="nav-link" href="<%= request.getContextPath() %>/Mup/m_update_form.sinsege_m?m_code=<%=m_code%>">�� ���� ����</a>
				    </li>
					<li class="nav-item">
		 				 <a class="nav-link" href="<%= request.getContextPath() %>/Oin/o_list_form.sinsege_o?m_id=<%=m_id%>">���ų���</a>
					</li>
					<li class="nav-item">
		 				 <a class="nav-link" href="<%= request.getContextPath() %>/Glist/g_list.sinsege?m_id=<%=m_id%>">��ǰ����</a>
					</li>
			 	</ul>
			</div>
		</nav>
	  
<%
} else if(m_level.equals("������")) {
%>	
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="<%= request.getContextPath() %>/main.jsp">�� �� ��</a> 
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
	  	<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarColor01">
  			<ul class="navbar-nav mr-auto">
	    			<li class="nav-item">
				        <a class="nav-link" href="<%= request.getContextPath() %>/Mup/m_update_form.sinsege_m?m_code=<%=m_code%>">�� ���� ����</a>
				    </li>
				<li class="nav-item">
	 				 <a class="nav-link" href="<%=request.getContextPath()%>/Bgrade/b_grade_list.sinsege_m">�����ڵ�޼���</a>
				</li>
				<li class="nav-item">
	  				<a class="nav-link" href="<%=request.getContextPath()%>/Ggrade/g_grade_list.sinsege_m">�Ǹ��ڵ�޼���</a>
	   			</li>
  			</ul>
		</div>
	</nav>
<%	
}
%>