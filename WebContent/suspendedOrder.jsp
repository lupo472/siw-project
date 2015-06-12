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
		<h1>Ordine sospeso</h1>
		<p>
			<strong>Alcuni prodotti non sono presenti in magazzino nella quantita' specificata dall'ordine ${orderController.id}. </strong>
			<strong>L'ordine e' stato sospeso.</strong>
		</p>
		<h:form>
			<ul>
				<li><h:commandButton value="Torna Indietro"
						action="#{orderController.retrieveAllNotProcessedOrders}" /></li>
			</ul>
		</h:form>
	</f:view>
</body>
</html>