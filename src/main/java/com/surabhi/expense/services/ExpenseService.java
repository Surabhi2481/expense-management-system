package com.surabhi.expense.services;

import java.util.List;

import com.surabhi.expense.models.Expense;

public interface ExpenseService {

	Expense saveExpense(Expense expense);

	Expense updateExpense(Expense expense);

	void deleteExpense(Expense expense);

	Expense getExpenseById(int id);

	List<Expense> getAllExpense();

}
