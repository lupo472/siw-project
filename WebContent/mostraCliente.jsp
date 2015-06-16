<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js">
	
</script>

<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<!-- / margin: .67em 0; -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<!-- CUSTOM theme -->
<link href="bootstrap/css/custom.css" rel="stylesheet" type="text/css">
<link href="bootstrap/css/signin.css" rel="stylesheet" type="text/css">
<title>Cliente selezionato</title>
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
						<li><h:commandLink action="#{ orderController.insertIdOrder}"><button
										type="button" class="btn btn-default navbar-btn">Torna indietro</button></h:commandLink></li>
					</ul>
					</h:form>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
	
	<div align="center">
	    <h1 >Cliente selezionato</h1>
		<h:form>
		<div>Nome: ${orderController.customer.firstName}</div>
		<div>Cognome: ${orderController.customer.lastName}</div>
		<div>Email: ${orderController.customer.email}</div>
		<div>Data di nascita: ${orderController.customer.dateOfBirth}</div>
		<div>Data di registrazione: ${orderController.customer.registrationDate}</div>
		<p>Indirizzo:</p>
		<div>Via: ${orderController.customer.address.street}</div>
		<div>Citta': ${orderController.customer.address.city}</div>
		<div>Regione: ${orderController.customer.address.state}</div>
		<div>Paese: ${orderController.customer.address.country}</div>
		<div>ZipCode: ${orderController.customer.address.zipCode}</div>
		</h:form>
		</div>
	
	
	
	
	
	
	
	
	
<%-- 		<h1>Cliente selezionato</h1> --%>
<!-- 		<ul> -->
<%-- 			<li>Nome: ${orderController.customer.firstName}</li> --%>
<%-- 			<li>Cognome: ${orderController.customer.lastName}</li> --%>
<%-- 			<li>Email: ${orderController.customer.email}</li> --%>
<%-- 			<li>Data di nascita: ${orderController.customer.dateOfBirth}</li> --%>
<!-- 			<li>Data di registrazione: -->
<%-- 				${orderController.customer.registrationDate}</li> --%>
<!-- 			<li>Indirizzo:</li> -->
<!-- 		</ul> -->
<%-- 		<div>Via: ${orderController.customer.address.street}</div> --%>
<%-- 		<div>Citta': ${orderController.customer.address.city}</div> --%>
<%-- 		<div>Regione: ${orderController.customer.address.state}</div> --%>
<%-- 		<div>Paese: ${orderController.customer.address.country}</div> --%>
<%-- 		<div>ZipCode: ${orderController.customer.address.zipCode}</div> --%>
<%-- 		<h:form> --%>
<%-- 			<h:commandButton action="inserisciIdOrdine.jsp" --%>
<%-- 				value="Torna indietro" /> --%>
<%-- 		</h:form> --%>
	</f:view>
</body>
</html>