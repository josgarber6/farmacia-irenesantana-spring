<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="farmacia" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!--  >%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%-->
<%@ attribute name="name" required="true" rtexprvalue="true"
	description="Name of the active menu: home, owners, vets or error"%>

<nav class="navbar navbar-default" role="navigation">
	<div class="container">
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

				<farmacia:menuItem active="${name eq 'control'}" url="/controlhorario/" dropdown="${true}"
					title="control">
					<span class="glyphicon glyphicon-calendar" aria-hidden="true"></span>
					<span>Control Horario</span>

					<ul class="dropdown-menu">
						<li>
							<a href="<c:url value="/controlhorario/new"/>">Nuevo registro</a>
						</li>
						<li>
							<a href="<c:url value="/controlhorario"/>">Ver registros</a>
						</li>
					</ul>

				</farmacia:menuItem>



			</ul>




			<ul class="nav navbar-nav navbar-right">
				<sec:authorize access="!isAuthenticated()">
					<li><a href="<c:url value="/login" />">Login</a></li>
				</sec:authorize>
				<sec:authorize access="isAuthenticated()">
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown"> <span class="glyphicon glyphicon-user"></span>
							<strong><sec:authentication property="name" /></strong> <span
							class="glyphicon glyphicon-chevron-down"></span>
					</a>
						<ul class="dropdown-menu">
							<li>
								<div class="navbar-login">
									<div class="row">
										<div class="col-lg-4">
											<p class="text-center">
												<span class="glyphicon glyphicon-user icon-size"></span>
											</p>
										</div>
										<div class="col-lg-8">
											<p class="text-left">
												<strong><sec:authentication property="name" /></strong>
											</p>
											<p class="text-left">
												<a href="<c:url value="/logout" />"
													class="btn btn-primary btn-block btn-sm">Logout</a>
											</p>
										</div>
									</div>
								</div>
							</li>
							<li class="divider"></li>
<!-- 							
                            <li> 
								<div class="navbar-login navbar-login-session">
									<div class="row">
										<div class="col-lg-12">
											<p>
												<a href="#" class="btn btn-primary btn-block">My Profile</a>
												<a href="#" class="btn btn-danger btn-block">Change
													Password</a>
											</p>
										</div>
									</div>
								</div>
							</li>
-->
						</ul></li>
				</sec:authorize>
			</ul>
		</div>



	</div>
</nav>
