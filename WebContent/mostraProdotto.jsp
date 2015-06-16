<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
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
<title>Prodotto selezionato</title>
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
						<li><h:commandLink action="#{productController.getBackToProducts}"><button
										type="button" class="btn btn-default navbar-btn">Torna indietro</button></h:commandLink></li>
					</ul>
					</h:form>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
		
		
<h1 align="center">Prodotto selezionato</h1>
		<h:form>
			<ul class="list-group">
					<li class="list-group-item">Nome: ${productController.product.name }</li>
					<li class="list-group-item">Prezzo: ${productController.product.price }</li>
					<li class="list-group-item">Descrizione: ${productController.product.description }</li>
					<li class="list-group-item">Codice: ${productController.product.code }</li>
					<li class="list-group-item">In stock: ${productController.product.inStock }</li>
			</ul>
		</h:form>
		
		
	</f:view>
</body>
</html>