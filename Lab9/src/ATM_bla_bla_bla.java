import java.util.Scanner;

public class ATM_bla_bla_bla {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Account[] accounts = new Account[10];
	
		for(int i = 0; i < accounts.length; i++) {
			Account noOfAccounts = new Account(i, 100,4);
			accounts[i]=noOfAccounts;
		}
		int input_id;
		int choice;
		
		while(5>3)//since 5 is always greater {	
			System.out.println("Enter an id between 0 to 9 for more information about that id: ");
			input_id = scan.nextInt();
		while(input_id<0 || input_id>9) {
			System.out.println("Incorrect Input.\nEnter an id between 0 to 9 ");
			input_id = scan.nextInt();
			}
			
		do {
			System.out.println("\nMain menu: \n1:Check Balance \n2:Withdraw \n3:Deposit \n4:Exit");
			System.out.println("Enter your choice: ");
			choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Your account balance is: " +accounts[input_id].getBalance() + "\n\n");
				break;
			case 2:
				System.out.println("Enter the amount you want to withdraw");
				accounts[input_id].withdraw(scan.nextDouble());
				break;
			case 3:
				System.out.println("Enter the amount you wish to deposit");
				accounts[input_id].deposit(scan.nextDouble());
				break;
			
			}
			
			
		} while (choice !=4);
	}
		
		
		
		
		
		
	}
}

