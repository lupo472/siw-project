<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

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
<title>Catalogo prodotti</title>
</head>
<body>
	<f:view>
	
	<nav class="navbar navbar-customblue">
			<div class="container-fluid">
<!-- 				Brand and toggle get grouped for better mobile display -->
<!-- 				<div class="navbar-header"> -->
<!-- 					<button type="button" class="navbar-toggle collapsed" -->
<!-- 						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> -->
<!-- 						<span class="sr-only">Toggle navigation</span> <span -->
<!-- 							class="icon-bar"></span> <span class="icon-bar"></span> <span -->
<!-- 							class="icon-bar"></span> -->
<!-- 					</button> -->
<!-- 				</div> -->

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
							<li><a href="customerHome.jsp"><button type="button"
										class="btn btn-default navbar-btn">Torna Indietro</button></a></li>
						</ul>
					</h:form>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>

		<h1 align="center">Prodotti presenti nel catalogo</h1>
		<h:form>
			<ul class="list-group">
				<c:forEach var="product" items="#{productController.products }">
					<li class="list-group-item">Nome: <h:commandLink
							action="#{productController.findProduct}" value="#{product.name}">
							<f:param name="id" value="#{product.id}" />
						</h:commandLink> - Prezzo: ${product.price}
					</li>
				</c:forEach>
			</ul>
		</h:form>
	
	
<%-- 		<h1>Prodotti presenti nel catalogo</h1> --%>
<%-- 		<h:form> --%>
<!-- 			<ol> -->
<%-- 				<c:forEach var="product" items="#{productController.products }"> --%>
<%-- 					<li>Nome: <h:commandLink --%>
<%-- 							action="#{productController.findProduct}" value="#{product.name}"> --%>
<%-- 							<f:param name="id" value="#{product.id}" /> --%>
<%-- 						</h:commandLink> - Prezzo: ${product.price} --%>
<!-- 					</li> -->
<%-- 				</c:forEach> --%>
<!-- 			</ol> -->
<!-- 			<ul> -->
<%-- 				<li><h:commandButton value="Torna alla home" --%>
<%-- 						action="customerHome.jsp" /></li> --%>
<!-- 			</ul> -->
<%-- 		</h:form> --%>
	</f:view>
</body>
</html>