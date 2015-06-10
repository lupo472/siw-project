<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Ordini</title>
</head>
<body>
	<f:view>
		<h1>I tuoi ordini</h1>
		<h:form>
			<ol>
				<c:forEach var="order" items="#{orderController.orders}">
					<li>Id ordine: <h:commandLink
							action="#{orderController.retrieveOrder}" value="#{order.id}">
							<f:param name="id" value="#{order.id}" />
						</h:commandLink> - Orario apertura: ${order.creationTime} - Orario chiusura:
						${order.closingTime} - Orario evasione: ${order.processingTime}
					</li>
				</c:forEach>
			</ol>
			<!-- Mancano i bottoni torna alla HOME -->
		</h:form>
	</f:view>
</body>
</html>