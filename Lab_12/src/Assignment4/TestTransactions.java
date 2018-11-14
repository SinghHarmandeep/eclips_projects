package Assignment4;

import java.util.Scanner;

public class TestTransactions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter name, id, balance, interest rate");
		//NAccount newacount = new NAccount(scan.nextLine(),scan.nextInt(),scan.nextDouble(),scan.nextDouble());
		NAccount newacount = new NAccount("Harmandeep", 3243, 1000, 1.5);
		System.out.println("Starting Ballance Info: " +newacount);
		
		newacount.deposit(30);
		newacount.deposit(40);
		newacount.deposit(50);
		newacount.withdraw(5);
		newacount.withdraw(2);
		newacount.withdraw(1);
		System.out.println(newacount);
		scan.close();
		
	}

}
