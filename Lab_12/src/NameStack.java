import java.util.Scanner;

public class NameStack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Eneter the size of the stack:");
		int size = scan.nextInt();
		
		StringDynStack names = new StringDynStack(size);
		
		String nam = "Hello world said ";
		for (int i = 0; i <= size-1 ; i++) { //adding data from 0 to size-1
			names.push(nam+ i); //pushing data
		}
		
		System.out.println(names); //printing all the data after pushes
		
		do { //printing data as it's popped out
			System.out.println(names.pop());
			System.out.println(names);
		} while (!names.empty());

		scan.close();
	}
}
