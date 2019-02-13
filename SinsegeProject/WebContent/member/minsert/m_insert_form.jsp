<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/main.css" />
<title>Assessment Insert Form</title>
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
		<center>
			<div class="progress">
			  <div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%"></div>
			</div> <br><br><br><br>
				<form id = "jb-content" action="<%= request.getContextPath() %>/Min/m_insert_pro.sinsege_m" method="post">
					  <fieldset>
					    <div class="form-group">
					      <h4><label>ID</label></h4>
					      <input type="text" class="form-control" name="m_id" placeholder="							    	                Registration ID">
					    </div> <br><br><br><br><br><br><br>
					     <div class="form-group">
					      <h4><label>Password</label></h4>
					      <input type="text" class="form-control" name="m_pw" placeholder="									Registration Password"> 
					      <small id="help" class="form-text text-muted">비밀번호를 정확히 입력하여 주세요 :)</small>
					    </div> <br><br><br><br><br><br><br>
					    <div class="form-group">
					      <h4><label>Name</label></h4>
					      <input type="text" class="form-control" name="m_name" placeholder="							    	             Registration Name">
					    </div> <br><br><br><br><br><br><br>
					    <button type="submit" class="form-control btn btn-primary btn-lg">R e g i s t e r　　　N o w !</button>
					  </fieldset>
				</form>
			<div class="progress">
			  <div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%"></div>
			</div>
		</center>
	</body> 
</html>