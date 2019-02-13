<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="kr.or.sinsege.dao.Adao"%>
<%@ page import="kr.or.sinsege.dto.Assessment"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Assessment Update Form</title>
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
<body>
<%@ include file ="/module/top.jsp" %> <br><br>

<%
	Assessment a = (Assessment)request.getAttribute("a");
	System.out.println(a + " <- a");
	
	String dbno = a.getA_code();
	String dbgoods = a.getA_goods();
	String dbtitle = a.getA_title();
	String dbid = a.getA_id();
	String dbtext = a.getA_text();
	int dbscore = a.getA_score();
	String dbdate = a.getA_date().substring(0, 10);
	String dbupdate = a.getA_update().substring(0, 10);
	String dbcate = a.getA_cate();
%>
<center>
	<form id = "jb-content" action="<%= request.getContextPath() %>/Aup/a_update_pro.sinsege_a" method="post">
	<input type = "hidden" name = "a_id" value = "<%= m_id %>">	
		<fieldset>
		    <div class="form-group">
		      <h4><label>No</label></h4>
		      <input type="text" class="form-control" name="a_code" value="<%= dbno %>" readonly>
		    </div>
		     <div class="form-group">
		      <h4><label>Goods Name</label></h4>
		      <input type="text" class="form-control" name="a_goods" value="<%= dbgoods %>">
		    </div>
		     <div class="form-group">
		      <h4><label>Title</label></h4>
		      <input type="text" class="form-control" name="a_title" value="<%= dbtitle %>">
		    </div>
		     <div class="form-group">
		      <h4><label>Category</label></h4>
		      <input type="text" class="form-control" name="a_cate" value="<%= dbcate %>">
		    </div>
		     <div class="form-group">
		      <h4><label>ID</label></h4>
		      <input type="text" class="form-control" name="a_id" value="<%= dbid %>" readonly>
		    </div>
		     <div class="form-group">
		      <h4><label>Text</label></h4>
		      <textarea class="form-control" name="a_text" rows="8"><%= dbtext %></textarea>
		    </div>
		     <div class="form-group">
		      <h4><label>Score</label></h4>
		      <input type="text" class="form-control" name="a_score" value="<%= dbscore %>">
			 </div>
			 <div class="form-group">
		      <h4><label>Making Date</label></h4>
		      <input type="text" class="form-control" name="a_date" value="<%= dbdate %>" readonly>
			 </div>
			<button type="submit" class="btn btn-primary">Update</button>
		</fieldset>
	</form>
</center>
</body>
</html>