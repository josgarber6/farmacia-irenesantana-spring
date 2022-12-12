<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="farmacia" tagdir="/WEB-INF/tags" %>

<farmacia:layout pageName="venta">
    <div class="row">
        <c:if test="${message != null}">
            <div class="alert alert-${messageType}">
                <c:out value="${message}"></c:out>
                <a href="#" class="close" data-dismiss="alert" aria-label="close">x</a>
            </div>
        </c:if>
    </div>
    
    <form:form modelAttribute="venta">
      <table>
        <tr>
          <td><form:label path="tipoPago">Tipo de pago: </form:label></td>
          <td style="padding-left: 20px;"><form:input path="tipoPago"/></td>
        </tr>
        <tr>
          <td><form:label path="fecha">Fecha: </form:label></td>
          <td style="padding-left: 20px;"><form:input type="date" path="fecha"/></td>
        </tr>
      </table>
      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10" style="padding-top: 20px;">
           <button class="btn btn-default" type="submit">Guardar</button>
        </div>
      </div>
    </form:form>
</farmacia:layout>