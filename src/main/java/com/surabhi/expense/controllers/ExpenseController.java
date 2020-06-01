package com.surabhi.expense.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpenseController {

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createExpense";
	}
}
