<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>Pannello aggiornamento catalogo</title>
</head>
<body onload="reset">
	<f:view>
	
	
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
							<li><h:commandLink action="#{updateCatalogController.discardCreationProduct}"><button type="button"
										class="btn btn-default navbar-btn">Torna Indietro</button></h:commandLink></li>
						</ul>
					</h:form>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
		
		<div class="container" align="center">
				<h1 class="form-signin-heading" align="center">Aggiornamento Catalogo</h1>
			<h:form styleClass="form-signin">
				
				<div>
				<label class="sr-only" for="inputProductName"></label>
				<h:inputText id="inputProductName" styleClass="form-control"
					value="#{updateCatalogController.nameProduct}"
					required="true"  requiredMessage="Nome obbligatorio">
					<h:outputLabel value="Nome" />
				</h:inputText>
				<h:message for="inputProductName" />
				</div>
				
				<div>
				<label class="sr-only" for="inputProductPrice"></label>
				<h:inputText id="inputProductPrice" styleClass="form-control"
					value="#{updateCatalogController.price}"
					required="true"  requiredMessage="Prezzo obbligatorio">
					<h:outputLabel value="Prezzo" />
				</h:inputText>
				<h:message for="inputProductPrice" />
				</div>
				
				<div>
				<label class="sr-only" for="inputProductDescription"></label>
				<h:inputText id="inputProductDescription" styleClass="form-control"
					value="#{updateCatalogController.description}"
					required="false">
					<h:outputLabel value="Descrizione" />
				</h:inputText>
				</div>
				
				<div>
				<label class="sr-only" for="inputProductCode"></label>
				<h:inputText id="inputProductCode" styleClass="form-control"
					value="#{updateCatalogController.code}"
					required="true" requiredMessage="Codice obbligatorio">
					<h:outputLabel value="Codice prodotto" />
				</h:inputText>
				<h:message for="inputProductCode" />
				</div>
				
				<div>
				<label class="sr-only" for="inputProductInStock"></label>
				<h:inputText id="inputProductInStock" styleClass="form-control"
					value="#{updateCatalogController.inStock}"
					required="true"  requiredMessage="Quantità in stock obbligatoria">
					<h:outputLabel value="In Stock" />
				</h:inputText>
				<h:message for="inputProductInStock" />
				</div>
				
				<p>Dati provider:</p>
				
				<div>
				<label class="sr-only" for="inputProviderName"></label>
				<h:inputText id="inputProviderName" styleClass="form-control"
					value="#{updateCatalogController.nameProvider}"
					required="true"  requiredMessage="Nome obbligatorio">
					<h:outputLabel value="Nome" />
				</h:inputText>
				<h:message for="inputProviderName" />
				</div>
				
				<div>
				<label class="sr-only" for="inputProviderPhone"></label>
				<h:inputText id="inputProviderPhone" styleClass="form-control"
					value="#{updateCatalogController.phoneNumber}"
					required="true"  requiredMessage="Telefono obbligatorio">
					<h:outputLabel value="Telefono" />
				</h:inputText>
				<h:message for="inputProviderPhone" />
				</div>
				
				<div>
				<label class="sr-only" for="inputProviderEmail"></label>
				<h:inputText id="inputProviderEmail" styleClass="form-control"
					value="#{updateCatalogController.email}"
					required="true"  requiredMessage="Email obbligatoria">
					<h:outputLabel value="Email" />
				</h:inputText>
				<h:message for="inputProviderEmail" />
				</div>
				
				<div>
				<label class="sr-only" for="inputProviderVatin"></label>
				<h:inputText id="inputProviderVatin" styleClass="form-control"
					value="#{updateCatalogController.vatin}"
					required="true"  requiredMessage="Vatin obbligatorio">
					<h:outputLabel value="Vatin" />
				</h:inputText>
				<h:message for="inputProviderVatin" />
				</div>
				
				<p>Dati indirizzo provider:</p>
				
			<div>
				<label class="sr-only" for="inputStreet"></label>
				<h:inputText id="inputStreet" styleClass="form-control"
					value="#{updateCatalogController.street}"
					required="true"  requiredMessage="Via obbligatoria">
					<h:outputLabel value="Via" />
				</h:inputText>
				<h:message for="inputStreet" />
				</div>
				
				<div>
				<label class="sr-only" for="inputCity"></label>
				<h:inputText id="inputCity" styleClass="form-control"
					value="#{updateCatalogController.city}"
					required="true"  requiredMessage="Città obbligatoria">
					<h:outputLabel value="Città" />
				</h:inputText>
				<h:message for="inputCity" />
				</div>
				
				<div>
				<label class="sr-only" for="inputStateRegion"></label>
				<h:inputText id="inputStateRegion" styleClass="form-control"
					value="#{updateCatalogController.state}"
					required="true"  requiredMessage="Stato/Regione obbligatoria">
					<h:outputLabel value="Stato/Regione" />
				</h:inputText>
				<h:message for="inputStateRegion" />
				</div>
				
				<div>
				<label class="sr-only" for="inputCountry"></label>
				<h:inputText id="inputCountry" styleClass="form-control"
					value="#{updateCatalogController.country}"
					required="true"  requiredMessage="Paese obbligatorio">
					<h:outputLabel value="Paese" />
				</h:inputText>
				<h:message for="inputCountry" />
				</div>
				
				<div>
				<label class="sr-only" for="inputZipCode"></label>
				<h:inputText id="inputZipCode" styleClass="form-control"
					value="#{updateCatalogController.zipCode}"
					required="true"  requiredMessage="ZipCode obbligatorio">
					<h:outputLabel value="ZipCode" />
				</h:inputText>
				<h:message for="inputZipCode" />
				</div>
				<div>
				
				
				<div class="checkbox"></div> 
				<h:commandLink action="#{updateCatalogController.createProvider}">
					<button class="btn btn-lg btn-primary btn-block" type="submit">Aggiungi provider</button>
				</h:commandLink>
				</div>
				
				<div>
				<div class="checkbox"></div> 
				<h:commandLink action="#{updateCatalogController.createProduct}">
					<button class="btn btn-lg btn-primary btn-block" type="submit">Aggiungi prodotto</button>
				</h:commandLink>
				</div>
				
			</h:form>
		</div>
	</f:view>
</body>
</html>