<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="shortcut icon" href="#">
<meta charset="EUC-KR">
<script type="text/javascript">
	$(document).on('click','#btnLogin',function(e){
		e.preventDefault();
		var theForm = document.form;
		if(theForm.sid.value=="" || theForm.password.value==""){
			alert("학번과 비밀번호를 입력해주세요")
		}else if(theForm.position.value==""){
			alert("직급을 선택해주세요")
		}
		
		else{
			$("#form").submit();
		}
	});
	
	$(document).on('click', '#btnJoinForm',function(e){
		e.preventDefault();
		location.href = "${pageContext.request.contextPath}/user/join"
	});
</script>
	

</head>
<style type="text/css">

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
		<h1 class = "align-center">로그인</h1>	
	</div>
	
	<article>
		<div class="container" role="main">
			<form name="form" id="form" role="form" method="post" action="${pageContext.request.contextPath}/user/loginPost">
				<div class="mb-3">
					<label for="sid">학번</label>
					<input type="number" class="form-control" name="sid" id="sid" placeholder="학번을 입력해 주세요" required/>
				</div>
				<div class="mb-3">
					<label for="password">비밀번호</label>
					<input type = "password" class="form-control" name="password" id="password" placeholder="비밀번호을 입력해 주세요" required/>
				</div>
				<div class="cover">
				   <!-- radio는 동일한 속성으로 갈라면 name이 같아야한다. -->
				   <!-- check :  사용자가 누르기전에 체크되어 있는 속성 -->
				   <input type="radio" id="position" name="position" value="관리자">관리자     
				   <input type="radio" id="position" name="position" value="학생">학생
				</div>
			
			</form>

			<div class = "cover">
				<div class ="menu">
					<button type="button" class="btn btn-sm btn-primary m-1" id="btnLogin">로그인</button>
				</div>
				
				<div class=menu>
					<button type="button" class="btn btn-sm btn-primary" id="btnJoinForm">회원가입</button>
				</div>
			</div>
			
		</div>
	</article>
</body>
</html>