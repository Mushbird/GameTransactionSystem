<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title> 구매 완료 팝업창 </title>
</head>
<body>
<script type="text/javascript">
	alert('구매 완료!');
	location.href='<%= request.getContextPath()%>/Gsearch/g_search_list.sinsege';
</script>
</body>
</html>