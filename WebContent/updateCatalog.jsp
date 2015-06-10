<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pannello aggiornamento catalogo</title>
</head>
<body onload="reset">
	<f:view>
		<h1>Aggiungi un nuovo prodotto nel catalogo</h1>
		<h:form id="form1">
			<div>
				Nome:
				<h:inputText value="#{productController.name}"
					required="true" requiredMessage="Campo obbligatorio" id="name" />
				<h:message for="name" />
			</div>
			<div>
				Prezzo:
				<h:inputText value="#{productController.price}" autocomplete="off"
					required="true" requiredMessage="Campo obbligatorio" id="price" />
				<h:message for="price" />
			</div>
			<div>
				Descrizione:
				<h:inputText value="#{productController.description}"
					autocomplete="off" size="60" required="true"
					requiredMessage="Campo obbligatorio" id="description" />
				<h:message for="description" />
			</div>
			<div>
				Codice:
				<h:inputText value="#{productController.code}" autocomplete="off"
					required="true" requiredMessage="Campo obbligatorio" id="code" />
				<h:message for="code" />
			</div>
			<div>
				Numero in stock:
				<h:inputText value="#{productController.inStock}" autocomplete="off"
					required="true" requiredMessage="Campo obbligatorio" id="inStock" />
				<h:message for="code" />
			</div>
			<div>
				<h:commandButton value="Aggiungi"
					action="#{productController.createProduct}" />
			</div>
			<div>
				<h:commandButton value="Cancella campi" onclick="reset" />
			</div>
		</h:form>
	</f:view>
</body>
</html>