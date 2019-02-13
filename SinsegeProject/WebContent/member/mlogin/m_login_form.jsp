<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!doctype html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v3.8.5">
    <title>로그인 화면</title>

    <!-- Bootstrap core CSS -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
  </head>
  
  <body id="wrapper" class="text-center">
    <form action="<%=request.getContextPath() %>/Mlogin/m_login_pro.sinsege_m" method="post" class="form-signin">
	  <!-- <img class="mb-4" src="#" alt="" width="300" height="300"> 가운데 이미지 -->
	  <h1>I VIEW</h1>
	  <h6 class = "text-muted" >ver 1.0</h6><br>
	  <label for="inputId" class="sr-only">ID</label>
	  <input type="text" name="m_id" id="inputId" class="form-control" placeholder="ID" required autofocus> <br>
	  <label for="inputPassword" class="sr-only">Password</label>
	  <input type="password" name="m_pw" id="inputPw" class="form-control" placeholder="Password" required>
	  <div class="checkbox mb-3">
	    <label>
	      <!-- <input type="checkbox" value="remember-me"> Remember me -->
	    </label>
	  </div>
	  <button class="btn btn-lg btn-primary btn-block" type="submit">L O G I N</button><br>
	  <p class="mt-5 mb-3 text-muted">&copy; Developer 30th, Group 4.</p>
	 <a href="<%=request.getContextPath()%>/Min/m_insert_form.sinsege_m" method="post" class="form-signup">Sign Up</a>
	</form>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
  </body>