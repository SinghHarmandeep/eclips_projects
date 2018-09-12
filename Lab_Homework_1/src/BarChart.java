import java.util.Scanner;

public class BarChart {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] storeSale= new int[5];
		
		int store=1;
		for(int i = 0; i<5; i++) {
			System.out.print("Enter today's sale for sotre "+ store + ": ");
			storeSale[i]= scan.nextInt();
			store++;

		}
	System.out.println("\nSALES BAR CHART\n");
	
	for(int i = 0; i<5; i++) {
		int Store = 1;
		System.out.print("Store "+ Store+": ");
		for(int i1 = 0; i1<storeSale[i]/100;i1++) {
			System.out.print("*");
		}
		Store++;
		System.out.print("\n");

	}
	
	scan.close();
	}
}
