import java.util.Scanner;
public class AndroidPracticeTest {
	Scanner scan = new Scanner(System.in);
	private static int tag =1;
	private String name;
	
	public AndroidPracticeTest() {
		name = scan.nextLine() +" "+ tag;
	}
	
	/**
	 * 
	 * @return The name of the invoking object
	 */
	public String getname() { // gets the name
		int spaceLocation = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				spaceLocation = i;
			}
		}
	String onlyName = name.substring(0, spaceLocation);
	return onlyName;
	}
	
	
	/**
	 * 
	 * @param n
	 * @return true if n is prime
	 */
	private static boolean isPrime(int n) {
		for (int i = 2; i < n-1; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	/**
	 * changes the tag value with the next prime number larger than the current tag value
	 */
	private static void changeTag() {
		int tempTag = tag+1;
		while (!isPrime(tempTag)) {
			tempTag++;
		}
		tag = tempTag;	
	}

}
