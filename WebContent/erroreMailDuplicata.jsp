<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Errore</title>
</head>
<body>
	<f:view>
		<h1>Errore Registrazione</h1>
		<p>
			<strong>La mail con cui vuoi registrarti appartiene a un utente gia' registrato, prova a inserirne un'altra.</strong> 
		</p>
		<h:form>
			<ul>
		<li><h:commandButton value="Torna indietro" action="customerSignUp"/></li>
			</ul>
		</h:form>
	</f:view>
</body>
</html>