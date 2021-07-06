<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="utf-8" />
<title>Create New Product</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div align="center">
		<h1>Create New Product</h1>
		<br />
		<form action="save" th:action="@{/save}" th:object="${product}"
			method="post" modelAttribute="product">

			<table border="0" cellpadding="10">
				<tr>
					<td>Product Name:</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Brand:</td>
					<td><input type="text" name="brand" /></td>
				</tr>
				<tr>
					<td>Made In:</td>
					<td><input type="text" name="madeIn" /></td>
				</tr>
				<tr>
					<td>Price:</td>
					<td><input type="text" name="price" /></td>
				</tr>
				<tr>
					<td colspan="2"><button type="submit">Save</button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
