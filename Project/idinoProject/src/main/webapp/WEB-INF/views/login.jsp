<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%> 
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%-- <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script type="text/javascript">
	$(document).on('click','#btnLogin',function(e){
		e.preventDefault();
		$("#form").submit();
	});
	
	$(document).on('click','#btnCancle',function(e){
		e.preventDefault();
		location.href="${pageContext.request.contextPath}/user/getUserInfo"
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
					<label for="S_Num">학번</label>
					<input type="number" class="form-control" name="S_Num" id="S_Num" placeholder="학번을 입력해 주세요" required>
				</div>
				<div class="mb-3">
					<label for="Password">비밀번호</label>
					<input type = "password" class="form-control" name="password" id="Password" placeholder="비밀번호을 입력해 주세요" required>
				</div>
			
			</form>

			<div class = "cover">
				<div class ="menu">
					<button type="button" class="btn btn-sm btn-primary m-1" id="btnLogin">로그인</button>
				</div>
				
				<div class ="menu">
					<button type="button" class="btn btn-sm btn-primary m-1" id="btnCancle">취소</button>
				</div>
			</div>
			
		</div>
	</article>
</body>
</html>