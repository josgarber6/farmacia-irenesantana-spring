<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="farmacia" tagdir="/WEB-INF/tags" %>

<farmacia:layout pageName="articulos">
    <h2>Articulos</h2>

    <table id="articuloTable" class="table table-striped">
        <thead>
        <tr>
            <th>CODIGO</th>
            <th>DENOMINACION</th>
            <th>EXISTENCIAS</th>
            <th>MINIMO</th>
            <th>PRECIO ALBARAN</th>
            <th>ACCIONES</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${articulos}" var="articulo">
            <tr>
                <td>
                  <c:out value="${articulo.codigoNacional}"/>
                </td>
                <td>
                  <c:out value="${articulo.denominacion}"/>
                </td>
                <td>
                  <c:out value="${articulo.existencias}" />
                </td>
                <td>
                  <c:out value="${articulo.minimo}"/>
                </td>
                <td>
                  <c:out value="${articulo.precioAlbaran}"/>
                </td>
                <td>
                  <a href="<spring:url value="/articulos/${articulo.id}" htmlEscape="true" />">Mas informacion</a>
                </td>
                
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div style="padding-top: 20px;">
      <a href='<spring:url value="/articulos/new" htmlEscape="true"/>''>
        <button>
          Nuevo articulo
        </button>
      </a>
    </div>
</farmacia:layout>
