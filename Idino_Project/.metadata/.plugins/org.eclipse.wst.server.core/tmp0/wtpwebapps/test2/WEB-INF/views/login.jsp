<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
 integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" 
 crossorigin="anonymous"></script>
 
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" 
integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

<title>�⼮üũ �ý���</title>
	

</head>
<style type="text/css">
body {
  padding-top: 10px;
  padding-bottom: 30px;
}
.align-center{
	text-align:center;
}
.cover{
 	text-align:center;
}
.menu {
  display:inline-block;zoom:1;.display:inline;
}
</style>
<body>
	<div class="container">
		<img src="<spring:url value='/resources/images/Idino.png'/>">
		<h1 class = "align-center">�α���</h1>	
	</div>
	
	<article>
		<div class="container" role="main">
			<form name="form" id="form" role="form" method="post" action="${pageContext.request.contextPath}/board/saveBoard">
				<div class="mb-3">
					<label for="title">�й�</label>
					<input type="text" class="form-control" name="title" id="title" placeholder="������ �Է��� �ּ���">
				</div>
				<div class="mb-3">
					<label for="reg_id">��й�ȣ</label>
					<input type="text" class="form-control" name="reg_id" id="reg_id" placeholder="�̸��� �Է��� �ּ���">
				</div>
			
			</form>

			<div class = "cover">
				<div class ="menu">
					<button type="button" class="btn btn-sm btn-primary m-1" id="btnSave">�α���</button>
				</div>
			</div>
			
		</div>
	</article>
</body>
</html>