<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="farmacia" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!--  >%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%-->
<%@ attribute name="name" required="true" rtexprvalue="true"
	description="Name of the active menu: home, owners, vets or error"%>

<nav class="navbar navbar-default" role="navigation">
	<div style="nav-left: root">
		<div class="navbar-collapse collapse" id="main-navbar">
			<ul class="nav navbar-nav">

				<farmacia:menuItem active="${name eq 'home'}" url="/"
					title="home page">
					<span class="glyphicon glyphicon-home" aria-hidden="true"></span>
					<span>Inicio</span>
				</farmacia:menuItem>

				<farmacia:menuItem active="${name eq 'ventas'}" url="/ventas"
					title="venta">
					<span class="	glyphicon glyphicon-tag" aria-hidden="true"></span>
					<span>Venta</span>
				</farmacia:menuItem>

				<farmacia:menuItem active="${name eq 'articulos'}" url="/articulos"
					title="articulos">
					<img src="<spring:url value='/resources/images/pill.ico'/>"width="20" height="20"/>
					<span>Articulos</span>
				</farmacia:menuItem>

				<farmacia:menuItem active="${name eq 'estadisticas'}" url="/estadisticas"
					title="estadisticas">
					<span class="glyphicon glyphicon-stats" aria-hidden="true"></span>
					<span>Estadisticas</span>
				</farmacia:menuItem>

				<farmacia:menuItem active="${name eq 'historialVentas'}" url="/historialventas"
					title="historialVentas">
					<span class="glyphicon glyphicon-inbox" aria-hidden="true"></span>
					<span>Historial de ventas</span>
				</farmacia:menuItem>

				<farmacia:menuItem active="${name eq 'pedido'}" url="/pedido"
					title="pedido">
					<span class="glyphicon glyphicon-tasks" aria-hidden="true"></span>
					<span>Pedido</span>
				</farmacia:menuItem>

				<farmacia:menuItem active="${name eq 'caja'}" url="/caja"
					title="caja">
					<span class="glyphicon glyphicon-euro" aria-hidden="true"></span>
					<span>Caja</span>
				</farmacia:menuItem>
				
				<farmacia:menuItem active="${name eq 'clientes'}" url="/clientes"
					title="clientes">
					<span class="glyphicon glyphicon-folder-open" aria-hidden="true"></span>
					<span>Clientes</span>
				</farmacia:menuItem>

				<farmacia:menuItem active="${name eq 'control'}" url="/controlhorario/new"
					title="control">
					<span class="glyphicon glyphicon-calendar" aria-hidden="true"></span>
					<span>Control Horario</span>
				</farmacia:menuItem>




			</ul>




			<ul class="nav navbar-nav navbar-right">
				<sec:authorize access="!isAuthenticated()">
					<li><a href="<c:url value="/login" />">Login</a></li>
				</sec:authorize>
				
			</ul>
		</div>



	</div>
</nav>
