<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pannello amministrazione</title>
</head>
<body>
	<f:view>
		<h1>Cliente selezionato</h1>
		<ul>
			<li>Nome: ${orderController.customer.firstName}</li>
			<li>Cognome: ${orderController.customer.lastName}</li>
			<li>Email: ${orderController.customer.password}</li>
			<li>Data di nascita: ${orderController.customer.dateOfBirth}</li>
			<li>Data di registrazione:
				${orderController.customer.registrationDate}</li>
			<li>Indirizzo:</li>
		</ul>
		<div>Via: ${orderController.customer.address.street}</div>
		<div>Citta': ${orderController.customer.address.city}</div>
		<div>Regione: ${orderController.customer.address.state}</div>
		<div>Paese: ${orderController.customer.address.country}</div>
		<div>ZipCode: ${orderController.customer.address.zipCode}</div>
		<h:form>
			<h:commandButton action="inserisciIdOrdine.jsp"
				value="Torna indietro" />
		</h:form>
	</f:view>
</body>
</html>