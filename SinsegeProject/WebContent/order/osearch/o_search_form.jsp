<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
request.setCharacterEncoding("euc-kr");
%>
<form class="navbar navbar-expand-lg navbar-dark bg-dark" action="<%=request.getContextPath()%>/Gsearch/g_search_list2.sinsege" method="post">
	<select  class="form-control" name="send">
		<option value="o_code">등급</option>
		<option value="g_name">상품이름</option>
		<option value="o_total">금액</option>
	</select>&nbsp;&nbsp;
	검색어<input class="form-control" type="text" name="send_tx">
	<input class="btn btn-primary"type="submit" value="검색버튼">
	<br>
</form>