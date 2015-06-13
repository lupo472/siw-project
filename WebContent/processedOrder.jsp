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
		<h1>Ordine processato</h1>
		<p>
			<strong>L'ordine ${orderController.id} e' stato processato correttamente.</strong>
			<strong>Orario evasione: ${orderController.processingDate}</strong>
		</p>
		<h:form>
			<ul>
				<li><h:commandButton value="Evadi un altro ordine"
						action="#{orderController.retrieveAllNotProcessedOrders}" /></li>
				<li><h:commandButton value="Torna alla Home"
						action="administratorHome.jsp" /></li>
			</ul>
		</h:form>
	</f:view>
</body>
</html>