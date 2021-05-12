<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>

<%-- <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>     
<!DOCTYPE html>
<html>
<head>
<link rel="shortcut icon" href="#">
<meta charset="UTF-8">

<style type="text/css">
.button{
	float: right;
	padding : 5px;
}
</style>

<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
	$(document).on('click', '#btnJoinForm',function(e){
		e.preventDefault();
		location.href = "${pageContext.request.contextPath}/user/join"
	});
	
	$(document).on('click', '#btnLoginForm',function(e){
		e.preventDefault();
		location.href = "${pageContext.request.contextPath}/user/login"
	});
	
	$(document).on('click', '#btnLogOutForm',function(e){
		e.preventDefault();
		location.href = "${pageContext.request.contextPath}/user/logout"
	});
	
	$(document).ready(function(){
		$("#update input").on('click',function(){ 
			var currentRow = $(this).closest('tr');
			var col0 = currentRow.find('td:eq(0)').text();
			var col1 = currentRow.find('td:eq(1)').text();
			var col2 = currentRow.find('td:eq(2)').text();
			
			alert("col0 = "+ col0 +
					", col1 = "+ col1 +
					", col2 = "+ col2);
			
			url = "${pageContext.request.contextPath}/user/createCode";
            var content = "col0 = "+ col0 +", col1 = "+ col1 +", col2 = "+ col2;
			
			$("#img").attr("src", url+"?content="+content);
			
					
			
			
		/* 	var str = ""
			var tdArr = new Array();	// 배열 선언
			var checkBtn = $(this);
			
			// checkBtn.parent() : checkBtn의 부모는 <td>이다.
			// checkBtn.parent().parent() : <td>의 부모이므로 <tr>이다.
			var tr = checkBtn.parent().parent();
			var td = tr.children();
			alert("클릭한 Row의 모든 데이터 : "+tr.text());
			console.log("클릭한 Row의 모든 데이터 : "+tr.text()); */
		});
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
	<article>
		<div class="container">
			<div class="table-responsive">
				<table id="example-table-2" class="table table-striped table-sm text-center">
					<colgroup>
						<col style="width:15%;" />
						<col style="width:30&;" />
						<col style="width:20%;" />
						<col style="width:15%;" />
						<col style="width:15%;" />
					</colgroup>
					<thead>
						<tr>
							<th class="align-center">과목코드</th>
							<th class="align-center">과목명</th>
							<th class="align-center">강의시간</th>
							<th class="align-center">출석여부</th>
							<th class="align-center">출석상태</th>
						</tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${empty login }" >
								<tr><td colspan="5" align="center">데이터가 없습니다.</td></tr>
							</c:when> 
							<c:when test="${!empty login}">
								<c:forEach var="takingSubjectList" items="${takingSubjectList}">
									<tr>
										<td class="align-center"><c:out value="${takingSubjectList.getTs_sid()}"/></td>
										<td class="align-center"><c:out value="${takingSubjectList.getTs_name()}"/></td>
										<td class="align-center"><c:out value="${takingSubjectList.getTsS_time()} ~ ${takingSubjectList.getTsE_time()}"/></td>
										<td id="update"><input type="button" class="btn btn-sm btn-primary" value="출석체크"/></td>
									</tr>
								</c:forEach>
							</c:when>
						</c:choose>
					</tbody>
				</table>
			</div>
		</div>	
	</article>
	<img id="img" style="display:none" onload="this.style.display='block'"/>
</div>
</c:if>
<c:if test="${not empty login}">
	<div class="container">
		<img src="<spring:url value='/resources/images/Idino.png'/>">
		<div class=button>
			<p>${login.getName()}님 안녕하세요</p>
			<button type="button" class="btn btn-sm btn-primary" id="btnLogOutForm">출석확인</button>
			<button type="button" class="btn btn-sm btn-primary" id="btnLogOutForm">로그아웃</button>
		</div>
	</div>
	<article>
		<div class="container">
			<div class="table-responsive">
				<table id="example-table-2" class="table table-striped table-sm text-center">
					<colgroup>
						<col style="width:15%;" />
						<col style="width:30&;" />
						<col style="width:20%;" />
						<col style="width:15%;" />
						<col style="width:15%;" />
					</colgroup>
					<thead>
						<tr>
							<th class="align-center">과목코드</th>
							<th class="align-center">과목명</th>
							<th class="align-center">강의시간</th>
							<th class="align-center">출석여부</th>
							<th class="align-center">출석상태</th>
						</tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${empty login }" >
								<tr><td colspan="5" align="center">데이터가 없습니다.</td></tr>
							</c:when> 
							<c:when test="${!empty login}">
								<c:forEach var="takingSubjectList" items="${takingSubjectList}">
									<tr>
										<td class="align-center"><c:out value="${takingSubjectList.getTs_sid()}"/></td>
										<td class="align-center"><c:out value="${takingSubjectList.getTs_name()}"/></td>
										<td class="align-center"><c:out value="${takingSubjectList.getTsS_time()} ~ ${takingSubjectList.getTsE_time()}"/></td>
										<!-- <td><input type="button" class="checkBtn" value="출석체크"/></td> -->
										<td id="update"><input type="button" class="btn btn-sm btn-primary" value="출석체크"/></td>
									</tr>
								</c:forEach>
							</c:when>
						</c:choose>
					</tbody>
				</table>
			</div>
		</div>	
	</article>
	<img id="img" style="display:none" onload="this.style.display='block'"/>
</c:if>
</body>
</html>

