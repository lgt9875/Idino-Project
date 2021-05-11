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
	$(document).on('click','#btnCheck1',function(e){
		e.preventDefault();
		$("#form").submit();
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
		<h1 class = "align-center">아이디노</h1>	
	</div>
	
	<article>
		<div class="container" role="main">
			<c:if test="${not empty login}">
				<p class="align-center">${login.getName()}님 안녕하세요</p>
				<div class = "cover">
					<form name="formCheck1" id="form" role="form" method="GET" action="${pageContext.request.contextPath}/user/getUserInfo">
						<div class ="menu">
							<input type="hidden" name="sid" value="${login.getName()}" /> 
							<button type="button" class="btn btn-sm btn-primary m-1" id="btnCheck1">출석체크</button>
						</div>
					</form>
					<form name="formCheck2" id="form" role="form" method="post" action="${pageContext.request.contextPath}/user/getUserInfo">
						<div class=menu>
							<button type="button" class="btn btn-sm btn-primary" id="btnCheck2">출석확인</button>
						</div>
					</form>
				</div>
			</c:if>
		</div>
	</article>
</body>
</html>