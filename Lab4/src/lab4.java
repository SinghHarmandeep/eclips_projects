//import java.util.Random;
import java.util.Scanner;
public class lab4 {

	public static void main(String[] args) {
		//Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		double[][] array = new double [3][3];
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j ++) {
				array[i][j]= scan.nextDouble();
			}
		}
		double[][] sortarray = new double[3][3];
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j ++) {
				sortarray[i][j] =array [i][j];
			}
		}
		
		ColumnsSort.sortColumns(sortarray);
		ColumnsSort.printArray(array);
		System.out.println("");
		ColumnsSort.printArray(sortarray);
		System.out.println("");

		ColumnsSort.printArray(array);
		
		scan.close();
	}

}