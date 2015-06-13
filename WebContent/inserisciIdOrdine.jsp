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
		<h1>Mostra Dati Cliente</h1>
		<h:form>
			<div>
				Inserisci l'id di un ordine esistente:
				<h:inputText value="#{orderController.id}" required="true"
					requiredMessage="Campo obbligatorio" id="id" />
				<h:message for="id" />
			</div>

			<div>
				<h:commandButton value="Cerca Cliente"
					action="#{orderController.retrieveCustomer}" />
			</div>
			<div>
				<h:commandButton value="Annulla" action="#{orderController.discardRetrieveCustomer}"
					immediate="true" />
			</div>
		</h:form>
	</f:view>
</body>
</html>