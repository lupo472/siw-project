<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registrazione nuovo cliente</title>
</head>
<body>

</body>
<f:view>
	<h:form>
		<h1>Inserisci i tuoi dati</h1>
		<div>
			Nome:
			<h:inputText value="#{customerSignUPController.firstName}"
				required="true" requiredMessage="Nome obbligatorio" id="firstName" />
			<h:message for="firstName" />
		</div>
		<div>
			Cognome:
			<h:inputText value="#{customerSignUPController.lastName}"
				required="true" requiredMessage="Cognome obbligatorio" id="lastName" />
			<h:message for="lastName" />
		</div>
		<div>
			Data di nascita:
			<h:inputText value="#{customerSignUPController.dateOfBirth}"
				required="true" requiredMessage="Data obbligatoria" id="dateOfBirth">
				<f:convertDateTime pattern="d-M-yyyy" />
				<h:message for="dateOfBirth" />
			</h:inputText>
		</div>
		<div>
			Password:
			<h:inputSecret value="#{customerSignUPController.password}"
				required="true" requiredMessage="Password obbligatoria"
				id="password" />
			<h:message for="password" />
		</div>

		<div>
			Email:
			<h:inputText value="#{customerSignUPController.email}"
				required="true" requiredMessage="Email obbligatoria" id="email" />
			<h:message for="email" />
		</div>
		<div>Dati indirizzo:</div>
		<div>
			Via:
			<h:inputText value="#{customerSignUPController.street}"
				required="true" requiredMessage="Via obbligatoria" id="street" />
			<h:message for="street" />
		</div>
		<div>
			Citta':
			<h:inputText value="#{customerSignUPController.city}" required="true"
				requiredMessage="Citta' obbligatoria" id="city" />
			<h:message for="city" />
		</div>
		<div>
			Stato/Regione :
			<h:inputText value="#{customerSignUPController.state}"
				required="true" requiredMessage="Stato obbligatorio" id="state" />
			<h:message for="state" />
		</div>
		<div>
			Paese :
			<h:inputText value="#{customerSignUPController.country}"
				required="true" requiredMessage="Paese obbligatorio" id="country" />
			<h:message for="country" />
		</div>
		<div>
			ZipCode :
			<h:inputText value="#{customerSignUPController.zipCode}"
				required="true" requiredMessage="Zipcode obbligatorio" id="zipCode" />
			<h:message for="zipCode" />
		</div>
		<div>
			<h:commandButton value="Submit"
				action="#{customerSignUPController.signUp}" />

		</div>
	</h:form>
</f:view>
</html>