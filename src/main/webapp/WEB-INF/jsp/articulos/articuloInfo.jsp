<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="farmacia" tagdir="/WEB-INF/tags" %>

<farmacia:layout pageName="detallesArticulo">
    <h2>Detalles del articulo</h2>
    <a href='<spring:url value="/articulos/${articulo.id}/edit" htmlEscape="true" />'><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>
    <div style="width: fit-content; height: fit-content;">
    <table id="articuloTable1" class="table table-striped">
        <thead>
          <tr>
              <th>Codigo nacional</th>
              <th>Denominacion</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>
              <c:out value="${articulo.codigoNacional}"/>
            </td>
            <td>
              <c:out value="${articulo.denominacion}"/>
            </td>
          </tr>
        </tbody>
    </table>
    <table id="articuloTable2" class="table table-striped">
      <h3 style="text-align: center;">STOCK</h3>
      <thead>
        <th>
          Existencias
        </th>
        <th>
          Lote
        </th>
        <th>
          Tenencia
        </th>
        <th>
          Minimo
        </th>
      </thead>
      <tbody>
        <tr>
          <td>
            <c:out value="${articulo.existencias}"/>
          </td>
          <td>
            <c:out value="${articulo.lote}"/>
          </td>
          <td>
            <c:out value="${articulo.tenencia}"/>
          </td>
          <td>
            <c:out value="${articulo.minimo}"/>
          </td>
        </tr>
      </tbody>
    </table>
    <table id="articuloTable3" class="table table-striped">
      <thead>
        <th>
          Fecha
        </th>
        <th>
          Receta necesaria
        </th>
      </thead>
      <tbody>
        <tr>
          <td>
            <farmacia:localDate date="${articulo.caducidad}" pattern="dd/MM/yyyy"/>
          </td>
          <td>
            <c:choose>
              <c:when test="${articulo.requiereReceta == true}">
                Si
              </c:when>
              <c:otherwise>
                No
              </c:otherwise>
            </c:choose>
          </td>
        </tr>
      </tbody>
    </table>
    <table id="articuloTable4" class="table table-striped">
      <h3>
        PRECIOS
      </h3>
      <thead>
        <th>
          Precio de albaran
        </th>
      </thead>
      <tbody>
        <tr>
          <td>
            <c:out value="${articulo.precioAlbaran}"/>
          </td>
        </tr>
      </tbody>
    </table>
    <table id="articuloTable5" class="table table-striped">
      <thead>
        <th>
          PVP
        </th>
      </thead>
      <tbody>
        <tr>
          <td>
            <c:out value="${articulo.pvp}"/>
          </td>
        </tr>
      </tbody>
    </table>



    <table id="articuloTable6" class="table table-striped">
      <h3>
        OBSERVACIONES
      </h3>
      <c:out value="${articulo.observacion}"/>
    </table>
  </div>
  <div>
    <img src="<spring:url value='${articulo.imagen}'/>" width="300px" height="200px"/>
  </div>
</farmacia:layout>
