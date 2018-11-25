import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


//amandeep sunda
public class FileStorage {

	public static void main(String[] args) {
		File file = new File("names.txt");
		
		//PrintWriter printer = null;
		Scanner read = null;
			///printer = new PrintWriter(file);
		
		
		//printer.println("Eat all the ice cream");
		//printer.close();
		
		System.out.println("Done");
		
		try {
			read = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(read.nextLine());
		
		try {
			System.out.println(read.nextLine()+ "ad");
		} catch (Exception e) {
			System.out.println(e);
			e.getStackTrace();
		}
		read.close();
		
	}
}
