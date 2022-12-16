<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="farmacia" tagdir="/WEB-INF/tags" %>
<!-- %@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %-->  

<farmacia:layout pageName="home">
    <div style="text-align: center; margin-left: auto; margin-right: auto; width: 50%; height:50%">
        <h2>Farmacia Irene Santana</h2>
        <div class="row" style="padding-left: 178px;">
            <div class="col-md-12">
                <spring:url value="/resources/images/farmacia-irene-santana.png" htmlEscape="true" var="petsImage"/>
                <a href='<spring:url value="/login" htmlEscape="true"/>''>
                    <img class="img-responsive" src="${petsImage}"/>
                </a>
            </div>
        </div>
    </div>
</farmacia:layout>
