<!DOCTYPE html>

<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="REMOVED" tagdir="/WEB-INF/tags" %>

<html lang="en">
<REMOVED:htmlHeader />

<body>
<REMOVED:bodyHeader menuName="error"/>
<div class="container-fluid">
    <div class="container xd-container">

        <spring:url value="/resources/images/pets.png" var="petsImage"/>
        <img src="${petsImage}"/>

        <h2>Something happened...</h2>

        <p>${exception.message}</p>

        <!-- Exception: ${exception.message}.
		  	<c:forEach items="${exception.stackTrace}" var="stackTrace"> 
				${stackTrace} 
			</c:forEach>
	  	-->
        <REMOVED:pivotal/>
    </div>
</div>
<REMOVED:footer/>
</body>

</html>
