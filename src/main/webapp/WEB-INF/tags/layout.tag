<%@ tag trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="REMOVED" tagdir="/WEB-INF/tags" %>

<%@ attribute name="pageName" required="true" %>
<%@ attribute name="customScript" required="false" fragment="true"%>

<!doctype html>
<html>
<REMOVED:htmlHeader/>

<body>
<REMOVED:bodyHeader menuName="${pageName}"/>

<div class="container-fluid">
    <div class="container xd-container">

        <jsp:doBody/>

        <REMOVED:pivotal/>
    </div>
</div>
<REMOVED:footer/>
<jsp:invoke fragment="customScript" />

</body>

</html>
