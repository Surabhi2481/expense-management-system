package com.surabhi.expense.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.surabhi.expense.models.Expense;
import com.surabhi.expense.services.ExpenseService;

@Controller
public class ExpenseController {

	@Autowired
	ExpenseService expenseService;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createExpense";
	}

	@RequestMapping("/saveExpense")
	public String saveExpense(@ModelAttribute("expense") Expense expense, ModelMap modelMap) {
		Expense savedExpense = expenseService.saveExpense(expense);
		String msg = "Expense saved with id: " + savedExpense.getId();
		modelMap.addAttribute("msg", msg);
		return "createExpense";

	}
	
	@RequestMapping("/viewAllExpenses")
	public String viewAllExpenses(ModelMap modelMap) {
		List<Expense> allExpenses = expenseService.getAllExpense();
		modelMap.addAttribute("allExpenses", allExpenses);
		return "displayExpenses";
		
	}
	}

