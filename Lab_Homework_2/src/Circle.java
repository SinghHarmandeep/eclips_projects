
public class Circle {
	double Radius;
	final double PI = 3.14159;
	public Circle(double x) {
		if(x < 0) {
			System.out.println("Invalid input");
		}
		else {
			Radius = x;
		}
	}
	public Circle() {
		Radius = 0.0;
	}
	public void setRadius(double r) {
		if(r < 0) {
			System.out.println("Invalid input");
		}
		else {
			Radius = r;
		}	}
	public double getRadius() {
		return Radius;
	}
	public double getArea() {
		return (PI * Radius * Radius);
	}
	public double getDiameter() {
		return (2 * Radius);
	}
	public double getCircumference() {
		return (2 * PI * Radius);
	}

}