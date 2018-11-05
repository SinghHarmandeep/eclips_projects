package interfaced;

public class Square implements Enclosure, Comparable{
	private double distance;
	
	/**
	 * @param a
	 * <p> constructor
	 */
	public Square(double a) {
		this.distance = a;
	}
	
	@Override
	public double perimeter() {
		return (4 * this.distance);
	}
	
	@Override
	public double area() {
		return (this.distance * this.distance);
	}
	
	@Override
	public int compareTo(Object o) {
		if (o != null && o instanceof Square) {
			Square other = (Square) o;
			if (other.area() > this.area()) return -1;
			else if(other.area() < this.area())return 1;
			else return 0;
		}
		return 34404;
	}


}
