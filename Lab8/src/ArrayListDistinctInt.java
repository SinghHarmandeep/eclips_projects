import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDistinctInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		for (int i =0; i < 10; i++) {
			list.add(scan.nextInt());
		}
		System.out.println(list + "eat it");
		
		for(int x = 0; x<list.size(); x++) {
			for(int y = x+1; y<list.size(); y++) {
				if(list.get(x)==list.get(y)) {
					list.remove(y);
				}
			}
		}
		for(Object x: list) {
			System.out.print(x + " ");
		}
		scan.close();
	}
}