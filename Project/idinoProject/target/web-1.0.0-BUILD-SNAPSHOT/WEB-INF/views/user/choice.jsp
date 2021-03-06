<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%> 
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
              
<!DOCTYPE html>
<html>
<head>
<link rel="shortcut icon" href="#">
<meta charset="UTF-8">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />
<script>
	$(document).on('click','#btnCheck1',function(e){
		e.preventDefault();
		$("#form").submit();
	});
	
	$(document).on('click', '#btnLogOutForm',function(e){
		e.preventDefault();
		location.href = "${pageContext.request.contextPath}/user/logout"
	});
	
	$(document).on('click', '#btnSearch',function(e){
		
		e.preventDefault();
		/* alert($("#SubjectName option:selected").text()); */
		
		$("#formCheck2").submit();
	}); 
	 /* alert($("#SubjectName option:selected").attr('value')); */
	
	function OnChange()
	{    
		var subject = $("#selectSubject option:selected").attr('value');
		document.getElementById('SubjectName').setAttribute('value',subject);
	}
	 
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
					<form name="formCheck2" id="formCheck2" role="form" method="GET" action="${pageContext.request.contextPath}/user/getCheckingInfo">
						<div class=menu>
						<select id="selectSubject" name="selectSubject"onchange="OnChange();">
								<option value=""><c:out value="전체"/></option>
								<c:forEach var="comboSubjectList" items="${comboSubjectList}">	
								    <option value="${comboSubjectList.getTs_name()}"><c:out value="${comboSubjectList.getTs_name()}"/></option>
							    </c:forEach>
						</select>
							<input type="hidden" id="s_id" name=s_id value="${login.getName()}" />
							<input type="hidden" id="SubjectName" name=SubjectName value="${(SubjectName).attr('value')}" />
							
							
							<button type="button" class="btn btn-sm btn-primary" id="btnSearch">출석확인</button>
						</div>
					</form>
						<div class=menu>
							<button type="button" class="btn btn-sm btn-primary" id="btnLogOutForm">취소</button>
						</div>
				</div>
			</c:if>
		</div>
	</article>
</body>
</html>
