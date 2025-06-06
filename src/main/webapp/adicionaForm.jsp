<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>


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
	
	  <label for="municipio_id">Municipio:</label>
	  <html:select property="municipio_id">
		<html:options collection="listaMunicipios" property="id" labelProperty="nome"/>
	  </html:select><br>
	
	  <html:submit value="Adicionar"/>
	</html:form>
</body>
</html>