public class Car {
	int yearModel;
	String brand;
	int speed;
	
	public Car() {}
	
	public Car(int year, String make) {
		speed = 0;
		yearModel = year;
		brand = make;
	}
	
	public int getYearModel() {
		return this.yearModel;
	}
	public String getBrand() {
		return this.brand;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void accelerate() {
		speed += 5; // speed = speed +5;
	}
	
	public void brake() {
		speed -=5;
	}
	
	public String toString() {
		return brand + " " + yearModel + " is at speed: "+ speed;
	}
}