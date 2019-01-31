<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	request.setCharacterEncoding("UTF-8"); %>
<%	response.setContentType("text/html; charset=UTF-8");%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%@ include file="./form/header.jsp" %>

	<security:authorize access="hasRole('USER')">
		<a href="../user/coupon_list">쿠폰 리스트</a>
		<a href="../user/my_coupon_list?member_no=${user.member_no }">내 쿠폰함</a>
	</security:authorize>
	
	
	<security:authorize access="hasRole('CLIENT')">
		<a href="../client/menu_list">메뉴 리스트</a>
	</security:authorize>
	
	
	<security:authorize access="hasRole('ACCOUNT')">
		<a href="${pageContext.request.contextPath }/academy/coupon_stock">회계팀 로그인</a>
	</security:authorize>
	
	<security:authorize access="hasRole('PROMOTION')">
		<a href="${pageContext.request.contextPath }/academy/client_list">홍보팀 로그인</a>
	</security:authorize>
	
	<security:authorize access="hasRole('OPERATION')">
		<a href="${pageContext.request.contextPath }/academy/coupon_sale_page">운영팀 로그인</a>
	</security:authorize>
	
	
	<%-- <%@ include file="./form/footer.jsp" %> --%>
</body>
</html>