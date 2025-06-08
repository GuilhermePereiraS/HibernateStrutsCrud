<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="UTF-8">
<title>Tabela de usuarios</title>
<style>

table {
	border-collapse: collapse;
	background-color: #7da195;
	border: solid 2px #b8dbd0;
}

table::selection {
	background-color: #769188
}

tr,td,th {
	border: 2px, solid;
	padding: 5px;
	border-radius: 5px;
}

a {
	padding: 2px;
	font-size: 30px;
}

</style>
</head>
	<body>
		<table>
		
		 <thead>
		    <tr>
		      <th>ID</th>
		      <th>Nome</th>
		      <th>Email</th>
		      <th>CPF</th>
		      <th>Município</th>
		    </tr>
		  </thead>
		  
		  <tbody>
		  <c:if test="${empty listaUsuarios}">
		  	<p style="color:red;">Lista vazia ou não carregada!</p>
		  </c:if>
		 	<c:forEach items="${listaUsuarios}" var="usuario">
		 		<c:forEach items="${listaMunicipios}" var="municipio">
		 		<c:if test="${municipio.id == usuario.municipio.id}">
				  <tr>
				    <td><c:out value="${usuario.id}" /></td>
				    <td><c:out value="${usuario.nome}" /></td>
				    <td><c:out value="${usuario.email}" /></td>
				    <td><c:out value="${usuario.cpf}" /></td>
				    <td><c:out value="${municipio.nome}" /></td>
				  </tr> 		
		 		</c:if>
			</c:forEach>
		</c:forEach>
		  
		</table>
		<br>
		<a href="index.jsp">Voltar</a>
	</body>
</html>