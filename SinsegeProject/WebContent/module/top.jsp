<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String m_id = (String)session.getAttribute("m_id");
	String m_level = (String)session.getAttribute("m_level");
	String m_name = (String)session.getAttribute("m_name");
	String m_code = (String)session.getAttribute("m_code");
	System.out.println(m_id + "<-m_id top.jsp");

	if(m_level == null ) {
%>
		<script type = "text/javascript">
		alert('���� ������ �����ϴ�.');
		location.href='<%= request.getContextPath() %>/index.jsp';
		</script>
		<%-- 
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		  	<a class="navbar-brand" href="<%= request.getContextPath() %>/main.jsp">SEULGI</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
			  <span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarColor01">
			<ul class="navbar-nav mr-auto">
		    <li class="nav-item">
				<a class="nav-link" href="<%=request.getContextPath()%>/Min/m_insert_form.sinsege_m">ȸ������</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="<%=request.getContextPath()%>/Mlogin/m_login_form.sinsege_m">�α���</a>
		    </li>
		  	</ul>
			</div>
			������������������������������������������
			���̵� : <%= m_id %> <%= m_name %>�� <%= m_level %> ����
			<div class="collapse navbar-collapse" id="navbarColor01">
			<ul class="navbar-nav mr-auto">
			</ul>
			</div>
		</nav> 
		--%>
<%	
	} else if(m_level.equals("ȸ��")){
%>		
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
				<a class="navbar-brand" href="<%= request.getContextPath() %>/main.jsp">I VIEW</a>
					<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
				  	<span class="navbar-toggler-icon"></span>
					</button>
				<div class="collapse navbar-collapse" id="navbarColor01">
				  	<ul class="navbar-nav mr-auto">
						<li class="nav-item">
			 				 <a class="nav-link" href="<%=request.getContextPath()%>/Gin/g_insert_form.sinsege">��ǰ���</a>
						</li>
						<li class="nav-item">
			 				 <a class="nav-link" href="<%=request.getContextPath()%>/Gsearch/g_search_list.sinsege">��ǰ</a>
						</li>
						<li class="nav-item">
					        <a class="nav-link" href="<%= request.getContextPath() %>/Alist/a_list.sinsege_a">��</a>
					    </li>
				 	</ul>
				</div>
				<right>
					<div class="collapse navbar-collapse" id="navbarColor01">
						<span class="badge badge-pill badge-light">���̵� : <%=m_id%>���̸� : <%=m_name%>������ : <%=m_level%></span>��
						<ul class="navbar-nav mr-auto">
							<li class="nav-item2">
								<a class="nav-link" href="<%=request.getContextPath()%>/Mup/m_update_form.sinsege_m?m_code=<%=m_code%>">����������</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="<%=request.getContextPath()%>/Mlogout/m_logout.sinsege_m">�α׾ƿ�</a>
							</li>
						</ul>
					</div>
				</right>
			</nav>
		  
<%
	} else if(m_level.equals("������")) {
%>	
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
 		 	<a class="navbar-brand" href="<%= request.getContextPath() %>/main.jsp">I VIEW</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
	 			<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarColor01">
	  			<ul class="navbar-nav mr-auto">
		    		<%-- 
		    		<li class="nav-item">
		      			<a class="nav-link" href="<%=request.getContextPath()%>/Min/m_insert_form.sinsege_m">ȸ�����</a>
					</li> 
					--%>
					<li class="nav-item">
		 				 <a class="nav-link" href="<%=request.getContextPath()%>/Msearch/m_search_list.sinsege_m">ȸ��</a>
					</li>
					<li class="nav-item">
		 				 <a class="nav-link" href="<%=request.getContextPath()%>/Gsearch/g_search_list.sinsege">��ǰ</a>
					</li>
		   			<li class="nav-item">
				        <a class="nav-link" href="<%= request.getContextPath() %>/Alist/a_list.sinsege_a">��</a>
				    </li>
	  			</ul>
			</div>
			<right>
				<div class="collapse navbar-collapse" id="navbarColor01">
						<span class="badge badge-pill badge-light">���̵� : <%=m_id%>���̸� : <%=m_name%>������ : <%=m_level%></span>��
					<ul class="navbar-nav mr-auto">
						<li class="nav-item2">
							<a class="nav-link" href="<%=request.getContextPath()%>/Mup/m_update_form.sinsege_m?m_code=<%=m_code%>">����������</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="<%=request.getContextPath()%>/Mlogout/m_logout.sinsege_m">�α׾ƿ�</a>
						</li>
					</ul>
				</div>
			</right>
		</nav>
<%	
	}
%>