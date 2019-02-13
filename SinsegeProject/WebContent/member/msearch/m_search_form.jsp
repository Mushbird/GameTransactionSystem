<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Search Form</title>
</head>
<body>
	<form class="navbar navbar-expand-lg navbar-dark bg-dark" action="<%=request.getContextPath() %>/Msearch/m_search_list.sinsege_m" method="post">
		<select class="form-control" name="sk">
			<option value="m_code">회원코드</option>
			<option value="b_name">구매자등급</option>
			<option value="gl_name">판매자등급</option>
			<option value="m_id">아이디</option>
			<option value="m_level">권한</option>
			<option value="m_name">이름</option>
		</select>&nbsp;&nbsp;
		<input class="form-control" type="text" name="sv" />
		<input class="btn btn-primary" type="submit" value="검색버튼" />
	</form>
</body>
</html>