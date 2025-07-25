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
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

table {
	border-collapse: collapse;
}
tr,td,th {
	border: 1px, solid;
	padding: 5px;
}

a {
	padding: 20px;
	font-size: 25px;
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