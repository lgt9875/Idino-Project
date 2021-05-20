<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<%@ page import = "java.net.URLDecoder"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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

.combo{
	padding : 5px;
}
.ui-dialog-titlebar-close {
    visibility: hidden;
}
.hidden-col{display : none;}
</style>

<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />
<script>
	$(document).on('click', '#btnSearchForm',function(e){
		e.preventDefault();
		var subjectName = $("#SubjectName option:selected").attr('value');
		//value3에 userPK 데이터
		alert(subjectName);
		/* var s_id = login.getSid(); */
		$.ajax({
			url :"${pageContext.request.contextPath}/user/getCheckingSearchInfo",
			type : 'POST',
			data : {
				s_id : '111',
				SubjectName : subjectName
			},
			dataType : "json",
			success : function(data){
				
			},
			error:function(request,status,error){
				
			},
			complete : function(data) {
				/* alert("출석체크를 완료하였습니다."); */
				/* location.reload(); */
			}
		});
		
	});
	
	$(document).on('click', '#btnLoginForm',function(e){
		e.preventDefault();
		location.href = "${pageContext.request.contextPath}/user/login"
	});
	
	$(document).on('click', '#btnChoiceForm',function(e){
		e.preventDefault();
		location.href = "${pageContext.request.contextPath}/user/choice"
	});
	
	
	$(document).on('click', '#btnLogOutForm',function(e){
		e.preventDefault();
		location.href = "${pageContext.request.contextPath}/user/logout"
	});
	
	
</script>

</head>
<body>

<c:if test="${not empty login}">
	<div class="container">
		<img src="<spring:url value='/resources/images/Idino.png'/>">
		<div class=button>
			<p>${login.getName()}님 안녕하세요</p>
			<button type="button" class="btn btn-sm btn-primary" id="btnChoiceForm">출석확인</button>
			<button type="button" class="btn btn-sm btn-primary" id="btnLogOutForm">로그아웃</button>
			
			
			<div class="combo">
				<select id="SubjectName">
					<c:forEach var="checkingList" items="${checkingList}">	
					    <option value="${checkingList.getC_SubjectName()}"><c:out value="${checkingList.getC_SubjectName()}"/></option>
				    </c:forEach>
				</select>
				
				<button type="button" class="btn btn-sm btn-primary" id="btnSearchForm">검색</button>
			</div>
			
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
							<th class="align-center">과목명</th>
							<th class="align-center">강의시간</th>
							<th class="align-center">요일</th>
							<th class="align-center">출석체크시간</th>
							<th class="align-center">출석상태</th>
						</tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${empty login }" >
								<tr><td colspan="5" align="center">데이터가 없습니다.</td></tr>
							</c:when> 
							<c:when test="${!empty login}">
								<c:forEach var="checkingList" items="${checkingList}">
									<tr>
										<td class="hidden-col"><c:out value="${login.getSid()}"/></td>
										<td class="align-center"><c:out value="${checkingList.getC_SubjectName()}"/></td>
										<td class="align-center">
											<fmt:parseDate value='${checkingList.getcS_time()}' var='StartTime' pattern='yyyy-MM-dd HH:mm:ss'/>
											<fmt:parseDate value='${checkingList.getcE_time()}' var='EndTime' pattern='yyyy-MM-dd HH:mm:ss'/>
											<fmt:formatDate value="${StartTime}" pattern="HH:mm"/>
											~
											<fmt:formatDate value="${EndTime}" pattern="HH:mm"/>
										</td>
										<td class="align-center"><c:out value="${checkingList.getC_yoil()}"/></td>
										<td class="align-center">
											<fmt:parseDate value='${checkingList.getC_checkingTime()}' var='checkingTime' pattern='yyyy-MM-dd HH:mm:ss'/>
											<fmt:formatDate value="${checkingTime}" pattern="HH:mm:ss"/>
										</td>
										<td class="align-center"><c:out value="${checkingList.getC_state()}"/></td>
									</tr>
								</c:forEach>
							</c:when>
						</c:choose>
					</tbody>
				</table>
			</div>
		</div>	
	</article>
	

	 
</c:if>
</body>
</html>

