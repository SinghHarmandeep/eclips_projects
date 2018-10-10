public class CarDemo {

	public static void main(String[] args) {
		Car newcar = new Car(2018,"Porsche");
		System.out.println("Your current speed: "+ newcar.getSpeed());
		for(int x = 0; x <5; x++) {
			newcar.accelerate();
			System.out.println("Your current speed: "+ newcar.getSpeed());
		}
		System.out.println("Your speed when you press the brake padel");
		for(int x = 0; x <5; x++) {
			newcar.brake();
			System.out.println("Your current speed: " + newcar.getSpeed());
		}
	}

}