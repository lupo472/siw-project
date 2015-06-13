
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">


<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<title>Welcome</title>
</head>
<body>
	<f:view>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">BuyBuddy</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <h:form>
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">About <span class="sr-only">(current)</span></a></li>
        <li><h:commandLink action="#{productController.listProducts}">Catalogo Prodotti</h:commandLink></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      		<li><a href="administratorLogin.jsp"><button type="button" class="btn btn-default navbar-btn">Login Amministratore</button></a></li>
        	<li><a href="customerLogin.jsp"><button type="button" class="btn btn-default navbar-btn">Login Utente</button></a></li>
 			<li><a href="customerSignUp.jsp"><button type="button" class="btn btn-default navbar-btn">Registrazione</button></a></li>
          </ul>
      </h:form>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

					<!-- 					<p> -->
					<!-- 						<strong>Scegli un operazione </strong> -->
					<!-- 					</p> -->
					<!-- 					<p> -->
					<!-- 						<strong>Registrati o accedi al portale se vuoi effettuare -->
					<!-- 							un ordine!</strong> -->
					<!-- 					</p> -->
					<%-- 					<h:form> --%>
					<!-- 						<ul> -->
					<%-- 							<li><h:commandButton value="Login" action="customerLogin" /></li> --%>
					<%-- 							<li><h:commandButton value="Admin Login" --%>
					<%-- 									action="#{administratorController.administratorLogin }" /></li> --%>
					<%-- 							<li><h:commandButton value="Registrati" --%>
					<%-- 									action="#{customerController.signUp}" /></li> --%>
					<%-- 							<li><h:commandButton value="Catalogo prodotti" --%>
					<%-- 									action="#{productController.listProducts}" /></li> --%>
					<!-- 						</ul> -->
					<%-- 					</h:form> --%>
	</f:view>
</body>
</html>
