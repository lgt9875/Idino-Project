<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
 integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
  crossorigin="anonymous"></script>
  
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" 
integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

<title>출석체크 시스템</title>
<style type="text/css">
.align-center{
	text-align:center;
}
.cover{
 	text-align:center;
}
.menu {
  display:inline-block;zoom:1;.display:inline;
}
.innerbutton{
	padding : 5px;
}
body {
  padding-top: 10px;
  padding-bottom: 30px;
}
</style>

</head>
<body>
<!-- <script type="text/javascript">
$(function(){
	$('.content').click(function(){
		$('.content').hide();
	});
});
</script> -->
	<div class="container">
		<img src="<spring:url value='/resources/images/Idino.png'/>">
		<h1 class = "align-center">회원가입</h1>		 
	</div>
	<article>
		<div class="container" role="main">
			<form name="form" id="form" role="form" method="post" action="${pageContext.request.contextPath}/board/saveBoard">
				<div class="mb-3">
					<label for="title">학번</label>
					<input type="text" class="form-control" name="title" id="title" placeholder="제목을 입력해 주세요">
				</div>
				<div class="mb-3">
					<label for="reg_id">이름</label>
					<input type="text" class="form-control" name="reg_id" id="reg_id" placeholder="이름을 입력해 주세요">
				</div>
				<div class="mb-3">
					<label for="content">PW</label>
					<input class="form-control" name="content" id="content" placeholder="내용을 입력해 주세요">
				</div>
				<div class="mb-3">
					<label for="tag">Email</label>
					<input type="text" class="form-control" name="tag" id="tag" placeholder="태그를 입력해 주세요">
				</div>
				<div class="mb-3">
					<label for="tag">주소</label>
					<input type="text" class="form-control" name="tag" id="tag" placeholder="태그를 입력해 주세요">
				</div>
				<div class="mb-3">
					<label for="tag">전화번호</label>
					<input type="text" class="form-control" name="tag" id="tag" placeholder="태그를 입력해 주세요">
				</div>
			</form>

			<div class = "cover">
				<div class ="menu">
					<button type="button" class="btn btn-sm btn-primary m-1" id="btnSave">회원가입</button>
				</div>
				<div class ="menu">
					<div class ="content">
						<button type="button" class="btn btn-sm btn-primary m-1" id="btnList">취소</button>
					</div>	
				</div>
			</div>
		</div>
	</article>
</body>
</html>