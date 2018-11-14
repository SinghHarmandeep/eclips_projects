
public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account(112, 20000, 4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println(account);
		
		System.out.println(account.getBalance() + " " + account.getMonthelyInterest()+" "+ account.getDate());
	}
}
