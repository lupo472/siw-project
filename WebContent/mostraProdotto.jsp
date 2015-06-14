<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">


<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<!-- CUSTOM theme -->
<link href="bootstrap/css/custom.css" rel="stylesheet" type="text/css">
<title>Selezione</title>
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
						src="./sourcefiles/hb_logo.png" style="width: 50px; height: 50px;"
						align="left">
					</a>
				</div>
				<h:form>
					<h:commandButton action="#{productController.getBackToProducts}"
						value="Torna indietro" />
				</h:form>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid --> </nav>

		<h1>Prodotto selezionato</h1>
		<ul>
			<li>Nome: ${productController.product.name }</li>
			<li>Prezzo: ${productController.product.price }</li>
			<li><h:outputText>Descrizione: ${productController.product.description }</h:outputText>
			<li>Codice: ${productController.product.code }</li>
			<li>In stock: ${productController.product.inStock }</li>
		</ul>
	</f:view>
</body>
</html>