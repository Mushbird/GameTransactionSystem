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
<%@ include file ="/module/top.jsp" %> <br><br>
<center>
	<form id = "jb-content" action="<%= request.getContextPath() %>/Ain/a_insert_pro.sinsege_a" method="post">
	<input type = "hidden" name = "a_id" value = "<%= m_id %>">
		  <fieldset>
		    <div class="form-group">
		      <h4><label>Title</label></h4>
		      <input type="text" class="form-control" name="a_title" placeholder="							    	          제목을 작성해주세요">
		    </div> <br><br><br><br><br><br><br>
		     <div class="form-group">
		      <h4><label>Goods Name</label></h4>
		      <input type="text" class="form-control" name="a_goods" placeholder="						제품명을 작성해주세요 (제품 이름과 똑같이 써주세요)">
		      <small id="help" class="form-text text-muted">제품명을 정확히 적어주셔야 빠른 피드백을 받으실 수 있습니다!</small>
		    </div> <br><br><br><br><br><br><br>
		    <div class="form-group">
		      <h4><label>Category</label></h4>
		      <select class="form-control" name="a_cate">
		        <option value="무기">무기</option>
		        <option value="갑옷">갑옷</option>
		        <option value="장신구">장신구</option>
		      </select>
		    </div> <br><br><br><br><br><br><br>
		    <div class="form-group">
		      <h4><label>Grade</label></h4>
		      <select class="form-control" name="a_score">
		        <option value=1>★☆☆☆☆</option>
		        <option value=2>★★☆☆☆</option>
		        <option value=3>★★★☆☆</option>
		        <option value=4>★★★★☆</option>
		        <option value=5>★★★★★</option>
		      </select>
		    </div> <br><br><br><br><br><br><br>
		    <div class="form-group">
		      <h4><label>Text</label></h4>
		      <textarea class="form-control" name="a_text" rows="8"></textarea>
		    </div> <br><br>
		    <div class="form-group">
		      <h4><label>File</label></h4>
		      <input type="file" class="form-control-file">
		      <small id="fileHelp" class="form-text text-muted">용량이 큰 파일 첨부 시 업로드 속도에 영향이 있을 수 있습니다.</small>
		      <small id="fileHelp" class="form-text text-muted">다음 버젼부터 이용 가능합니다.</small>
		    </div> <br><br><br><br><br><br><br>
		    <button type="submit" class="btn btn-primary">Register</button>
		  </fieldset>
	</form>
</center>
</body>
</html>