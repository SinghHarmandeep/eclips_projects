package Assignment4;
import java.time.LocalDate;

/**
 * 
 * @author manusingh
 *<p>Mahadavi's Homework Assignment part 1
 */
public class Account {
	private int id;
	private double balance; //max 100
	private double anualInterestRate;
	LocalDate dateCreated = LocalDate.now(); //the day the account was created
	
	//constructors assignments
	public Account(int _id, double _balance, double anualInterest) {
		this.setId(_id);
		this.setBalance(_balance);
		this.setAnualInterestRate(anualInterest);
	}
	public Account(int _id, double _balance) {
		this.setId(_id);
		this.setBalance(_balance);	
	}

	//accessors and mutators
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnualInterestRate() {
		return anualInterestRate;
	}	
	public void setAnualInterestRate(double anualInterestRate) {
		this.anualInterestRate = anualInterestRate;
	}
	
	//Computations
	public LocalDate getDate() {
		return dateCreated;
	}
	public double getMonthelyInterestRate() {
		return (this.anualInterestRate/100)/12; //converting annual interest rate to monthly
	}
	public double getMonthelyInterest() {
		return getMonthelyInterestRate()*balance; //monthely interest you get on your balance
	}
	public void withdraw (double amount) {
		if ((balance - amount) <=200) {
			System.out.println("You must keep atleast 200$");
		}
		else
			balance = balance - amount;
	}
	public void deposit(double amount) {
		if(amount <=0) {
			System.out.println("Your not depositing anything!");
		}
		else
			balance = balance + amount;
	}
	
	public String toString() {
		return " "+ id + " "+ balance + " "+ anualInterestRate;
	}
	
}
