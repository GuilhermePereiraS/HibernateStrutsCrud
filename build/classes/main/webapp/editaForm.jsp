<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta charset="UTF-8">
<title>Editar Usuário</title>
<style>
	form { padding: 10px;
	}
	
	form > input {
		margin: 5px;
	}
	
	
	
	
</style>
</head>
<body>
<html:form action="procura" method="post">
  <h2>Procure um usuário para editar</h2>
  <html:text property="nome" />
  <html:hidden property="origem" value="edita"/>
  <html:submit value="Procurar" />
</html:form>
	
		
	  <div>
	  <html:form action="atualiza">
		    <html:text property="nome"  /><br>
		    <html:text property="email" /><br>
		    <html:text property="cpf" /><br>
		    

		    <input type="text" name="municipioNome" value="${nomeMunicipioResultado}"/>

		    
		    <html:hidden property="municipio_id"  /><br>
		    <label>Id do usuário:</label><br>
		    <html:text property="id" readonly="true"/><br>
		   	<input type="submit" value="Concluir">
	  </html:form>
	  </div>
	
	<script>
  document.getElementById('nome').setAttribute('placeholder', 'digite aqui');
</script>
</body>
</html>