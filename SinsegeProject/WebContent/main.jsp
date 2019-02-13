<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>메인화면</title>

</head>
<body>
<div class="progress">
<div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%"></div>
</div>
<!-- top 부분 -->
<%@ include file ="/module/top.jsp" %>
<!-- main 부분 -->
	<div class="container"><br><br>
    	<h2 class="text-center ">환영합니다.</h2>
	</div>
</body>
</html>