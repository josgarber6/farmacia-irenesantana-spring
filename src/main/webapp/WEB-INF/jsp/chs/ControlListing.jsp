<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="farmacia" tagdir="/WEB-INF/tags" %>

<farmacia:layout pageName="controles">
    <h2>Control Horario</h2>

    <table id="controlTable" class="table table-striped">
        <thead>
        <tr>
            <th style="width: 150px;">Empleado</th>
            <th style="width: 200px;">Horario ficha anterior</th>
            <th>Hora</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${controles}" var="control">
            <tr>
                <td>
                  <c:out value="${control.empleado_id}"/>
                </td>
                <td>
                  <c:out value="${control.horario_ficha_anterior}"/>
                </td>
                <td>
                  <c:out value="${control.hora}"/>
                </td>
                
            </tr>
        </c:forEach>
        </tbody>
    </table>
</farmacia:layout>
