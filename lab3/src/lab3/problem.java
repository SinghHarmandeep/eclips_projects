package lab3;

import java.util.Random;

public class problem {
	
	public static void main(String[] arg) {
		int[] aRand = new int[20];
		populateArray(aRand);
		printArray(aRand);
		selectionSort(aRand);
		printArray(aRand);
	}
	
	public static void populateArray(int[] array) {
		Random random = new Random();
		for(int i = 0; i < 20; i++) {
			array[i] = random.nextInt(10)+1;
		}	
	}
	
	public static double calculateAverage(int[] array) {
		double x = 0;
		for(int i=0; i<20; i++) {
			x = x + array[i];
		}
		double average = x/array.length;
		return average;
	}
	
	public static void printArray(int[] array) {
		System.out.println("The values in the array are as follow: ");
		for(int i = 0; i<20; i++) {
			
			System.out.println(array[i]);	
		}
		System.out.println("The average of this array is: "+ calculateAverage(array));
	}
	
	public static void selectionSort(int[] array) {
		int size = array.length;
		for(int i = 0; i < size-1; i++) {
			
			int minInd = i;
			for(int j = i+1; j < size; j++) {
				if(array[j]< array[minInd])
					minInd = j;
			}
			int temp  = array[minInd];
			array[minInd]= array[i];
			array[i]= temp;
		}	
	}
	

}
