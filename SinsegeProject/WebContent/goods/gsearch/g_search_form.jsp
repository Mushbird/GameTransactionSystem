<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
request.setCharacterEncoding("euc-kr");
%>
<form class="navbar navbar-expand-lg navbar-dark bg-dark" action="<%=request.getContextPath()%>/Gsearch/g_search_list2.sinsege" method="post">
	<select  class="form-control" name="send">
		<option value="g_date">등록일</option>
		<option value="gl_name">등급</option>
		<option value="g_cate">카테고리</option>
		<option value="g_name">아이템 이름</option>
		<option value="g_id">판매자 ID</option>
	</select>&nbsp;&nbsp;
	<input class="form-control" type="date" name="send_start">&nbsp;~
	<input class="form-control" type="date" name="send_end">&nbsp;&nbsp;
	검색어<input class="form-control" type="text" name="send_tx">
	<input class="btn btn-primary"type="submit" value="검색버튼">
	<br>
</form>