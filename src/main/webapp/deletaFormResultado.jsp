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
  <c:if test="${empty listaMunicipios}">
  	<p style="color:red;">Lista de municipios vazia ou não carregada!</p>
  </c:if>
 	<c:forEach items="${listaMunicipios}" var="municipio">
 		<c:if test="${municipio.id == usuario.municipio_id}">
		  <tr>
		    <td><c:out value="${usuario.id}" /></td>
		    <td><c:out value="${usuario.nome}" /></td>
		    <td><c:out value="${usuario.email}" /></td>
		    <td><c:out value="${usuario.cpf}" /></td>
		    <td><c:out value="${municipio.nome}" /></td>
		  </tr> 		
 		</c:if>
	</c:forEach>
  
</table>
</body>
</html>