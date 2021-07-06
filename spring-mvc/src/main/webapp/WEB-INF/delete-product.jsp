<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">

		<h1>Delete Product</h1>
		<br />
		<form action="delete" method="post" modelAttribute="product">

			<table border="0" cellpadding="10">
				<tr>
					<td>Product Name:</td>
					<td><input type="text" name="name" /></td>
				</tr>

				<input type="hidden" name="brand" value="1" />
				<input type="hidden" name="madeIn" value="1" />
				<input type="hidden" name="price" value="1" />


				<tr>
					<td colspan="2"><button type="submit">Delete</button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>