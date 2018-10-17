
public class CruiseShip extends Ship {
	int maxPassengers;

	/**
	 * 
	 * @param name
	 * @param year
	 * @param x = Passenger Capacity
	 */
	public CruiseShip(String name, String year, int x) {
		super(name, year);
		this.maxPassengers=x;
	}
	public int getMaxPassenger() {
		return this.maxPassengers;
	}
	public void setMaxPassenger(int x) {
		this.maxPassengers = x;
	}
	public String toString() {
		return "Name: "+ name +" Maximum Passengers: "+ maxPassengers;
	}
}
