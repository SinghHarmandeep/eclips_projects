package interfaced;

public class Circle implements Enclosure, Comparable{
	private double radius;
	
	/**
	 * @param radius
	 * <p> the constructor
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	@Override
	public double perimeter() {
		return (2 * Math.PI * this.radius);
	}

	@Override
	public double area() {
		return (Math.PI * this.radius * this.radius);
	}

	@Override
	public int compareTo(Object o) {
		if(o != null && o instanceof Circle) {
			Circle other = (Circle) o;
			if(other.area() > this.area()) return -1;
			else if (other.area() < this.area()) return 1;
			else return 0;
		}
		return 34404;
	}

}
