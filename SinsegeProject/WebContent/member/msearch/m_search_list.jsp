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
<!-- top 부분 -->
<%@ include file="/module/top.jsp" %>
<!-- middle 부분 -->
<%@ include file="/member/msearch/m_search_form.jsp" %>
<%
	List list=(List)request.getAttribute("list"); // 리스트 정보
	int listcount=((Integer)request.getAttribute("listcount")).intValue(); // 글 수
	int nowpage=((Integer)request.getAttribute("page")).intValue(); // 현재 페이지 수
	int maxpage=((Integer)request.getAttribute("maxpage")).intValue(); // 최대 페이지 수
	int startpage=((Integer)request.getAttribute("startpage")).intValue(); // 현재 페이지에 표시할 첫 페이지 수
	int endpage=((Integer)request.getAttribute("endpage")).intValue(); // 현재 페이지에 표시할 끝 페이지 수
	
	System.out.println(listcount + " : listcount");
	System.out.println(nowpage + " : nowpage");
	System.out.println(endpage + " : endpage");
	System.out.println(maxpage + " : maxpage");

%>
<table class="table table-hover">
<thead>
	<tr class="table-active">
		<td>회원코드</td>
		<td>구매자등급</td>
		<td>판매자등급</td>
		<td>회원 아이디</td>
		<td>회원 비밀번호</td>
		<td>회원 권한</td>
		<td>회원 이름</td>
		<td>보유 골드</td>
		<td>총 포인트</td>
		<td>총 구매횟수</td>
		<td>회원가입날짜</td>
		<td>회원수정날짜</td>
		<td>수  정</td>
		<td>삭  제</td>
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
				<a href = "<%=request.getContextPath()%>/Mup/m_update_form.sinsege_m?m_code=<%=m.getM_code()%>">수정</a>
			</td>
			<td>
				<a href = "<%=request.getContextPath()%>/Mdel/m_delete_pro.sinsege_m?m_code=<%=m.getM_code()%>">삭제</a>
			</td>
		</tr>
<%	
	}
%>
	</tbody>
</table>

<%if(nowpage<=1){ %>
	[이전]&nbsp;
	<%}else{ %>
	<a href="<%= request.getContextPath() %>/Msearch/m_search_list.sinsege_m?page=<%= nowpage-1 %>">이전</a>&nbsp;
	<%} %>
	
	<%for(int a=startpage; a<=endpage; a++){
		if(a==nowpage){%>
		[<%=a %>]
		<%}else{ %>
		<a href="<%= request.getContextPath() %>/Msearch/m_search_list.sinsege_m?page=<%=a %>">[<%=a %>]</a>&nbsp;
		<%} %>
	<%} %> 
	
	<%if(nowpage>=maxpage){ %>
	[다음]
	<%}else{ %>
	<a href="<%= request.getContextPath() %>/Msearch/m_search_list.sinsege_m?page=<%= nowpage+1 %>">다음</a>&nbsp;
	<%}%>

</body>
</html>