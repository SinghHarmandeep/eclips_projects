package Assignment4;

import java.util.ArrayList;

public class NAccount extends Account {

	public String name;
	public ArrayList<Transaction> transaction = new ArrayList<>();
	
	public NAccount(int _id, double _balance) {
		super(_id, _balance);
	}
	
	@Override
	public void deposit(double amount) {
		
		super.deposit(amount);
	}
	
}