<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Registro</title>
	<!-- Bootstrap core CSS 
		    <link href="css/bootstrap.min.css" rel="stylesheet" >-->
		    <!-- Bootstrap theme
		    <link href="css/bootstrap-theme.min.css" rel="stylesheet"> -->
		    <link href="css/estilos.css" rel="stylesheet">
		    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
		    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
	</head>
	<body>
		<div class="fondo">
		<main class="container"> <!-- Clase de Bootstrap. Hace que los elementos no lleguen hasta el borde -->
			<form:form  action="procesarRegistro" method="POST" modelAttribute="usuario" class="row g-3">
			<h1 class="mt-3">Registro</h1>
				<div class="col-md-6">
    <label for="nombre" class="form-label control-label">Nombre</label>
    <input type="text" class="form-control" id="nombre">
  </div>
  <div class="col-md-6">
    <label for="apellido" class="form-label control-label">Apellido</label>
    <input type="text" class="form-control" id="apellido">
  </div>
  <div class="col-12">
    <label for="email" class="form-label control-label">Correo electronico</label>
    <input type="email" class="form-control" id="email">
  </div>
  <div class="col-12">
    <label for="password" class="form-label control-label">Contraseña</label>
    <input type="password" class="form-control" id="password">
  </div>
  <div class="col-12">
    <label for="repass" class="form-label control-label">Confirmar contraseña</label>
    <input type="password" class="form-control" id="repass">
  </div>
  <div class="col-12">
    <label for="patente" class="form-label control-label">Patente del vehiculo</label>
    <input type="text" class="form-control" id="patente">
  </div>
  <div class="col-12">
    <button type="submit" class="btn btn-primary control-label mb-3">Registrarme</button>
  </div>
			</form:form>
		</main>
		
	</body>
	</html>