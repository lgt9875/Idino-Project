<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<%@ page import = "java.net.URLDecoder"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
.ui-dialog-titlebar-close {
    visibility: hidden;
}
.hidden-col{display : none;}
</style>

<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />
<script>
	
$(document).on('click', '#btnLogOutForm',function(e){
	e.preventDefault();
	location.href = "${pageContext.request.contextPath}/user/logout"
});
	
$(document).on('click', '#btnSearch',function(e){
	
	e.preventDefault();
	/* alert($("#SubjectName option:selected").text()); */
	
	$("#formCheck2").submit();
}); 	
function OnChange()
{    
	var subject = $("#selectSubject option:selected").attr('value');
	document.getElementById('SubjectName').setAttribute('value',subject);
}
</script>

</head>
<body>
	<div class="container">
		<img src="<spring:url value='/resources/images/Idino.png'/>">
		<div class=button>
			<p>${login.getName()}님 안녕하세요</p>
			<form name="formCheck2" id="formCheck2" role="form" method="GET" action="${pageContext.request.contextPath}/user/getCheckingInfo">
				<select id="selectSubject" name="selectSubject"onchange="OnChange();">
						<option value=""><c:out value="전체"/></option>
						<c:forEach var="comboManageSubjectList" items="${comboManageSubjectList}">	
						    <option value="${comboManageSubjectList.getS_name()}"><c:out value="${comboManageSubjectList.getS_name()}"/></option>
					    </c:forEach>
				</select>
				<input type="hidden" id="s_id" name=s_id value="${login.getName()}" />
				<input type="hidden" id="SubjectName" name=SubjectName value="${(SubjectName).attr('value')}" />
				<input type="hidden" id="Position" name=Position value="${login.getPosition()}" />
				<button type="button" class="btn btn-sm btn-primary" id="btnSearch">출석확인</button>
				<button type="button" class="btn btn-sm btn-primary" id="btnLogOutForm">로그아웃</button>
			</form>
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
							<th class="align-center">학번</th>
							<th class="align-center">과목명</th>
							<th class="align-center">출석</th>
							<th class="align-center">지각</th>
							<th class="align-center">결석</th>
							
						</tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${empty login }" >
								<tr><td colspan="5" align="center">데이터가 없습니다.</td></tr>
							</c:when> 
							<c:when test="${!empty login}">
								<c:forEach var="managementList" items="${managementList}">
									<tr>
										<td class="hidden-col"><c:out value="${login.getSid()}"/></td>
										<td class="align-center"><c:out value="${managementList.getM_sid()}"/></td>
										<td class="align-center"><c:out value="${managementList.getM_subName()}"/></td>
										<td class="align-center"><c:out value="${managementList.getM_attendance()}"/></td>
										<td class="align-center"><c:out value="${managementList.getM_lateness()}"/></td>
										<td class="align-center"><c:out value="${managementList.getM_absence()}"/></td>
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
