<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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

<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />
<script>
	$(document).on('click', '#btnJoinForm',function(e){
		e.preventDefault();
		location.href = "${pageContext.request.contextPath}/user/join"
	});
	
	$(document).on('click', '#btnLoginForm',function(e){
		e.preventDefault();
		location.href = "${pageContext.request.contextPath}/user/login"
	});
	
	$(document).on('click', '#btnChoiceForm',function(e){
		e.preventDefault();
		/* location.href = "${pageContext.request.contextPath}/user/chekcing" */
		$("#formCheck3").submit();
	});
	
	
	$(document).on('click', '#btnLogOutForm',function(e){
		e.preventDefault();
		location.href = "${pageContext.request.contextPath}/user/logout"
	});
	
  
	$(document).ready(function(){
		 $("#update input").on('click',function(){ 
			event.preventDefault();
			var currentRow = $(this).closest('tr');
			var sid = currentRow.find('td:eq(0)').text();
			var code = currentRow.find('td:eq(1)').text();
			var name = currentRow.find('td:eq(2)').text();
			var status = currentRow.find('td:eq(5)').text();
					
			
			var randomText = randomStringfunction();
		
            url = "${pageContext.request.contextPath}/user/createCode";
            var content = "sid:"+ sid +":code:"+ code +":name:"+ name+":status:"+ status +":" + randomText;
            content = encodeURIComponent(content);
        	$("#img").prop("src", url+"?content="+content);
        	
            var myTimer = setInterval(function() {
            	var randomText = randomStringfunction();
				url = "${pageContext.request.contextPath}/user/createCode";
				var content = "sid:"+ sid +":code:"+ code +":name:"+ name+":status:"+ status +":" + randomText;
				content = encodeURIComponent(content);
            	$("#img").prop("src", url+"?content="+content);
           	}, 60000);
            setTimeout(function(){
            	clearInterval(myTimer);
            },120001);
		}); 
		
	}); 
	
	
	var randomStringfunction = function randomString() {
		var chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz";
		var string_length = 7;
		var randomstring = '';
		for (var i=0; i<string_length; i++) {
			var rnum = Math.floor(Math.random() * chars.length);
			randomstring += chars.substring(rnum,rnum+1);
		}
		
		return randomstring;
	}
	
	//????????????????????? ?????? ??????(qr?????? / ???????????? ?????? ?????? ??? ??????, ?????? ??????)
	$(document).on('click','#btnSave',function(e){
		e.preventDefault();
		debugger;
		var theForm = document.form;
		var qrCodeSRC = theForm.img.src.split('?');
		/* var checkingData = qrCodeSRC[1].split(':'); */
		//content??? encodeURIComponent??? ??????????????? ?????? ??????????????? ????????? ????????? ????????? split ????????????
		var checkingData = qrCodeSRC[1].split('%3A');
		console.log(checkingData);
		var s_id = checkingData[1];
		var subjectCode = checkingData[3];
		var subjectName = decodeURIComponent(checkingData[5]);
		var status = decodeURIComponent(checkingData[7]);
		console.log(s_id+"/"+subjectCode+"/"+subjectName+"/"+status);
		$.ajax({
			url :"${pageContext.request.contextPath}/user/checking",
			type : 'POST',
			data : {
				s_id : s_id,
				SubjectCode : subjectCode,
				SubjectName : subjectName,
				Status : status
			},
			dataType : "json",
			success : function(data){
				
			},
			error:function(request,status,error){
				
			},
			complete : function(data) {
				alert("??????????????? ?????????????????????.");
				location.reload();
			}
		});
	});
	
	$(document).on('click','#btnSave1',function(e){
		e.preventDefault();
		var theForm = document.form;
		var randomText = randomStringfunction();
		var url = theForm.img.src;
		url = url.substring(0,url.length-7);
		$("#img").prop("src", url+randomText);
	});
	
	$(document).on('click','#btnReload',function(e){
		e.preventDefault();
		location.reload();
	});
</script>

</head>
<body>
<c:if test="${not empty login}">
	<div class="container">
		<img src="<spring:url value='/resources/images/Idino.png'/>">
		<div class=button>
			<p>${login.getName()}??? ???????????????</p>
			<form name="formCheck3" id="formCheck3" role="form" method="GET" action="${pageContext.request.contextPath}/user/chekcing">
				<input type="hidden" id="s_id" name=s_id value="${login.getName()}" />
				<button type="button" class="btn btn-sm btn-primary" id="btnChoiceForm">????????????</button>
				<button type="button" class="btn btn-sm btn-primary" id="btnLogOutForm">????????????</button>
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
							<th class="align-center">????????????</th>
							<th class="align-center">?????????</th>
							<th class="align-center">????????????</th>
							<th class="align-center">??????</th>
							<th class="align-center">????????????</th>
							<th class="align-center">????????????</th>
						</tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${empty login }" >
								<tr><td colspan="5" align="center">???????????? ????????????.</td></tr>
							</c:when> 
							<c:when test="${!empty login}">
								<c:forEach var="takingSubjectList" items="${takingSubjectList}">
									<tr>
										<td class="hidden-col"><c:out value="${login.getSid()}"/></td>
										<td class="align-center"><c:out value="${takingSubjectList.getTs_code()}"/></td>
										<td class="align-center"><c:out value="${takingSubjectList.getTs_name()}"/></td>
										<td class="align-center">
											<fmt:parseDate value='${takingSubjectList.getTsS_time()}' var='StartTime' pattern='yyyy-MM-dd HH:mm:ss'/>
											<fmt:parseDate value='${takingSubjectList.getTsE_time()}' var='EndTime' pattern='yyyy-MM-dd HH:mm:ss'/>
											<fmt:formatDate value="${StartTime}" pattern="HH:mm"/>
											~
											<fmt:formatDate value="${EndTime}" pattern="HH:mm"/>
										</td>
										<td class="align-center"><c:out value="${takingSubjectList.getTs_yoil()}"/></td>
										<td class="align-center"><c:out value="${takingSubjectList.getTs_check()}"/></td>
										<td id="update"><a href="#ex1" rel="modal:open"><input type="button" class="btn btn-sm btn-primary" value="????????????"/></a></td>
									</tr>
								</c:forEach>
							</c:when>
						</c:choose>
					</tbody>
				</table>
			</div>
		</div>	
	</article>
	
	<div id="ex1" class="modal" style="width:500px;height:700px;display:none;">
		<form name="form" id="form" role="form" method="post" action="${pageContext.request.contextPath}/user/saveStateInfo">
			<h1 class="align-center">????????????</h1>
			<p style="text-align: center;">
				<img id="img" style="display:inline"/>
			</p>
			<p style="text-align: center;">
				<a href="#" rel="modal:close"><button class="btn btn-sm btn-primary" id="btnReload">??????</button></a>
				<button type="button" class="btn btn-sm btn-primary m-1" id="btnSave">??????</button>
				<button type="button" class="btn btn-sm btn-primary m-1" id="btnSave1">?????????</button>
			</p>
		</form>
	</div>
	 
</c:if>
</body>
</html>

