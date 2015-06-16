<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js">
	
</script>

<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<!-- / margin: .67em 0; -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<!-- CUSTOM theme -->
<link href="bootstrap/css/custom.css" rel="stylesheet" type="text/css">
<link href="bootstrap/css/signin.css" rel="stylesheet" type="text/css">
<title>Pagina di Registrazione</title>
</head>
<body>

</body>
<f:view>
	<h:form>
	
	<nav class="navbar navbar-customblue">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">

					<div class="navbar-header">
						<a class="navbar-brand" href="#"> <img alt="Brand"
							src="./sourcefiles/hb_logo.png"
							style="width: 45px; height: 45px;" align="left">
						</a>
					</div>
					<h:form>
						<ul class="nav navbar-nav navbar-right">
							<li><h:commandLink action="#{customerController.discardSignUp}"><button type="button"
										class="btn btn-default navbar-btn">Torna Indietro</button></h:commandLink></li>
						</ul>
					</h:form>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
		
		<div class="container" align="center">

			<h:form styleClass="form-signin">
				<h2 class="form-signin-heading">Inserisci i tuoi dati</h2>
				
				<div>
				<label class="sr-only" for="inputFirstName"></label>
				<h:inputText id="inputFirstName" styleClass="form-control"
					value="#{customerController.firstName}"
					required="true"  requiredMessage="Nome obbligatorio">
					<h:outputLabel value="Nome" />
				</h:inputText>
				<h:message for="inputFirstName" />
				</div>
				
				<div>
				<label class="sr-only" for="inputLastName"></label>
				<h:inputText id="inputLastName" styleClass="form-control"
					value="#{customerController.lastName}"
					required="true"  requiredMessage="Cognome obbligatorio">
					<h:outputLabel value="Cognome" />
				</h:inputText>
				<h:message for="inputLastName" />
				</div>
				
				<div>
				<label class="sr-only" for="inputDateBirth"></label>
				<h:inputText id="inputDateBirth" styleClass="form-control"
					value="#{customerController.dateOfBirth}"
					required="false">
					<h:outputLabel value="Data di nascita" />
				</h:inputText>
				</div>
				
				<div>
				<label class="sr-only" for="inputPassword"></label>
				<h:inputSecret id="inputPassword" styleClass="form-control"
					value="#{customerController.password}"
					required="true" requiredMessage="Password obbligatoria">
					<h:outputLabel value="Password" />
				</h:inputSecret>
				<h:message for="inputPassword" />
				</div>
				
				<div>
				<label class="sr-only" for="inputEmail"></label>
				<h:inputText id="inputEmail" styleClass="form-control"
					value="#{customerController.email}"
					required="true"  requiredMessage="Email obbligatoria">
					<h:outputLabel value="Email" />
				</h:inputText>
				<h:message for="inputEmail" />
				</div>
				
				<div>Dati indirizzo:</div>
				
				<div>
				<label class="sr-only" for="inputStreet"></label>
				<h:inputText id="inputStreet" styleClass="form-control"
					value="#{customerController.street}"
					required="true"  requiredMessage="Via obbligatoria">
					<h:outputLabel value="Via" />
				</h:inputText>
				<h:message for="inputStreet" />
				</div>
				
				<div>
				<label class="sr-only" for="inputCity"></label>
				<h:inputText id="inputCity" styleClass="form-control"
					value="#{customerController.city}"
					required="true"  requiredMessage="Città obbligatoria">
					<h:outputLabel value="Città" />
				</h:inputText>
				<h:message for="inputCity" />
				</div>
				
				<div>
				<label class="sr-only" for="inputStateRegion"></label>
				<h:inputText id="inputStateRegion" styleClass="form-control"
					value="#{customerController.state}"
					required="true"  requiredMessage="Stato/Regione obbligatoria">
					<h:outputLabel value="Stato/Regione" />
				</h:inputText>
				<h:message for="inputStateRegion" />
				</div>
				
				<div>
				<label class="sr-only" for="inputCountry"></label>
				<h:inputText id="inputCountry" styleClass="form-control"
					value="#{customerController.country}"
					required="true"  requiredMessage="Paese obbligatorio">
					<h:outputLabel value="Paese" />
				</h:inputText>
				<h:message for="inputCountry" />
				</div>
				
				<div>
				<label class="sr-only" for="inputZipCode"></label>
				<h:inputText id="inputZipCode" styleClass="form-control"
					value="#{customerController.zipCode}"
					required="true"  requiredMessage="ZipCode obbligatorio">
					<h:outputLabel value="ZipCode" />
				</h:inputText>
				<h:message for="inputZipCode" />
				</div>
				
				
				<div>
				<div class="checkbox"></div> 
				<h:commandLink action="#{customerController.signUp}">
					<button class="btn btn-lg btn-primary btn-block" type="submit">Registrati</button>
				</h:commandLink>
				</div>
				
			</h:form>
		</div>
		
		
		
		
		
	
