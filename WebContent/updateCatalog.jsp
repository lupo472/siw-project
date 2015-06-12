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
				<h:inputText value="#{updateCatalogController.nameProduct}"
					required="true" requiredMessage="Campo obbligatorio" id="name" />
				<h:message for="name" />
			</div>
			<div>
				Prezzo:
				<h:inputText value="#{updateCatalogController.price}"
					required="true" requiredMessage="Campo obbligatorio" id="price" />
				<h:message for="price" />
			</div>
			<div>
				Descrizione:
				<h:inputText value="#{updateCatalogController.description}"
					size="60" required="true" requiredMessage="Campo obbligatorio"
					id="description" />
				<h:message for="description" />
			</div>
			<div>
				Codice:
				<h:inputText value="#{updateCatalogController.code}" required="true"
					requiredMessage="Campo obbligatorio" id="code" />
				<h:message for="code" />
			</div>
			<div>
				Numero in stock:
				<h:inputText value="#{updateCatalogController.inStock}"
					required="true" requiredMessage="Campo obbligatorio" id="inStock" />
				<h:message for="inStock" />
			</div>
			<p>Dati Provider/s:</p>
			<div>
				Nome:
				<h:inputText value="#{updateCatalogController.nameProvider}"
					required="true" requiredMessage="Campo obbligatorio"
					id="nameProvider" />
				<h:message for="nameProvider" />
			</div>
			<div>
				Telefono:
				<h:inputText value="#{updateCatalogController.phoneNumber}"
					required="true" requiredMessage="Campo obbligatorio"
					id="phoneNumber" />
				<h:message for="phoneNumber" />
			</div>
			<div>
				Email:
				<h:inputText value="#{updateCatalogController.email}"
					required="true" requiredMessage="Campo obbligatorio" id="email" />
				<h:message for="email" />
			</div>
			<div>
				Vatin:
				<h:inputText value="#{updateCatalogController.vatin}"
					required="true" requiredMessage="Campo obbligatorio" id="vatin" />
				<h:message for="vatin" />
			</div>
			<p>Dati indirizzo provider</p>
			<div>
				Via:
				<h:inputText value="#{updateCatalogController.street}"
					required="true" requiredMessage="Campo obbligatorio" id="street" />
				<h:message for="street" />
			</div>
			<div>
				Città:
				<h:inputText value="#{updateCatalogController.city}" required="true"
					requiredMessage="Campo obbligatorio" id="city" />
				<h:message for="city" />
			</div>
			<div>
				Stato:
				<h:inputText value="#{updateCatalogController.state}"
					required="true" requiredMessage="Campo obbligatorio" id="state" />
				<h:message for="state" />
			</div>
			<div>
				Regione:
				<h:inputText value="#{updateCatalogController.country}"
					required="true" requiredMessage="Campo obbligatorio" id="country" />
				<h:message for="country" />
			</div>
			<div>
				ZipCode:
				<h:inputText value="#{updateCatalogController.zipCode}"
					required="true" requiredMessage="Campo obbligatorio" id="zipCode" />
				<h:message for="zipCode" />
			</div>
			<div>
				<h:commandButton value="Aggiungi provider"
					action="#{updateCatalogController.createProvider}" />
			</div>
			<div>
				<h:commandButton value="Salva prodotto"
					action="#{updateCatalogController.createProduct}" />
			</div>
		</h:form>
	</f:view>
</body>
</html>