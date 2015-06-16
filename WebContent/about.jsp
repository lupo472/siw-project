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
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<!-- CUSTOM theme -->
<link href="bootstrap/css/custom.css" rel="stylesheet" type="text/css">
<title>Hitech Buddy</title>
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
							style="width: 45px; height: 45px;" align="left">
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
		<div align="center">
			<h1>About Hitech Buddy</h1>
		</div>
		<div id="about_img">
			<div align="center">
				<a href="#"> <img alt="Brand" src="./sourcefiles/about_logo.png"
					align="middle">
				</a>
			</div>
			<div align="center"></div>
		</div>
		<div class="well" align="center">
			Hitech Buddy è un sito di e-commerce specializzato in elettronica e
			prodotti hi tech delle migliori marche.<BR> Ci rivolgiamo solo ai
			migliori fornitori italiani e internazionali per garantire qualità e
			prezzi bassi a tutti i nostri clienti.
		</div>
		<div align="center">
			<p>
				<small>Copyright Hitech Buddy 2015</small>
			</p>
		</div>
	</f:view>
</body>
</html>
