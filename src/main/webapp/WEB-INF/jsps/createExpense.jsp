<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Expense</title>
</head>
<body>
<form action="saveExpense" method="post">
<pre>
Id: <input type="text" name="id" />
Name: <input type="text" name="name" />
Type:-
	Food <input type="radio" name="type" value="food"/>
	Transport <input type="radio" name="type" value="transport"/> 
	Bill <input type="radio" name="type" value="bill" />
Date: <input type="text" name="date" />
Amount: <input type="text" name="amount" />
<input type="submit" value="save" />
</pre>
</form>
${msg}<br />

<a href="viewAllExpenses">View All Expenses</a>
</body>
</html>