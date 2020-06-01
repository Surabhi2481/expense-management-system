package com.surabhi.expense.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surabhi.expense.models.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Integer>{
	

}
