import java.util.Scanner;
public class Palindrome_Recursion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String x;
		System.out.println("Enter a string to see if it's a palindrome:");
		x = scan.nextLine();
		x = x.replaceAll(" ", "");
		x = x.toLowerCase();
		boolean p = isPalindrome(x);
		System.out.println(p);
		scan.close();
	}

	public static boolean isPalindrome(String input) {
		int inputLength = input.length()-1;
		
		if(input.length() ==1 || input.length() ==0) {
			return true;
		}
		
		else if(input.charAt(0) == input.charAt(inputLength)) {
				isPalindrome(input.substring(1, input.length() - 1));
				return true;
		}
		else {
			return false;
		}
	}
}
