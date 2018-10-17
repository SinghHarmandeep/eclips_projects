public class DemoClass {

	public static void main(String[] args) {
		Ship[] shipArray = new Ship[3];
		Ship ship = new Ship("Black", "2020");
		Ship cShip = new CruiseShip("gmail", "2010", 200);
		Ship cargoShip  = new CargoShip("White", "2000",3000);
		
		shipArray[0]=ship;
		shipArray[1]=cShip;
		shipArray[2]=cargoShip;
		
		int x = 0;
		while(x < shipArray.length) {
		System.out.println(shipArray[x].toString());
		System.out.println("\n");
		x++;
		}
	}

}
