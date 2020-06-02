<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Expense</title>
</head>
<body>
<h2>Edit your Expense details:-</h2>
<form action="editExpense" method="post">
<pre>
Id: <input type="text" name="id" value="${expense.id}" readonly/>
Name: <input type="text" name="name" value="${expense.name}"/>
Type:-
	Food <input type="radio" name="type" value="food" ${expense.type == 'food' ? 'checked' : ''}/>
	Transport <input type="radio" name="type" value="transport" ${expense.type == 'transport' ? 'checked' : ''}/> 
	Bill <input type="radio" name="type" value="bill" ${expense.type == 'bill' ? 'checked' : ''}/>
Date: <input type="text" name="date" value="${expense.date}"/>
Amount: <input type="text" name="amount" value="${expense.amount}"/>
<input type="submit" value="saveChanges" />
</pre>
</form>
</body>
</html>