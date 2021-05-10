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

<style type="text/css">
.button{
	float: right;
	padding : 5px;
}
</style>
<script type="text/javascript">
	$(document).on('click', '#btnJoinForm',function(e){
		e.preventDefault();
		location.href = "${pageContext.request.contextPath}/user/join"
	});
	
	$(document).on('click', '#btnLoginForm',function(e){
		e.preventDefault();
		location.href = "${pageContext.request.contextPath}/user/login"
	});

</script>
</head>
<body>
<c:if test="${empty login}">
<div class="container">
	<img src="<spring:url value='/resources/images/Idino.png'/>">
	 <div class=button>
		<div class=button>
			<button type="button" class="btn btn-sm btn-primary" id="btnJoinForm">회원가입</button>
		</div>
		<div class=button>
			<button type="button" class="btn btn-sm btn-primary" id="btnLoginForm">로그인</button>
		</div>
		
	</div>
</div>
</c:if>
<c:if test="${not empty login}">
<div class="container">
	<img src="<spring:url value='/resources/images/Idino.png'/>">
	<div class=button>
		<p>${login.getS_Num()}님 안녕하세요</p>
		<button type="button" class="btn btn-sm btn-primary" id="btnLoginForm">로그아웃</button>
	</div>
</div>
</c:if>


	<article>
		<div class="container">
			<div class="table-responsive">
				<table class="table table-striped table-sm">
					<colgroup>
						<col style="width:15%;" />
						<col style="width:15;" />
						<col style="width:30%;" />
						<col style="width:30%;" />
						<col style="width:15%;" />
					</colgroup>
					<thead>
						<tr>
							<th class="align-center">과목명</th>
							<th class="align-center">강의시간</th>
							<th class="align-center">출석여부</th>
							<th class="align-center">출석상태</th>
							<th class="align-center">핸드폰번호</th>
						</tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${empty userInfo }" >
								<tr><td colspan="5" align="center">데이터가 없습니다.</td></tr>
							</c:when> 
							<c:when test="${!empty userInfo}">
								<c:forEach var="userInfo" items="${userInfo}">
									<tr>
										<td class="align-center"><c:out value="${userInfo.getS_Num()}"/></td>
										<td class="align-center"><c:out value="${userInfo.getName()}"/></td>
										<td class="align-center"><c:out value="${userInfo.getEmail()}"/></td>
										<td class="align-center"><c:out value="${userInfo.getAddress()}"/></td>
										<td class="align-center"><c:out value="${userInfo.getPhone()}"/></td>
									</tr>
								</c:forEach>
							</c:when>
						</c:choose>
					</tbody>
				</table>
			</div>
		</div>	
	</article>
</body>
</html>

