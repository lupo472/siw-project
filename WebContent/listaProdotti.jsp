<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Catalogo Prodotti</title>
</head>
<body>
<f:view>
	<h1>Prodotti presenti nel catalogo</h1>
	<ol>
		<c:forEach var="prodotto_corrente" items="#{productController.products }">
			<li>Nome: ${prodotto_corrente.name} - Prezzo: ${prodotto_corrente.price } - Codice: ${prodotto_corrente.code}</li>
		</c:forEach>
	</ol>
	<form action="nuovoProdotto.jsp">
		<input name="bottone_nuovo_prodotto" type="submit"
			value="Torna all'inserimento">
	</form>

</f:view>
</body>
</html>