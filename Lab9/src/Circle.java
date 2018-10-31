import java.util.*;

public class Circle {
	private int radius;
		
	public Circle() {}
	public Circle(int param) {
		setRadius(param);
	}
	
	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		return (double) (3.14*radius*radius);
	}
	
	public String toString() {
		return radius+"";
	}
}
