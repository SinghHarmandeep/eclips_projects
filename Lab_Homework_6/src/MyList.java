import java.util.ArrayList;
import java.util.Scanner;

public class MyList<T extends Number> {

	private ArrayList<T> list = new ArrayList<>();
	
	public void add(T pram) {
		list.add(pram);
		
	}
	
	public ArrayList<T> getList() {
		return list;
	}
	
	public void setList(ArrayList<T> list) {
		this.list = list;
	}
	
	public T largest() {
		int largeAt = 0;
		double large =0;
		for(int i =0; i<list.size(); i++) {
			if (list.get(i).doubleValue()>large) {
				largeAt = i;
				large = list.get(i).doubleValue();
			}
		}
		return list.get(largeAt);
	} 
	
	public T smallest() {
		int smallAt = 0;
		double small = list.get(0).doubleValue();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).doubleValue()<small) {
				smallAt = i;
			}
		}
		
		return list.get(smallAt);
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyList<Number> name = new MyList<Number>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter " + i+ ": ");
			name.add(scan.nextDouble());
		}
		scan.close();
		System.out.println(name.getList());
		System.out.println("Largest: "+name.largest());
		System.out.println("Smallest: "+name.smallest());
		
	}
}
