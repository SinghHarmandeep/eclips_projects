
public class problem2 {
	
	// Use comand "javac name of the file including . and the type. for example for this file "javac problem2.java":
	// then comand "java problem (without the .java) and pass in what ever with seperating with space.
	public static void main(String[] args) {
		
		for(int x = 0; x <args.length; x++) { // this would output everything entered in the comand line.
			int xa = Integer.parseInt(args[x]);
			System.out.println(xa);
		}
}

}
