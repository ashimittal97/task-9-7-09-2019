<?xml version="1.0" encoding="ISO-8859-1" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" version="2.0">
    <jsp:directive.page language="java"
        contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" />
    <jsp:text>
        <![CDATA[ <?xml version="1.0" encoding="ISO-8859-1" ?> ]]>
    </jsp:text>
    <jsp:text>
        <![CDATA[ <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> ]]>
    </jsp:text>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert Books</title>
</head>
<body>
<form action="InsertDetails" method="post"
		style="align: center">
		<p align="center">
			<b>Books Details Form</b>
		</p>
		<hr/>
		<div align="center">
			<table>
				<tr>
					<td>Name of the book</td>
					<td><input type="text" name="name"
						placeholder="enter book name"/></td>
				</tr>

				<tr>
					<td>Subject</td>
					<td><input type="text" name="subject"
						placeholder="enter the subject of book"/></td>
				</tr>

				<tr>
					<td>Price of the book</td>
					<td><input type="text" name="price"
						placeholder="enter price"/></td>
				</tr>

				<tr>
					<td>Edition of the book</td>
					<td><input type="text" name="edition"
						placeholder="enter the edition "/></td>
				</tr>
				<tr>
					<td>
					<input id="btn" type="submit"
						 name="save"
						value="Save Information" /></td>
				</tr>
			</table>
		</div>
		<hr/>
	</form>
</body>
</html>
</jsp:root>