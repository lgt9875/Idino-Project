<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<%-- <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<!DOCTYPE html>
<html>
<head>
<link rel="shortcut icon" href="#">
<meta charset="UTF-8">
<script type="text/javascript">
	$(document).on('click','#btnSave',function(e){
		e.preventDefault();
		var theForm = document.form;
		if(theForm.sid.value==""){
			alert("학번은 필수입력조건입니다. 입력해주세요");
			return theForm.sid.focus();
		}else if (theForm.name.value=="" ){
			alert("이름은 필수입력조건입니다. 입력해주세요");
			return theForm.name.focus();
		}else if (theForm.password.value==""){
			alert("비밀번호는 필수입력조건입니다. 입력해주세요");
			return theForm.password.focus();
		}else{
			$("#form").submit();
		}
		
	});
	
	$(document).on('click','#btnCancle',function(e){
		e.preventDefault();
		location.href="${pageContext.request.contextPath}/user/login"
	});
</script>
<style type="text/css">

.cover{
 	text-align:center;
}
.menu {
  display:inline-block;zoom:1;.display:inline;
}
.innerbutton{
	padding : 5px;
}

</style>
</head>

<body>
	<div class="container">
		<img src="<spring:url value='/resources/images/Idino.png'/>">
		<h1 class = "align-center">회원가입</h1>		 
	</div>
	<article>
		<div class="container" role="main">
			<form name="form" id="form" role="form" method="post" action="${pageContext.request.contextPath}/user/saveUserInfo">
				<div class="mb-3">
					<label for="sid">학번(*필수)</label>
					<input type="number" class="form-control" name="sid" id="sid" placeholder="학번을 입력해 주세요" required/>
				</div>
				<div class="mb-3">
					<label for="name">이름(*필수)</label>
					<input type="text" class="form-control" name="name" id="name" placeholder="이름을 입력해 주세요" required/>
				</div>
				<div class="mb-3">
					<label for="password">PW(*필수)</label>
					<input type = "password" class="form-control" name="password" id="password" placeholder="비밀번호을 입력해 주세요" required/>
				</div>
				<div class="mb-3">
					<label for="email">Email</label>
					<input type="text" class="form-control" name="email" id="email" placeholder="Email을 입력해 주세요">
				</div>
				<div class="mb-3">
					<label for="address">주소</label>
					<input type="text" class="form-control" name="address" id="address" placeholder="주소를 입력해 주세요">
				</div>
				<div class="mb-3">
					<label for="phone">전화번호</label>
					<input type="text" class="form-control" name="phone" id="phone" placeholder="핸드폰 번호를 입력해 주세요">
				</div>
			</form>

			<div class = "cover">
				<div class ="menu">
					<button type="button" class="btn btn-sm btn-primary m-1" id="btnSave">회원가입</button>
				</div>
				<div class ="menu">
					<button type="button" class="btn btn-sm btn-primary m-1" id="btnCancle">취소</button>
				</div>
			</div>
		</div>
	</article>
</body>
</html>