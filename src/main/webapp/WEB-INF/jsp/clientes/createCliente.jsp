<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="farmacia" tagdir="/WEB-INF/tags" %>

<farmacia:layout pageName="cliente">
    <div class="row">
        <c:if test="${message != null}">
            <div class="alert alert-${messageType}">
                <c:out value="${message}"></c:out>
                <a href="#" class="close" data-dismiss="alert" aria-label="close">x</a>
            </div>
        </c:if>
    </div>
    
    <form:form modelAttribute="cliente">
      <table>
        <tr>
          <td><form:label path="nombre">Nombre: </form:label></td>
          <td style="padding-left: 20px;"><form:input path="nombre"/></td>
        </tr>
        <tr>
          <td><form:label path="apellido">Apellido: </form:label></td>
          <td style="padding-left: 20px;"><form:input path="apellido"/></td>
        </tr>
        <tr>
          <td><form:label path="direccion">Direccion: </form:label></td>
          <td style="padding-left: 20px;"><form:input path="direccion" placeholder="Calle numero piso"/></td>
        </tr>
        <tr>
          <td><form:label path="firmaElectronica">Firma electronica: </form:label></td>
          <td style="padding-left: 20px;"><form:input path="firmaElectronica" placeholder="nombrefirma.odf"/></td>
        </tr>
        <tr>
          <td><form:label path="telefono">Telefono: </form:label></td>
          <td style="padding-left: 20px;"><form:input path="telefono" placeholder="598 154 326"/></td>
        </tr>
        <tr>
          <td><form:label path="dni">DNI: </form:label></td>
          <td style="padding-left: 20px;"><form:input path="dni"/></td>
        </tr>
        <tr>
          <td><form:label path="observacion">Observacion: </form:label></td>
          <td style="padding-left: 20px;"><form:input path="observacion"/></td>
        </tr>
      </table>
      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10" style="padding-top: 20px;">
          <button class="btn btn-default" type="submit">Guardar</button>
        </div>
      </div>
    </form:form>
</farmacia:layout>
