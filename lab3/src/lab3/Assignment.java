package lab3;

import java.util.Scanner;
public class Assignment {
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);

		//Average of three numbers
		double num1,num2,num3, average;
		System.out.println("Enter three decimal numbers: ");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		average = (num1+num2+num3)/3;
		System.out.printf("The average of the three numbers is: " + "%.3f",average);
		//
		
		//Scanner scann = new Scanner(System.in);
		//Check if palindrome exists
		String input;
		String palindrome = "";
		System.out.println("\nNow enter a string to see if it's a palindrome (we will neglact the spaces): ");
		input = scan.nextLine(); /// Why is it not asking for an input?
		input = input.replaceAll("\\s", "");
		for (int i = input.length()-1; i >=0;i--) {
			palindrome += input.charAt(i);
		}
		System.out.println(input.equals(palindrome));
		//
		
		//Decrypting a message
		String interceptedMessage = ":mmZ\\dxZmx]Zpgy";
		System.out.println(decript(interceptedMessage));
		//
		
		scan.close();
		//scann.close();
	}
	
	public static String decript(String x) {
		String realAnswer = "";
		for(int i =1; i <= 100;i++) { // iterating for all the possible keys
			char solved;
			String Decrepted= ""; 
			for(int index = 0; index <x.length();index++) {
				if(x.charAt(index) + i > 126) {
					solved = (char)(32+((x.charAt(index) + i) - 127));
					Decrepted += solved;
				}
				else {
					solved = (char) (x.charAt(index)+ i);
					Decrepted += solved;
				}
			}
			if(Decrepted.contains("at")) {
				System.out.println("\n"+ i + "\n");
				realAnswer = Decrepted;

				
			}
		}
		
		
		return realAnswer;
	}

}