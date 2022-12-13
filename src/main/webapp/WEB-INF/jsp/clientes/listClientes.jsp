<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="farmacia" tagdir="/WEB-INF/tags" %>

<farmacia:layout pageName="clientes">
    <h2>Clientes</h2>
    <table id="clienteTable" class="table table-striped">
        <thead>
          <tr>
            <th>CODIGO</th>
            <th>NOMBRE</th>
            <th>APELLIDO</th>
            <th>DIRECCION</th>
            <th>FIRMA ELECTRONICA</th>
            <th>TELEFONO</th>
            <th>OBSERVACIONES</th>
          </tr>
        </thead>
        <tbody>
        <c:forEach items="${clientes}" var="cliente">
            <tr>
                <td>
                  <c:out value="${cliente.id}"/>
                </td>
                <td>
                  <c:out value="${cliente.nombre}"/>
                </td>
                <td>
                  <c:out value="${cliente.apellido}"/>
                </td>
                <td>
                  <c:out value="${cliente.direccion}"/>
                </td>
                <td>
                  <c:out value="${cliente.firmaElectronica}"/>
                </td>
                <td>
                  <c:out value="${cliente.telefono}"/>
                </td>
                <td>
                  <c:out value="${cliente.observacion}"/>
                </td>
                
            </tr>
          </c:forEach>
        </tbody>
      </table>
      <div style="padding-top: 20px;">
        <a href='<spring:url value="/clientes/new" htmlEscape="true"/>''>
          <button>
            Nuevo cliente
          </button>
        </a>
      </div>
</farmacia:layout>