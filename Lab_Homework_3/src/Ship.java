
public class Ship {
	String name;
	String year;
	
	/**
	 * 
	 * @param name = name of the ship
	 * @param year = year it was made
	 */
	public Ship(String name, String year){this.name = name; setYear(year);}
	public String getName() {return name;}
	public String getYear() {return year;}
	public void setName(String x) {name = x;}
	public void setYear(String x) {year = x;}
	public String toString() {
		return "Name: "+name +" Year made in: "+ year;
	}
}