<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Selezione</title>
</head>
<body>
	<f:view>
		<h1>Prodotto selezionato</h1>
		<ul>
		<li>Nome: ${productController.product.name } </li>
		<li>Prezzo: ${productController.product.price }</li>
		<li><h:outputText>Descrizione: ${productController.product.description }</h:outputText>
		<li>Codice: ${productController.product.code }</li>
		<li>In stock: ${productController.product.inStock }</li>
		</ul>
		<h:form>
		<h:commandButton action="#{productController.getBackToProducts}" value="Torna indietro"/>
		</h:form>
	</f:view>
</body>
</html>