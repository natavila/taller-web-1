<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<title>Lista de clientes</title>
</head>
<body>
	<div class="container mt-3">
		<table class="table table-hover">
		<h1>Clientes registrados</h1>
	  <thead>
	    <tr>
	      <th scope="col">ID</th>
	      <th scope="col">Nombre</th>
	      <th scope="col">Apellido</th>
	      <th scope="col">DNI</th>
	      <th scope="col">Email</th>
	       <th scope="col"></th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach var="cliente" 
	             items="${clientes}"
	             varStatus="status">
	                <tr>
	                    <td><b>${cliente.id}</b></td>
	                    <td>${cliente.nombre}</td>
	                    <td>${cliente.apellido}</td>
	                    <td>${cliente.dni}</td>
	                    <td>${cliente.email}</td>
						<td><a href="${pageContext.request.contextPath}/mostrarRegistroAuto/${cliente.id}">Agregar auto</a></td>
	                </tr>
	                
	            </c:forEach>
	  </tbody>
	</table>
	<a class="btn btn-primary" href="home" role="button">Volver</a>
		</div>
</body>
</html>