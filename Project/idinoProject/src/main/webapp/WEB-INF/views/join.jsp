<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<%-- <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script type="text/javascript">
	$(document).on('click','#btnSave',function(e){
		e.preventDefault();
		$("#form").submit();
	});
	
	$(document).on('click','#btnCancle',function(e){
		e.preventDefault();
		location.href="${pageContext.request.contextPath}/user/getUserInfo"
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
					<label for="S_Num">학번</label>
					<input type="number" class="form-control" name="S_Num" id="S_Num" placeholder="학번을 입력해 주세요" required>
				</div>
				<div class="mb-3">
					<label for="Name">이름</label>
					<input type="text" class="form-control" name="name" id="Name" placeholder="이름을 입력해 주세요" required>
				</div>
				<div class="mb-3">
					<label for="Password">PW</label>
					<input type = "password" class="form-control" name="password" id="Password" placeholder="비밀번호을 입력해 주세요" required>
				</div>
				<div class="mb-3">
					<label for="Email">Email</label>
					<input type="text" class="form-control" name="email" id="Email" placeholder="Email을 입력해 주세요">
				</div>
				<div class="mb-3">
					<label for="Address">주소</label>
					<input type="text" class="form-control" name="address" id="Address" placeholder="주소를 입력해 주세요">
				</div>
				<div class="mb-3">
					<label for="Phone">전화번호</label>
					<input type="text" class="form-control" name="phone" id="Phone" placeholder="핸드폰 번호를 입력해 주세요">
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