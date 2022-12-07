<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="farmacia" tagdir="/WEB-INF/tags" %>

<farmacia:layout pageName="control">
    <div class="row">
        <div class="col-md-12">
            <spring:url value="/resources/images/farmacia-irene-santana.png" htmlEscape="true" var="logoImage"/>
            <img class="img-responsive" src="${logoImage}"/>
        </div>
    </div>
    <h2 id="HoraActual">Hora Actual:</h2>
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
    <h2>Fecha y hora del fichaje anterior: </h2>
    <h2>${control.horarioFichaAnterior}</h2>
    
    <form:form modelAttribute="control" class="form-horizontal" id="add-controlHorario-form">
        <div class="control-group">
            <farmacia:selectField name="ids" label="Número de vendedor" names="${ids}" size="5"/>
        </div>
        <div class="control-group">
            <farmacia:selectField name="tipo" label="Tipo " names="${tipos}" size="5"/>
        </div>
        <farmacia:inputField label="Clave de empleado" name="${clave}"/>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
               <button class="btn btn-default" type="submit">Acceder</button>
            </div>
        </div>
    </form:form>
</farmacia:layout>
