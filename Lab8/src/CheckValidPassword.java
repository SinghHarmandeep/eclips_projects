import java.util.Scanner;

/**
 * 
 * @author Harmandeep Singh
 * 
 * <p>This class is to check the following: 
 * <p> 1. If the password has at least 8 characters.	
 * <p> 2. If the password contains only letters or digits
 * <p> 3. If the password has at least 2 digits
 */
public class CheckValidPassword {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password;
		password = scan.nextLine();
		System.out.println(isValid(password));
	}
	
	public static boolean isValid(String input) {
		if(input.length() < 8) { //check if the input is of size less than 8
			System.out.println("pasword is two short");
			return false;
		}
		
		for(int i = 0; i < input.length(); i++) { //check if the input contains anything else than letters or Digit
			if(!Character.isLetterOrDigit(input.charAt(i))) {
				System.out.println("password is not only letter or digits");
				return false;
			}
		}
		
		int numOfDigits=0;
		for(int x =0; x<input.length(); x++) { //check if the input has at lest 2 digits
			if(Character.isDigit(input.charAt(x)))
				numOfDigits +=1;
		}
		if(numOfDigits < 2) {
			System.out.println("password is not at least 2 digits");
			return false;
		}
		return true;
	}
}
