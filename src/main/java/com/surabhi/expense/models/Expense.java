package com.surabhi.expense.models;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Expense {

	@Id
	private int id;
	private String name;
	private String type;
	private String date;
	private int amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Expense [id=" + id + ", name=" + name + ", type=" + type + ", date=" + date + ", amount=" + amount
				+ "]";
	}

}
