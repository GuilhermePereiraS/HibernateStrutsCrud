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
<title>Insert title here</title>
</head>
	<body>
		 <html:form action="/deleta">
			 <label>Selecione um usuario para deletar</label><br>
			 <html:select property="nome">
			 	<html:options collection="listaUsuarios" property="nome" labelProperty="nome"></html:options>
			 </html:select>
			 <html:submit value="Deletar" />
		 </html:form>
	</body>
</html>