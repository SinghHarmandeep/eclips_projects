import java.util.Scanner;

public class lab2 {
	

public static void main(String[] arg) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your name: ");
	String name;

	name = scan.nextLine();
	System.out.println(name);
	int len = name.length();
	System.out.println("length of your name is: "+len);

	char[] arrayname = name.toCharArray(); // convert string to char array
	String nameagain = new String(arrayname);// convert char array to string
	String namess = String.valueOf(arrayname, len/2, len/2);//converts char array to string and also returns a sub array
	System.out.println(namess);
	System.out.println(nameagain);
	
	System.out.println(name.equals(nameagain));
	
	
	for(int i = 0; i<=len-1; i++) { // divides the string into two if in first name last name format
		if(name.charAt(i)==' ') {
			
			System.out.print("Your first name is ");
			for(int x = 0; x<i ; x++) {
				System.out.print(name.charAt(x));
			}
			System.out.print("\nYour last name is ");
			for(int x = i+1; x<len ; x++) {
				System.out.print(name.charAt(x));
			}
		}		
	
	}
	
	
	
	scan.close();
}
}
