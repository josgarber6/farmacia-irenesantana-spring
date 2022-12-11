<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="farmacia" tagdir="/WEB-INF/tags" %>

<farmacia:layout pageName="ventas">
    <h2>Ventas</h2>

    <table id="ventaTable" class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>TIPO DE PAGO</th>
            <th>FECHA</th>
            <th>PRECIO TOTAL</th>
            <th>ACCIONES</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ventas}" var="venta">
            <tr>
                <td>
                  <c:out value="${venta.id}"/>
                </td>
                <td>
                  <c:out value="${venta.tipoPago}"/>
                </td>
                <td>
                  <c:out value="${venta.fecha}" />
                  <farmacia:localDate date="${venta.fecha}" pattern="dd/MM/yyyy"/>
                </td>
                <td>
                  <c:out value="${venta.precioTotal}"/>
                </td>
                <td>
                  <a href="<spring:url value="/ventas/${venta.id}" htmlEscape="true" />">Mas informacion</a>
                </td>
                
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div style="padding-top: 20px;">
      <a href='<spring:url value="/ventas/new" htmlEscape="true"/>''>
        <button>
          Nueva venta
        </button>
      </a>
    </div>
</farmacia:layout>