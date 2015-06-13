<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pannello amministrazione</title>
</head>
<body>
	<f:view>
		<h1>Evadi ordine</h1>
		<h:form>
			<ol>
				<c:forEach var="order" items="${orderController.orders}">
					<li>Id: ${order.id}- Data apertura: ${order.creationTime} -
						Data chiusura: ${order.closingTime}</li>
				</c:forEach>
			</ol>
			<div>
				Inserisci l'id di un ordine:
				<h:inputText value="#{orderController.id}" required="true"
					requiredMessage="Campo obbligatorio" id="id" />
				<h:message for="id" />
			</div>

			<div>
				<h:commandButton value="Evadi ordine"
					action="#{orderController.processOrder}" />
			</div>
			<div>
				<h:commandButton value="Annulla" action="#{orderController.discardProcessOrder}"
					immediate="true" />
			</div>
		</h:form>
	</f:view>
</body>
</html>