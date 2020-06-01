package com.surabhi.expense.repos;

import org.springframework.data.repository.CrudRepository;

import com.surabhi.expense.models.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Integer>{
	

}
