<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
 integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" 
 crossorigin="anonymous"></script>
 
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" 
integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

<title>출석체크 시스템</title>
<style type="text/css">
body {
  padding-top: 10px;
  padding-bottom: 30px;
}
.button{
	float: right;
	padding : 5px;
}
.th{
 	text-align:center;
}
</style>
<script type="text/javascript">


</script>
</head>
<body>
	<div class="container">
		<img src="<spring:url value='/resources/images/Idino.png'/>">
		 <div class=button>
			<div class=button>
				<button type="button" class="btn btn-sm btn-primary" id="btnWriteForm">회원가입</button>
			</div>
			<div class=button>
				<button type="button" class="btn btn-sm btn-primary" id="btnWriteForm">로그인</button>
			</div>
			
		<!-- 	<div class=button>
				<input type="button" class="btn btn-sm btn-primary" id="btnWriteForm" value ="로그인" onclick="optionModifyBtn()"/>
			</div> -->
			
		 </div>
	</div>
	<article>
		<div class="container">
			<div class="table-responsive">
				<table class="table table-striped table-sm">
					<colgroup>
						<col style="width:15%;" />
						<col style="width:25;" />
						<col style="width:15%;" />
						<col style="width:15%;" />
						
					</colgroup>
					<thead>
						<tr>
							<th class="th">과목명</th>
							<th class="th">강의시간</th>
							<th class="th">출석여부</th>
							<th class="th">출석상태</th>
						</tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${empty boardList }" >
								<tr><td colspan="5" align="center">데이터가 없습니다.</td></tr>
							</c:when> 
							<c:when test="${!empty boardList}">
								<c:forEach var="list" items="${boardList}">
									<tr>
										<td><c:out value="${list.bid}"/></td>
										<td><c:out value="${list.title}"/></td>
										<td><c:out value="${list.reg_id}"/></td>
										<td><c:out value="${list.view_cnt}"/></td>
										<td><c:out value="${list.reg_dt}"/></td>
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

