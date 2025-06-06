<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
label,input {
	margin: 5px;
}
</style>
</head>
<body>
	<html:form action="/adiciona">
	  <label for="nome">Nome:</label>
	  <html:text property="nome" /><br>
	
	  <label for="email">E-mail:</label>
	  <html:text property="email" /><br>
	
	  <label for="cpf">Cpf:</label>
	  <html:text property="cpf" /><br>
	
	  <label for="municipio">Municipio:</label>
	  <select name="municipio">
	  	<c:forEach var="municipios" items="${municipios}">
	  		<option value="${municipios.nome}">${municipios.nome}</option>
	  	</c:forEach>
	  </select><br>
	
	  <html:submit value="Adicionar"/>
	</html:form>
</body>
</html>