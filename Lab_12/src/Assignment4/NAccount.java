package Assignment4;

import java.util.ArrayList;

public class NAccount extends Account {

	public String name; //name
	public ArrayList<Transaction> transactions = new ArrayList<>(); //transactions
	Transaction deal;
	
	public NAccount(String name,int _id, double _balance) {//for accounts supper class
		super(_id, _balance);
		this.name = name;
		
	}
	public NAccount(String name, int _id, double _balance, double anualInterest){
		super(_id, _balance, anualInterest);
		this.name = name;
	};
	
	@Override
	public void deposit(double amount) { 
		if(amount <0) {
			System.out.println("You are depositing nothing");
		}
		else {
			setBalance(getBalance()+amount);//adding to balance
			deal = new Transaction('D', amount, getBalance(), "Cheque");
			transactions.add(deal);
		}
		
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount > getBalance()) {
			System.out.println("You can't take out all your money");
		}
		else {
			setBalance(getBalance()-amount); // taking from balance
			deal = new Transaction('W', amount, getBalance(), "Cash");
			transactions.add(deal);
		}
	}
	
	@Override
	public String toString() {	
		String transact = "" ;
		for (int i = 0; i < transactions.size(); i++) {
			transact += transactions.get(i) + "\n";
		}
		return 
		name + super.toString() +"\nTransactions:\n"+transact ;
	}
	
}