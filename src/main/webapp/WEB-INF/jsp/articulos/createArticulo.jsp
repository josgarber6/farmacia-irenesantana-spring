<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="farmacia" tagdir="/WEB-INF/tags" %>

<farmacia:layout pageName="articulo">
    <div class="row">
        <c:if test="${message != null}">
            <div class="alert alert-${messageType}">
                <c:out value="${message}"></c:out>
                <a href="#" class="close" data-dismiss="alert" aria-label="close">x</a>
            </div>
        </c:if>
    </div>
    
    <form:form modelAttribute="articulo">
      <table>
        <tr>
          <td><form:label path="denominacion">Denominacion: </form:label></td>
          <td style="padding-left: 20px;"><form:input path="denominacion"/></td>
        </tr>
        <tr>
          <td><form:label path="codigoNacional">Codigo nacional: </form:label></td>
          <td style="padding-left: 20px;"><form:input path="codigoNacional"/></td>
        </tr>
        <tr>
          <td><form:label path="caducidad">Caducidad: </form:label></td>
          <td style="padding-left: 20px;"><form:input type="date" path="caducidad"/></td>
        </tr>
        <tr>
          <td><form:label path="existencias">Existencias: </form:label></td>
          <td style="padding-left: 20px;"><form:input type="number" path="existencias"/></td>
        </tr>
        <tr>
          <td><form:label path="lote">Lote: </form:label></td>
          <td style="padding-left: 20px;"><form:input path="lote"/></td>
        </tr>
        <tr>
          <td><form:label path="tenencia">Tenencia: </form:label></td>
          <td style="padding-left: 20px;"><form:input type="number" path="tenencia"/></td>
        </tr>
        <tr>
          <td><form:label path="minimo">Minimo: </form:label></td>
          <td style="padding-left: 20px;"><form:input type="number" path="minimo"/></td>
        </tr>
        <tr>
          <td><form:label path="precioAlbaran">Precio albaran: </form:label></td>
          <td style="padding-left: 20px;"><form:input type="number" path="precioAlbaran"/></td>
        </tr>
        <tr>
          <td><form:label path="requiereReceta">Requiere receta: </form:label></td>
          <td style="padding-left: 20px;"><form:checkbox path="requiereReceta"/></td>
        </tr>
        <tr>
          <td><form:label path="pvp">Precio venta publico: </form:label></td>
          <td style="padding-left: 20px;"><form:input type="number" path="pvp"/></td>
        </tr>
        <tr>
          <td><form:label path="imagen">Imagen: </form:label></td>
          <td style="padding-left: 20px;">
            <form action="UploadServlet" method="post" enctype="multipart/form-data">
              <input type="file" name="image" size="50"/>
            </form>
          </td>
        </tr>
      </table>
      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10" style="padding-top: 20px;">
           <button class="btn btn-default" type="submit">Guardar</button>
        </div>
      </div>
    </form:form>
</farmacia:layout>
