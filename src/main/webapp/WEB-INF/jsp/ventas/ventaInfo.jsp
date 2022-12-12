<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="farmacia" tagdir="/WEB-INF/tags" %>

<farmacia:layout pageName="detallesVenta">
    <h2>Detalles de la venta</h2>

    <table id="ventaTable1" class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>C.NACIONAL</th>
            <th>DENOMINACION</th>
            <th>CANTIDAD</th>
            <th>PRECIO</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${venta.lineasVenta}" var="lineaventa">
            <tr>
                <td>
                  <c:out value="${lineaventa.articulo.id}"/>
                </td>
                <td>
                  <c:out value="${lineaventa.articulo.codigoNacional}"/>
                </td>
                <td>
                  <c:out value="${lineaventa.articulo.denominacion}" />
                </td>
                <td>
                  <c:out value="${lineaventa.cantidad}"/>
                </td>
                <td>
                    <c:out value="${lineaventa.precio}" />
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <h3>Precio total: ${venta.precioTotal}</h3>
    
    
</farmacia:layout>