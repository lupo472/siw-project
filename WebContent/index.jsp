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
<title>Welcome</title>
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
						src="./sourcefiles/hb_logo.png" style="width: 50px; height: 50px;" align="left">
					</a>
				</div>
					<h:form>
						<ul class="nav navbar-nav">
							<li class="active"><a href="#">About <span
									class="sr-only">(current)</span></a></li>
							<li><h:commandLink
									action="#{productController.listProducts}"><button type="button" class="btn btn-default navbar-btn">Catalogo Prodotti</button></h:commandLink></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="administratorLogin.jsp"><button
										type="button" class="btn btn-default navbar-btn">Login
										Amministratore</button></a></li>
							<li><a href="customerLogin.jsp"><button type="button"
										class="btn btn-default navbar-btn">Login Utente</button></a></li>
							<li><a href="customerSignUp.jsp"><button type="button"
										class="btn btn-default navbar-btn">Registrazione</button></a></li>
						</ul>
					</h:form>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
		<div id="index_img">
			<div align="center">
				<a href="#"> <img alt="Brand"
					src="./sourcefiles/image_index.png" align="middle">
				</a>
			</div>
		</div>
		<!-- 					<p> -->
		<!-- 						<strong>Scegli un operazione </strong> -->
		<!-- 					</p> -->
		<!-- 					<p> -->
		<!-- 						<strong>Registrati o accedi al portale se vuoi effettuare -->
		<!-- 							un ordine!</strong> -->
		<!-- 					</p> -->
		<%-- 					<h:form> --%>
		<!-- 						<ul> -->
		<%-- 							<li><h:commandButton value="Login" action="customerLogin" /></li> --%>
		<%-- 							<li><h:commandButton value="Admin Login" --%>
		<%-- 									action="#{administratorController.administratorLogin }" /></li> --%>
		<%-- 							<li><h:commandButton value="Registrati" --%>
		<%-- 									action="#{customerController.signUp}" /></li> --%>
		<%-- 							<li><h:commandButton value="Catalogo prodotti" --%>
		<%-- 									action="#{productController.listProducts}" /></li> --%>
		<!-- 						</ul> -->
		<%-- 					</h:form> --%>
	</f:view>
</body>
</html>
