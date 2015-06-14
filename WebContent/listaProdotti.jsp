<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
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
<title>Lista Prodotti</title>
</head>
<body>
	<f:view>

		<nav class="navbar navbar-customblue">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">

					<div class="navbar-header">
						<a class="navbar-brand" href="#"> <img alt="Brand"
							src="./sourcefiles/hb_logo.png"
							style="width: 50px; height: 50px;" align="left">
						</a>
					</div>
					<h:form>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="index.jsp"><button type="button"
										class="btn btn-default navbar-btn">Torna Indietro</button></a></li>
						</ul>
					</h:form>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>

		<h1>Prodotti presenti nel catalogo</h1>
		<h:form>
			<ol>
				<c:forEach var="product" items="#{productController.products }">
					<li>Nome: <h:commandLink
							action="#{productController.findProduct}" value="#{product.name}">
							<f:param name="id" value="#{product.id}" />
						</h:commandLink> - Prezzo: ${product.price}
					</li>
				</c:forEach>
			</ol>
		</h:form>
	</f:view>
</body>
</html>