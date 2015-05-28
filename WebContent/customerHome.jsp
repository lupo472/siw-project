    <%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
    <%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Utente</title>
</head>
<body>
<body>
	<f:view>
		<h1>Benvenuto</h1> <div> <h:inputText value="#{ customerController.firstName }" /></div> <div> <h:inputText value="#{ customerController.lastName }" /></div>
		<p>
			<strong>Scegli un operazione</strong>
		</p>
		<h:form>
		<ul>
		<li><h:commandButton value="Catalogo Prodotti" action="#{productController.listProducts }"/></li>
		<li><h:commandButton value="Crea nuovo ordine" action="createOrder.jsp"/></li>
		
		
		</ul>
		</h:form>
	</f:view>
</body>
</body>
</html>