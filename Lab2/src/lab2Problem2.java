import java.util.Scanner;

public class lab2Problem2 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Convert Fahrenheit to Celsius: ");
		int f= scan.nextInt();
		double c = 5*(f-32)/9;
		System.out.println(f + " Fahrenheit is "+ c + " Celsius degrees.");
				
	scan.close();
	}
}