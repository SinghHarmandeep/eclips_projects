package lab3;

import javax.swing.JOptionPane;
public class problem2 {
	public static void main(String[] arg) {
		
		String[] words = {"dawn","dusk","morning","evening","park","meet","at","flowers","sun","noon"};
		
		String input = JOptionPane.showInputDialog("Enter a String");
		
		for(int i = 0; i < words.length; i++) {
			if(input.equals(words[i])) {
				JOptionPane.showMessageDialog(null, "Their is a match at " + i+ ".");
			}
		}
		

	}
}
