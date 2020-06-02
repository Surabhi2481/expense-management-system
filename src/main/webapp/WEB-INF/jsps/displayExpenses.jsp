<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Expenses</title>
</head>
<body>
<h2>Expenses:-</h2>

<table>
	<tr>
		<th> ID </th>
		<th> Name </th>
		<th> Type </th>
		<th> Date </th>
		<th> Amount </th>		
	</tr>
	<c:forEach items="${allExpenses}" var="expense">
	<tr>
		<td>${expense.id}</td>
		<td>${expense.name}</td>
		<td>${expense.type}</td>
		<td>${expense.date}</td>
		<td>${expense.amount}</td>
		<td><a href="deleteExpense?id=${expense.id}">delete</a></td>
	</tr>
	</c:forEach>
	
</table>

<a href="showCreate">Add New Expense</a>
</body>
</html>