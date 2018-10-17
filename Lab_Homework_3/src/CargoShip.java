
public class CargoShip extends Ship {
	int tonnage;
	/**
	 * 
	 * @param name
	 * @param year
	 * @param cap = max weight capacity
	 */
	public CargoShip(String name, String year, int cap) {
		super(name, year);
		this.tonnage = cap;
	}
	public void setTonnage(int x) {
		tonnage = x;
	}
	public int getTonnage() {
		return tonnage;
	}
	
	public String toString() {
		return "Name: "+ name+" Weight Capacity: "+ tonnage;
	}
}
