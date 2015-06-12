<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Catalogo prodotti</title>
</head>
<body>
	<f:view>
		<h1>Prodotti presenti nel catalogo</h1>
		<h:form>
			<ol>
				<c:forEach var="product" items="#{productController.products }">
					<li>Nome: <h:commandLink
							action="#{productController.findProduct}" value="#{product.name}">
							<f:param name="id" value="#{product.id}" />
						</h:commandLink> - Prezzo: ${product.price}
					</li>
				</c:forEach>
			</ol>
			<ul>
				<li><h:commandButton value="Torna alla home"
						action="customerHome.jsp" /></li>
			</ul>
		</h:form>
	</f:view>
</body>
</html>