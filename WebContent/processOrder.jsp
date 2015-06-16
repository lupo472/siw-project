<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<!-- CUSTOM theme -->
<link href="bootstrap/css/custom.css" rel="stylesheet" type="text/css">
<link href="bootstrap/css/signin.css" rel="stylesheet" type="text/css">
<title>Pannello di amministrazione</title>
</head>
<body>
	<f:view>

		<nav class="navbar navbar-customblue">
			<div class="container-fluid">
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">

					<div class="navbar-header">
						<a class="navbar-brand" href="#"> <img alt="Brand"
							src="./sourcefiles/hb_logo.png"
							style="width: 45px; height: 45px;" align="left">
						</a>
					</div>
					<h:form>
						<ul class="nav navbar-nav navbar-right">
							<li><h:commandLink
									action="#{orderController.discardProcessOrder}">
									<button type="button" class="btn btn-default navbar-btn">Annulla</button>
								</h:commandLink></li>

						</ul>
					</h:form>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>

		<h1 align="center">Evadi ordine</h1>
		<ul class="list-group">
			<c:forEach var="order" items="${orderController.orders}">
				<li class="list-group-item">Id: ${order.id} - Data apertura:
					${order.creationTime} - Data chiusura: ${order.closingTime}</li>
			</c:forEach>
		</ul>


		<div class="container">

			<h:form styleClass="form-signin">
				<h2 class="form-signin-heading"></h2>
				<div>
					<label class="sr-only" for="inputId"></label>
					<h:inputText id="inputId" styleClass="form-control"
						value="#{orderController.id}" required="true"
						requiredMessage="Campo obbligatorio">
						<h:outputLabel value="Id" />
					</h:inputText>
					<h:message for="inputId" />
				</div>
				<div>
					<div class="checkbox"></div>
					<h:commandLink action="#{orderController.processOrder}">
						<button class="btn btn-lg btn-primary btn-block" type="submit">Evadi</button>
					</h:commandLink>
				</div>
			</h:form>
		</div>

	</f:view>
</body>
</html>
