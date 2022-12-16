<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="farmacia" tagdir="/WEB-INF/tags" %>

<farmacia:layout pageName="control">
    <div class="row">
        <c:if test="${message != null}">
            <div class="alert alert-${messageType}">
                <c:out value="${message}"></c:out>
                <a href="#" class="close" data-dismiss="alert" aria-label="close">x</a>
            </div>
        </c:if>
        <div class="col-md-12">
            <spring:url value="/resources/images/farmacia-irene-santana.png" htmlEscape="true" var="logoImage"/>
            <img class="img-responsive" src="${logoImage}"/>
        </div>
    </div>
    <h2 id="horaActual">Hora Actual: 13:24</h2>
    <script type="text/javascript">
        function showTime() {
            myDate = new Date();
            hours = myDate.getHours();
            minutes = myDate.getMinutes();
            if (hours < 10) hours = 0 + hours;
            if (minutes < 10)
            $("#HoraActual").text(hours+ ": " +minutes);
            setTimeout("showTime()", 1000);
        }
        </script>
    <h2>Fecha y hora del fichaje anterior: 14/12/2022 22:10 </h2>
    
    <form:form modelAttribute="control">
        <div class="control-group">
            <form:label path="empleado.id" style="padding-right: 62px;">Numero de vendedor: </form:label>
            <form:input type="number" path="empleado.id"/>
        </div>
        
        
        <div class="control-group">
            <form:label path="tipo" style="padding-left: 112px; padding-right: 62px;">Tipo: </form:label>
            <form:select path="tipo">
                <form:options items="${tipos}" size="1"/>
            </form:select>
        </div>

        <div class="control-group">
            <form:label path="empleado.clave" style="padding-left: 105px; padding-right: 62px;">Clave: </form:label>
            <form:input type="password" path="empleado.clave"/>
        </div>
       
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
               <button class="btn btn-default" type="submit">Acceder</button>
            </div>
        </div>
    </form:form>
</farmacia:layout>
