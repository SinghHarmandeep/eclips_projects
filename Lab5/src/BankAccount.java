
public class BankAccount {
	private String acctName;
	private double balance;
	
	BankAccount(){}
	public void setAcctName(String name) {
		if(name.isEmpty()) {
			System.out.println("You didn't enter a name");
		}
		else {
			acctName = name;
		}
	}
	public void setBalance(double blnc) {
		if(blnc<0) {
			System.out.println("You entered a negative balance to begin with.");
		}
		else {
			balance = blnc;
		}
	}
	public String getAcctName() {
		return acctName;
	}
	public double getBalance() {
		return balance;
	}
	public void changeAcctName(String name) {//Incase, the account holder changes their name in official documents
		this.setAcctName(name);
	}
	public void deposit(double put) {
		if(put<0) {
			System.out.println("Invalid deposit amount.");
		}
		else {
			System.out.println("Your balance before the deposit was: " + balance);
			balance = balance + put;
			System.out.println("Your balance after the depositing "+ put + " amount is: "+ balance);
		}
	}
	public void withdrawal(double take) {
		if(take<0) {
			System.out.println("You are withdrawaling a negative amount: " + take);
		}
		else {
			System.out.println("Your balance before withdrawaling "+ take+ " amount is: "+ balance);
			balance = balance - take;
			System.out.println("Your balance after withdrawaling that amount is: "+ balance);
		}
	}
	public String toString() { //overriding the toString method. this will be very helpful.
		return acctName + " " + balance;
	};
}