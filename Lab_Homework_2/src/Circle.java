
public class Circle {
	double Radius;
	final double PI = 3.14159;
	public Circle(double x) {
		Radius = x;
	}
	public Circle() {
		Radius = 0.0;
	}
	public void setRadius(double r) {
		Radius = r;
	}
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