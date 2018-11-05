package interfaced;

import java.util.ArrayList;
import java.util.Random;

public class TestClass {

	public static void main(String[] args) {
		ArrayList<Circle> circles = new ArrayList<>(); //storying in arrayList just because
		ArrayList<Square> squares = new ArrayList<>(); //storying in arrayList just because
		
		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
		Circle circle = new Circle(random.nextDouble()*10);
		Square square = new Square(random.nextDouble()*10);
		circles.add(circle);
		squares.add(square);
		
		System.out.println(circle.area()); //prints area of circle
		System.out.println(circle.perimeter()); //prints perimeter of circle
		
		System.out.println(square.area()); //prints area of square
		System.out.println(square.perimeter()); //prints perimeter of square
		}
		
		for (Square square : squares) { //compareTo() for the squares
			System.out.println(square.compareTo(squares.get(2)));
		}
		for (Circle circle: circles) { //compareTo() for the circles
			System.out.println(circle.compareTo(circles.get(2)));
		}
	}

}
