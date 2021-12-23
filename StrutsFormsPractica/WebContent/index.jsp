<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>STRUTS 2.0: ALTA, CONSULTA,CATALOGO DE PRODUCTOS</h1>
	<form action="formalta.jsp" method="post">
		<input type="submit" value="SUBIR NUEVOS PRODUCTOS" />
	</form>
	<br>
	<form action="consulta.action" method="post">
		<input type="submit" value="CONSULTA PRODUCTOS" />
	</form>
	<br>
	<form action="catalogo.action" method="post">
		<input type="submit" value="CATALOGO DE PRODUCTOS" />
	</form>
	<br>
</body>
</html>