package Assignment4;

import java.time.LocalDate;
import java.time.LocalTime;


public class Transaction {
	
	private LocalDate date;
	private LocalTime time;
	private char type;
	private double amount, balance;
	private String description;
	
	public Transaction(char type, double amount, double balance, String description) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		this.date = LocalDate.now();
		this.time = LocalTime.now();
	}
	public Transaction() { // default constructor
		this.type=0;
		this.amount = 0;
		this.balance = 0;
		this.description = null;
		this.date = LocalDate.now();
		this.time = LocalTime.now();
	}
	
	
	public String toString() {
		return "" + this.date + " " + this.time + " "+ this.type + " "+ this.amount + " " + this.description + " " + this.balance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Following are getters and setters
	public LocalDate getDate() {
		return date;
	}
	public char getType() {
		return type;
	}
	public void setType(char transaction) {
		this.type = transaction;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
