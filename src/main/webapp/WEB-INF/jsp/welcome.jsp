<!DOCTYPE html>

<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="REMOVED" tagdir="/WEB-INF/tags" %>


<html lang="en">

<REMOVED:htmlHeader/>

<body>
<REMOVED:bodyHeader menuName="home"/>

<div class="container-fluid">
    <div class="container xd-container">
        <h2><fmt:message key="welcome"/></h2>
        <div class="row">
            <div class="col-md-12">
                <spring:url value="/resources/images/pets.png" htmlEscape="true" var="petsImage"/>
                <img class="img-responsive" src="${petsImage}"/>
            </div>
        </div>

        <REMOVED:pivotal/>
    </div>
</div>
<REMOVED:footer/>
</body>

</html>
