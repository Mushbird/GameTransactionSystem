<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "kr.or.sinsege.dto.Grade" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>마이 페이지 - 구매자 등급</title>
<style>
#jb-container {
        width: 940px;
        margin: 0px auto;
        padding: 20px;
        border: 1px solid #bcbcbc;
      }
      #jb-content {
        width: 900px;
        padding: 80px;
        margin-bottom: 80px;
        float: center;
        border: 1px solid #bcbcbc;
      }
</style>
</head>
<!-- Top 부분 -->
<%@ include file="/module/mypage.jsp" %>
<!-- middle 부분 (구매자 등급 화면) -->
<table class="table table-hover">
<thead>
	<tr class="table-active">
		<td>판매자 등급코드</td>
		<td>등급명</td>
		<td>할인 가격</td>
		<td>수정 아이디</td>
		<td>수정 날짜</td>
		<td>수  정</td>	
	</tr>
</thead>
<tbody>
<%
	ArrayList<Grade> result = (ArrayList<Grade>)request.getAttribute("arraylistbgrade");
	for(int i = 0; i<result.size(); i++){
		Grade bgrade = result.get(i);
	
%>
	<tr>
		<td><%= bgrade.getG_grade() %></td><td><%= bgrade.getGl_name() %><td><%= bgrade.getGl_price() %></td><td><%= bgrade.getGl_id() %></td><td><%= bgrade.getGl_date() %></td>
		<td>
			<a href = "<%=request.getContextPath()%>/Ggrade/g_grade_update_form.sinsege_m?g_grade=<%=bgrade.getG_grade()%>">수정</a>
		</td>
	</tr>
<%	
	}
%>
</tbody>
</table>
</body>
</html>