<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ordine selezionato</title>
</head>
<body>
	<f:view>
		<h1>Ordine selezionato</h1>
		<h:form>
			<ol>
				<c:forEach var="orderline" items="#{orderController.orderlines}">
				<li>Id : ${orderline.id} - Prezzo per unita': ${orderline.unitPrice} - Quantita' : ${orderline.quantity} </li>
				</c:forEach>
			</ol>
			<!-- Mancano i bottoni torna alla HOME -->
		</h:form>
	</f:view>
</body>
</html>