<%-- 		<h1>Inserisci i tuoi dati</h1> --%>
<!-- 		<div> -->
<!-- 			Nome: -->
<%-- 			<h:inputText value="#{customerController.firstName}" required="true" --%>
<%-- 				requiredMessage="Nome obbligatorio" id="firstName" /> --%>
<%-- 			<h:message for="firstName" /> --%>
<!-- 		</div> -->
<!-- 		<div> -->
<!-- 			Cognome: -->
<%-- 			<h:inputText value="#{customerController.lastName}" required="true" --%>
<%-- 				requiredMessage="Cognome obbligatorio" id="lastName" /> --%>
<%-- 			<h:message for="lastName" /> --%>
<!-- 		</div> -->
<!-- 		<div> -->
<!-- 			Data di nascita: -->
<%-- 			<h:inputText value="#{customerController.dateOfBirth}" --%>
<%-- 				required="true" requiredMessage="Data obbligatoria" id="dateOfBirth"> --%>
<%-- 				<f:convertDateTime pattern="d-M-yyyy" /> --%>
<%-- 				<h:message for="dateOfBirth" /> --%>
<%-- 			</h:inputText> --%>
<!-- 		</div> -->
<!-- 		<div> -->
<!-- 			Password: -->
<%-- 			<h:inputSecret value="#{customerController.password}" required="true" --%>
<%-- 				requiredMessage="Password obbligatoria" id="password" /> --%>
<%-- 			<h:message for="password" /> --%>
<!-- 		</div> -->

<!-- 		<div> -->
<!-- 			Email: -->
<%-- 			<h:inputText value="#{customerController.email}" required="true" --%>
<%-- 				requiredMessage="Email obbligatoria" id="email" /> --%>
<%-- 			<h:message for="email" /> --%>
<!-- 		</div> -->
<!-- 		<div>Dati indirizzo:</div> -->
<!-- 		<div> -->
<!-- 			Via: -->
<%-- 			<h:inputText value="#{customerController.street}" required="true" --%>
<%-- 				requiredMessage="Via obbligatoria" id="street" /> --%>
<%-- 			<h:message for="street" /> --%>
<!-- 		</div> -->
<!-- 		<div> -->
<!-- 			Citta': -->
<%-- 			<h:inputText value="#{customerController.city}" required="true" --%>
<%-- 				requiredMessage="Citta' obbligatoria" id="city" /> --%>
<%-- 			<h:message for="city" /> --%>
<!-- 		</div> -->
<!-- 		<div> -->
<!-- 			Stato/Regione : -->
<%-- 			<h:inputText value="#{customerController.state}" required="true" --%>
<%-- 				requiredMessage="Stato obbligatorio" id="state" /> --%>
<%-- 			<h:message for="state" /> --%>
<!-- 		</div> -->
<!-- 		<div> -->
<!-- 			Paese : -->
<%-- 			<h:inputText value="#{customerController.country}" required="true" --%>
<%-- 				requiredMessage="Paese obbligatorio" id="country" /> --%>
<%-- 			<h:message for="country" /> --%>
<!-- 		</div> -->
<!-- 		<div> -->
<!-- 			ZipCode : -->
<%-- 			<h:inputText value="#{customerController.zipCode}" required="true" --%>
<%-- 				requiredMessage="Zipcode obbligatorio" id="zipCode" /> --%>
<%-- 			<h:message for="zipCode" /> --%>
<!-- 		</div> -->
<!-- 		<div> -->
<%-- 			<h:commandButton value="Registrati" action="#{customerController.signUp}" /> --%>
<!-- 		</div> -->
<!-- 		<div> -->
<%-- 			<h:commandButton value="Annulla" action="#{customerController.discardSignUp}" --%>
<%-- 				immediate="true" /> --%>
<!-- 		</div> -->
	</h:form>
</f:view>
</html>
