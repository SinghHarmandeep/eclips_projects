import java.util.ArrayList;
import java.util.Arrays;

public class CircleArrayList {

	public static void main(String[] args) {
		
		ArrayList<Circle> circles = new ArrayList<>();
		int x =5;
		
		//size of the arrayList is 10
		for (int i = 0; i < 10; i++) { //set objects to the ArrayList
			Circle obj = new Circle(x);
			circles.add(obj);
			x+=5;
		}
		for (Circle circle : circles) { //print objects
			System.out.println(circle);
		}
		System.out.println();
		for (Circle circle : circles) {
			int y = (int) (Math.random()*10);//random radius
			circle.setRadius(y);
		}
		
		Circle[] circleArray = new Circle[circles.size()];

		circles.toArray(circleArray); //unsorted
		
		System.out.println();
		for (Circle circle : circleArray) {
			System.out.println(circle); //printing objects from array
		}
		
		System.out.println(circles);
		insertionSort(circleArray);
		ArrayList<Circle> sortedCircles = new ArrayList<>(Arrays.asList(circleArray));
		System.out.println(sortedCircles);//sorted
	}
	
	//function to sort array using insertion sort
	public static void insertionSort(Circle[] x) {
		int j;
		for(int i = 1; i<x.length; i++) {
			Circle temp = x[i]; // save the object somehow
			int radius = x[i].getRadius();//since operating wiht radius.
			j = i-1;
			
			while(j>=0 && x[j].getRadius()>radius) {
				x[j+1]=x[j];
				j = j-1;
			}
			x[j+1] = temp;
		}
	}

}
