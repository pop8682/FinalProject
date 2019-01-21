<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

function idChk(){
	var doc = document.getElementsByName("member_id")[0];
	var role = document.getElementById("role").value;
	if(doc.value.trim()==""||doc.value==null){
		alert("아이디를 입력하세요.");
	}else{
		var target = "../register/"+ role +"/idchk?member_id="+doc.value.trim();
		open(target,"아이디 중복 확인","width=500,height=500");
	}
}

function idChkConfirm(){
	var chk = document.getElementsByName("member_id")[0].title;
	if(chk=="n"){
		alert("아이디 중복 체크를 해주세요.")
		document.getElementsByName("member_id")[0].focus();
	}
}


</script>


</head>
<body>

<h1>사용자 회원가입</h1>

	<form:form action="../registerConfirm" method="post" modelAttribute="dto">
		<input type="hidden" id="role" value="${member_role }"/>
		<form:hidden path="member_role"/>
		<table>
			<tr>
				<th>프로필 사진</th>
				<td>
					이미지를 업로드 하세요.<form:input type="file" path="member_profile"/>
				</td>
			</tr>
			<tr>
				<th>아이디</th>
				<td>
					<form:input type="text" path="member_id" title="n" required="required"/>
					<input type="button" value="중복체크" onclick="idChk();"/>
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>
					<form:input type="text" path="member_password" required="required"/>
					<form:errors path="member_password"></form:errors>
				</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>
					<form:input type="text" path="member_name" onclick="idChkConfirm();" required="required"/>
				</td>
			</tr>
			<tr>
				<th>닉네임</th>
				<td>
					<form:input type="text" path="member_nickname" onclick="idChkConfirm();"/>
				</td>
			</tr>
			<tr>
				<th>반</th>
				<td>
					<form:input type="text" path="member_class" onclick="idChkConfirm();" required="required"/>
				</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td>
					<form:input type="text" path="member_phone" onclick="idChkConfirm();" required="required"/>
				</td>	
			</tr>		
			<tr>
				<th>이메일</th>
				<td>
					<form:input type="email" path="member_email" onclick="idChkConfirm();" required="required"/>
				</td>
			</tr>			
			<tr>
				<td colspan="2">
					<input type="submit" value="회원가입">
					<input type="button" value="가입취소">
				</td>
			</tr>
			
		</table>
	
	</form:form>


</body>
</html>