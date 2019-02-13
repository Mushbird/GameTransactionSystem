<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="kr.or.sinsege.dao.Mdao"%>
<%@ page import="kr.or.sinsege.dto.Member"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta charset="EUC-KR">
<title>���������� - �� ���� ����</title>
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
<!-- middle �κ� (����ȭ��) -->
<%
Member member = (Member)request.getAttribute("member");
System.out.println(member + "<- member m_update_form.jsp");
%>
<%
if(m_level.equals("������")) {
%>
<br><br>
<center>
	<form id="jb-content" action="<%= request.getContextPath() %>/Mup/m_update_pro.sinsege_m" method="post">
		<fieldset>
			<div class="form-group">
		      <h4><label>ȸ�� �ڵ�</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_code" value="<%= member.getM_code() %>" readonly>
		    </div> <br><br>
			<div class="form-group">
		      <h4><label>���� ���</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="b_name" value="<%= member.getB_name() %>" readonly>
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>�Ǹ� ���</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="gl_name" value="<%= member.getGl_name() %>" readonly>
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>ȸ�� ID</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_id" value="<%= member.getM_id() %>" readonly>
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>ȸ�� PW</label></h4>
		      <input type="password" style='text-align:center' class="form-control" name="m_pw" value="<%= member.getM_pw() %>">
		    </div> <br><br>
	    	<div class="form-group">
		      <h4><label>ȸ�� ����</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_level" value="<%= member.getM_level() %>">
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>ȸ�� �̸�</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_name" value="<%= member.getM_name() %>">
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>���� ���</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_gold" value="<%= member.getM_gold() %>">
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>���� ����Ʈ</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_point" value="<%= member.getM_point() %>">
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>���� Ƚ��</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_count" value="<%= member.getM_count() %>" readonly>
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>���� ����</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_in" value="<%= member.getM_in().substring(0, 10) %>" readonly>
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>���� ����</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_date" value="<%= member.getM_date().substring(0, 10) %>" readonly>
		    </div> <br><br><br>
			<button type="submit" class="form-control btn btn-primary btn-lg">���� �ϱ�</button>
		</fieldset>
	</form>
</center>
<%	
} else {
%>
<center>
	<form id="jb-content" action="<%= request.getContextPath() %>/Mup/m_update_pro.sinsege_m" method="post">
		<fieldset>
			<div class="form-group">
		      <h4><label>ȸ�� �ڵ�</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_code" value="<%= member.getM_code() %>" readonly>
		    </div> <br><br>
			<div class="form-group">
		      <h4><label>���� ���</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="b_name" value="<%= member.getB_name() %>" readonly>
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>�Ǹ� ���</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="gl_name" value="<%= member.getGl_name() %>" readonly>
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>ȸ�� ID</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_id" value="<%= member.getM_id() %>" readonly>
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>ȸ�� PW</label></h4>
		      <input type="password" style='text-align:center' class="form-control" name="m_pw" value="<%= member.getM_pw() %>">
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>ȸ�� ����</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_level" value="<%= member.getM_level() %>" readonly>
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>ȸ�� �̸�</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_name" value="<%= member.getM_name() %>">
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>���� ���</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_gold" value="<%= member.getM_gold() %>"readonly>
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>���� ����Ʈ</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_point" value="<%= member.getM_point() %>" readonly>
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>���� Ƚ��</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_count" value="<%= member.getM_count() %>" readonly>
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>���� ����</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_in" value="<%= member.getM_in().substring(0, 10) %>" readonly>
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>���� ����</label></h4>
		      <input type="text" style='text-align:center' class="form-control" name="m_date" value="<%= member.getM_date().substring(0, 10) %>" readonly>
		    </div> <br><br><br>
		    <div class="form-group">
		   	 <h4><label>Ż�� �ϱ�</label></h4>
		    	<a href = "<%=request.getContextPath()%>/Mdel/m_delete_form.sinsege_m?m_code=<%=m_code%>"> Ż�� �ϱ�</a>
		    </div> <br><br><br>
			<button type="submit" class="form-control btn btn-primary btn-lg">���� �ϱ�</button>
		</fieldset>
	</form>
</center>
<%	
}
%>
	<div class="progress">
	  <div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%"></div>
	</div>
</body>
</html>