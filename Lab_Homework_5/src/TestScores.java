
public class TestScores {

	int[] allScores;
	
	public TestScores(int[] scores) { 
		allScores = scores;
		for(int i = 0; i < allScores.length; i++) {
			
			try { 
			if(allScores[i]<0 || allScores[i]>100) 	//condition to throw exception				
				throw new InvalidTestScore("No negative or more than 100: " + scores[i] + " at " + (i+1));
			}
			
			catch (InvalidTestScore e) { //catching the exception in the constructor
				System.out.println(e);
				scores[i]=0;
				}
		}
	}
	
	public int average() {
		int total=0;
		for(int i=0; i < allScores.length; i++) 
			total += allScores[i];
		return total/allScores.length;
		
	}
}
