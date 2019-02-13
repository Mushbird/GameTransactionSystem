<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "kr.or.sinsege.dto.Grade" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���������� - �Ǹ��� ���</title>
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
<!-- Top �κ� -->
<%@ include file="/module/mypage.jsp" %>
<!-- middle �κ� (�Ǹ��� ���ȭ��) -->
<table class="table table-hover">
<thead>
	<tr class="table-active">
		<td>������ ����ڵ�</td>
		<td>��޸�</td>
		<td>��� ����</td>
		<td>���� ������</td>
		<td>���� ���̵�</td>
		<td>���� ��¥</td>
		<td>��  ��</td>		
	</tr>
</thead>
<tbody>
<%
	ArrayList<Grade> result = (ArrayList<Grade>)request.getAttribute("arraylistbgrade");
	for(int i = 0; i<result.size(); i++){
		Grade bgrade = result.get(i);
	
%>
	<tr>
		<td><%= bgrade.getB_grade() %></td><td><%= bgrade.getB_name() %><td><%= bgrade.getB_count() %></td><td><%= bgrade.getB_per() %></td><td><%= bgrade.getB_id() %></td><td><%= bgrade.getB_date() %></td>
		<td>
			<a href = "<%=request.getContextPath()%>/Bgrade/b_grade_update_form.sinsege_m?b_grade=<%=bgrade.getB_grade()%>">����</a>
		</td>
	</tr>
<%	
	}
%>
</tbody>
</table>
</body>
</html>