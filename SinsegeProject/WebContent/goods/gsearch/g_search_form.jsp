<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
request.setCharacterEncoding("euc-kr");
%>
<form class="navbar navbar-expand-lg navbar-dark bg-dark" action="<%=request.getContextPath()%>/Gsearch/g_search_list2.sinsege" method="post">
	<select  class="form-control" name="send">
		<option value="g_date">�����</option>
		<option value="gl_name">���</option>
		<option value="g_cate">ī�װ�</option>
		<option value="g_name">������ �̸�</option>
		<option value="g_id">�Ǹ��� ID</option>
	</select>&nbsp;&nbsp;
	<input class="form-control" type="date" name="send_start">&nbsp;~
	<input class="form-control" type="date" name="send_end">&nbsp;&nbsp;
	�˻���<input class="form-control" type="text" name="send_tx">
	<input class="btn btn-primary"type="submit" value="�˻���ư">
	<br>
</form>