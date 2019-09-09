<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>은행 관리 시스템</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
	<h2>통장개설</h2>
	<form id="account-form" action = "<%=request.getContextPath()%>/account.do">
		입금액<input type="text" name="money" /><br>
		
		<input type="submit" id="test" value = "전송">
	<!-- id,pw,name,ssn,credit -->	
	</form>
</div>
<script >
$('#account-form').submit(function() {
	alert('통장개설');
	

});
</script>
</body>
</html>