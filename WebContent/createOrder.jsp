<%@page import="it.uniroma3.siw.controller.OrderLineController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Creazione nuovo ordine</title>
</head>
<body>
	<f:view>
		<h1>Crea un nuovo ordine</h1>
		<h:form>
			<ul>
				<li><h:inputText value="#{productController.code}"
						label="Codice Prodotto" required="true"
						requiredMessage="Code is mandatory" id="code" /> <h:message
						for="code" /></li>

				<li><h:inputText value="#{orderLineController.quantity}"
						label="Quantità" required="true"
						requiredMessage="Quantity is mandatory"
						converterMessage="Quantity must be a number" id="quantity">

					</h:inputText> <h:message for="quantity" /></li>
				<li><h:commandButton value="Inserisci nell'ordine"
						action="#{orderLineController.createOrderLine}" /></li>
				<li><h:commandButton value="Conferma Ordine" action="#{orderController.createOrder}"/>

			</ul>
		</h:form>
	</f:view>
</body>
</html>