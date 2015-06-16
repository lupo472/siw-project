<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
						<ul class="nav navbar-nav">

							<li><h:commandLink
									action="#{productController.listProductsAdmin}">Catalogo Prodotti</h:commandLink></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<li><h:commandLink
									action="#{administratorController.administratorLogout}">
									<button type="button" class="btn btn-default navbar-btn">Logout</button>
								</h:commandLink></li>
						</ul>
					</h:form>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
		<div align="center">
			<h1>Pannello di amministrazione</h1>
			<p>
			</p>
			<h:form>
				<div>
					<h:commandLink action="updateCatalog">
						<button type="button" class="btn btn-default navbar-btn">Aggiorna
							catalogo</button>
					</h:commandLink>
				</div>
				<div>
					<h:commandLink action="inserisciIdOrdine">
						<button type="button" class="btn btn-default navbar-btn">Mostra
							dati cliente</button>
					</h:commandLink>
				</div>
				<div>
					<h:commandLink
						action="#{orderController.retrieveAllNotProcessedOrders}">
						<button type="button" class="btn btn-default navbar-btn">Evadi
							un ordine </button>
					</h:commandLink>
				</div>
			</h:form>
		</div>
	</f:view>
</body>
</html>
