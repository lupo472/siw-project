<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Home</title>
</head>
<body>
	<f:view>
		<h1>Pannello di amministrazione</h1> 
		<p>
			<strong>Scegli un operazione</strong>
		</p>
		<h:form>
		<ul>
		<li><a href="updateCatalog.jsp">Aggiorna Catalogo</a></li>
		</ul>
		</h:form>
	</f:view>
</body>
</html>