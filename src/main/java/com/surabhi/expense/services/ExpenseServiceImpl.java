package com.surabhi.expense.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surabhi.expense.models.Expense;
import com.surabhi.expense.repos.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;

	@Override
	public Expense saveExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

	@Override
	public Expense updateExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

	@Override
	public void deleteExpense(Expense expense) {
		expenseRepository.delete(expense);
	}

	@Override
	public Expense getExpenseById(int id) {
		return expenseRepository.findById(id).get();
	}

	@Override
	public List<Expense> getAllExpense() {
		return expenseRepository.findAll();
	}

}
