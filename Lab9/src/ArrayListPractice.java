import java.util.ArrayList;

/**
 * 
 * @author manusingh
 *		Just practicing ArrayList
 *		<p>to help myself understand it better
 */
public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList<String> countries = new ArrayList<>();
		countries.add("Uranium"); //adding data
		countries.add("Venus");
		countries.add("Mercury");
		System.out.println(countries.size()); //getting size
		countries.add(1, "sddsf");//adding at a specific location
		System.out.println(countries);
		System.out.println(countries.size());
		countries.set(3, "eat it");
		System.out.println(countries);
		countries.add("Uranium");
		System.out.println(countries.size());
		System.out.println(countries.get(3));
		System.out.println(countries.contains("Venus")); //checks if the pramater is in the list
		System.out.println(countries.lastIndexOf("Uranium")); //checks for the last occurance of the object passed
		
		for (String dl : countries) {
			System.out.print(dl + " ");
		}
	}
}
