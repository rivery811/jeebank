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
	<h1>로그인</h1>
	<form id= "login" action = "<%=request.getContextPath()%>/customer.do">
		아이디<input type="text" name = "id"/><br>
		비밀번호<input type="text" name = "pw"/><br>
		<input type="hidden" name ="action" value = "login" />		
		<input type="hidden" name ="page" value = "mypage" />		
		<input type="submit"  value = "전송">
	</form>
</div>
<script>
$('#login').submit(function(){
	alert('버튼클릭');
});

</script>
</body>
</html>