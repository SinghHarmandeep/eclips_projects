import java.util.Scanner;
public class CircleDemo {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter radius of a Circle: ");
		circle.Radius = scan.nextDouble();

		
		System.out.printf("Area of the circle is: " + "%.2f",circle.getArea());
		System.out.println("\nDiameter of the circle is: " + circle.getDiameter());
		System.out.println("Circumference of the circle is: " + circle.getCircumference());
		scan.close();
	}

}
