import java.util.Scanner;

public class InvalidTestTesting {

	public static void main(String[] args) throws Exception { // why throws exception
		Scanner scan = new Scanner(System.in); //to take inputs
		int[] data = new int[3]; //change it to what ever you like
		
		System.out.println("Enter 3 numbers:");//just printing
		
		for (int i = 0; i < data.length; i++) { //assigning values to the array
			data[i] = scan.nextInt();
		}
		
		TestScores name = new TestScores(data); //creating object of test scores
		
		System.out.println(); //space for grader's convenience
		for (int i = 0; i < data.length; i++) { //Display the data 
			System.out.println(data[i]);
		}
		System.out.println("The average of the numbers is: "+ name.average()); //Display the average
		scan.close();
	}
}
