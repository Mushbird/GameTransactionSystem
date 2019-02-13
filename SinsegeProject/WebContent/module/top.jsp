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
		alert('접근 권한이 없습니다.');
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
				<a class="nav-link" href="<%=request.getContextPath()%>/Min/m_insert_form.sinsege_m">회원가입</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="<%=request.getContextPath()%>/Mlogin/m_login_form.sinsege_m">로그인</a>
		    </li>
		  	</ul>
			</div>
			　　　　　　　　　　　　　　　　　　　　　
			아이디 : <%= m_id %> <%= m_name %>님 <%= m_level %> 권한
			<div class="collapse navbar-collapse" id="navbarColor01">
			<ul class="navbar-nav mr-auto">
			</ul>
			</div>
		</nav> 
		--%>
<%	
	} else if(m_level.equals("회원")){
%>		
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
				<a class="navbar-brand" href="<%= request.getContextPath() %>/main.jsp">I VIEW</a>
					<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
				  	<span class="navbar-toggler-icon"></span>
					</button>
				<div class="collapse navbar-collapse" id="navbarColor01">
				  	<ul class="navbar-nav mr-auto">
						<li class="nav-item">
			 				 <a class="nav-link" href="<%=request.getContextPath()%>/Gin/g_insert_form.sinsege">상품등록</a>
						</li>
						<li class="nav-item">
			 				 <a class="nav-link" href="<%=request.getContextPath()%>/Gsearch/g_search_list.sinsege">상품</a>
						</li>
						<li class="nav-item">
					        <a class="nav-link" href="<%= request.getContextPath() %>/Alist/a_list.sinsege_a">평가</a>
					    </li>
				 	</ul>
				</div>
				<right>
					<div class="collapse navbar-collapse" id="navbarColor01">
						<span class="badge badge-pill badge-light">아이디 : <%=m_id%>　이름 : <%=m_name%>　권한 : <%=m_level%></span>　
						<ul class="navbar-nav mr-auto">
							<li class="nav-item2">
								<a class="nav-link" href="<%=request.getContextPath()%>/Mup/m_update_form.sinsege_m?m_code=<%=m_code%>">마이페이지</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="<%=request.getContextPath()%>/Mlogout/m_logout.sinsege_m">로그아웃</a>
							</li>
						</ul>
					</div>
				</right>
			</nav>
		  
<%
	} else if(m_level.equals("관리자")) {
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
		      			<a class="nav-link" href="<%=request.getContextPath()%>/Min/m_insert_form.sinsege_m">회원등록</a>
					</li> 
					--%>
					<li class="nav-item">
		 				 <a class="nav-link" href="<%=request.getContextPath()%>/Msearch/m_search_list.sinsege_m">회원</a>
					</li>
					<li class="nav-item">
		 				 <a class="nav-link" href="<%=request.getContextPath()%>/Gsearch/g_search_list.sinsege">상품</a>
					</li>
		   			<li class="nav-item">
				        <a class="nav-link" href="<%= request.getContextPath() %>/Alist/a_list.sinsege_a">평가</a>
				    </li>
	  			</ul>
			</div>
			<right>
				<div class="collapse navbar-collapse" id="navbarColor01">
						<span class="badge badge-pill badge-light">아이디 : <%=m_id%>　이름 : <%=m_name%>　권한 : <%=m_level%></span>　
					<ul class="navbar-nav mr-auto">
						<li class="nav-item2">
							<a class="nav-link" href="<%=request.getContextPath()%>/Mup/m_update_form.sinsege_m?m_code=<%=m_code%>">마이페이지</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="<%=request.getContextPath()%>/Mlogout/m_logout.sinsege_m">로그아웃</a>
						</li>
					</ul>
				</div>
			</right>
		</nav>
<%	
	}
%>