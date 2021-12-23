<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CATALOGO</title>
</head>
<s:head/>
<sx:head/>
<body>
<sx:tabbedpanel id="formCatalogo">
		<sx:div label="CATALOGO PRODUCTOS">
			<s:radio name="nombre" label="PRODUCTO" list="nombrePRODUCTO_T"></s:radio>
			<br>
			<s:checkboxlist name="nombre" label="PRODUCTO" list="nombrePRODUCTO_T"></s:checkboxlist>
			<br>
			<s:select name="nombre" label="PRODUCTO" list="nombrePRODUCTO_T"
				headerKey="1" headerValue="SeleccionaPROD"></s:select>
			<br>
			<sx:autocompleter name="nombre" label="PRODUCTO" list="nombrePRODUCTO_T"></sx:autocompleter>

		</sx:div>>
	</sx:tabbedpanel>
</body>
</html>