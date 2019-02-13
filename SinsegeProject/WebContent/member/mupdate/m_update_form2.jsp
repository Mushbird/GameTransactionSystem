<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="kr.or.sinsege.dao.Mdao"%>
<%@ page import="kr.or.sinsege.dto.Member"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta charset="EUC-KR">
<title>회원 수정 화면</title>
</head>
<body>
<!-- top 부분 -->
<%@ include file="/module/top.jsp" %>
<!-- middle 부분 -->
<%
request.setCharacterEncoding("euc-kr");
//mSelectforUpdate 메서드 호출 후 리턴
Member member = (Member)request.getAttribute("member");
System.out.println(member + "<- member m_update_form.jsp");

if(session.getAttribute("m_level").equals("관리자")) {
%>
<form action="<%= request.getContextPath() %>/Mup/m_update_pro.sinsege_m" method="post">
<input type="hidden" name="m_code" value="<%= member.getM_code() %>">
<input type="hidden" name="b_name" value="<%= member.getB_name() %>">
<input type="hidden" name="gl_name" value="<%= member.getGl_name() %>">
<input type="hidden" name="m_id" value="<%= member.getM_id() %>">
<input type="hidden" name="m_count" value="<%= member.getM_count() %>">
<table class="table table-hover">
	<tr class="table-active">
		<td>회원 수정 화면</td>
		<td></td>
	</tr>
	<tr>
		<td>회원 코드 : </td>
		<td><%= member.getM_code() %></td>
	</tr>
	<tr>
		<td>구매 등급 : </td>
		<td><%= member.getB_name() %></td>
	</tr>
	<tr>
		<td>판매 등급 : </td>
		<td><%= member.getGl_name() %></td>
	</tr>
	<tr>
		<td>회원 ID : </td>
		<td><%= member.getM_id() %></td>
	</tr>
	<tr>
		<td>회원 PW : </td>
		<td><input type="text" name="m_pw" size="20" value="<%= member.getM_pw() %>"></td>
	</tr>
	<tr>
		<td>회원 권한 : </td>
		<td>
			<select name="m_level">
				<option value="<%= member.getM_level() %>"><%= member.getM_level() %></option>
				<option value="관리자">관리자</option>
				<option value="회원">회원</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>회원 이름 : </td>
		<td><input type="text" name="m_name" size="20" value="<%= member.getM_name() %>"></td>
	</tr>
	<tr>
		<td>보유 골드 : </td>
		<td><input type="text" name="m_gold" size="20" value="<%= member.getM_gold() %>"></td>
	</tr>
	<tr>
		<td>적립 포인트 : </td>
		<td><input type="text" name="m_point" size="20" value="<%= member.getM_point() %>"></td>
	</tr>
	<tr>
		<td>구매 횟수 : </td>
		<td><%= member.getM_count() %></td>
	</tr>
	<tr>
		<td>가입 일자 : </td>
		<td><input type="text" name="m_in" size="20" value="<%= member.getM_in() %>" readonly></td>
	</tr>
	<tr>
		<td>수정 일자 : </td>
		<td><input type="text" name="m_date" size="20" value="<%= member.getM_date() %>" readonly></td>
	</tr>
	<tr>
		<td><input type="submit" value="회원수정버튼"></td>
		<td></td>
	</tr>
</table>
</form>
<%	
} else if(session.getAttribute("m_level").equals("회원")) {
%>
<form action="<%= request.getContextPath() %>/Mup/m_update_pro.sinsege_m" method="post">
<input type="hidden" name="m_code" size="20" value="<%= member.getM_code() %>">
<input type="hidden" name="b_name" value="<%= member.getB_name() %>">
<input type="hidden" name="gl_name" value="<%= member.getGl_name() %>">
<input type="hidden" name="m_date" value="<%= member.getM_date() %>">
<input type="hidden" name="m_level" value="<%= member.getM_level() %>">
<input type="hidden" name="m_gold" value="<%= member.getM_gold() %>">
<input type="hidden" name="m_point" value="<%= member.getM_point() %>">
<input type="hidden" name="m_count" value="<%= member.getM_count() %>">
<table class="table table-hover">
	<tr class="table-active">
		<td>내 정보 수정</td>
		<td></td>
	</tr>
	<tr>
		<td>구매 등급 : </td>
		<td><%= member.getB_name() %></td>
	</tr>
	<tr>
		<td>판매 등급 : </td>
		<td><%= member.getGl_name() %></td>
	</tr>
	<tr>
		<td>회원 아이디 : </td>
		<td><%= member.getM_id() %></td>
	</tr>
	<tr>
		<td>회원 비밀번호 : </td>
		<td><input type="text" name="m_pw" size="20" value="<%= member.getM_pw() %>"></td>
	</tr>
	<tr>
		<td>회원 권한 : </td>
		<td><%= member.getM_level() %></td>
	</tr>
	<tr>
		<td>회원 이름 : </td>
		<td><input type="text" name="m_name" size="20" value="<%= member.getM_name() %>"></td>
	</tr>
	<tr>
		<td>보유 골드  : </td>
		<td><%= member.getM_gold() %></td>
	</tr>
	<tr>
		<td>적립 포인트 : </td>
		<td><%= member.getM_point() %></td>
	</tr>
	<tr>
		<td>총 구매 횟수 : </td>
		<td><%= member.getM_count() %></td>
	</tr>
	<tr>
		<td>회원가입날짜 : </td>
		<td><input type="text" name="m_in" size="20" value="<%= member.getM_in() %>" readonly></td>
	</tr>
	<tr>
		<td><input type="submit" value="회원수정버튼"></td>
		<td><a href = "<%=request.getContextPath()%>/Mdel/m_delete_form.sinsege_m?m_code=<%=m_code%>">회원삭제버튼</a></td>
		</td>
	</tr>
</table>
</form>
<%	
}
%>
</body>
</html>