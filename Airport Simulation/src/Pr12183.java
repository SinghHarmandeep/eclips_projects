import java.util.Scanner;
/**
 * 
 * @author Harmandeep Singh
 *<p> put all the code in this class
 */

public class Pr12183 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int endTime; //time iterations
		double arrivalRate, departureRate; //rates of departure and landing
		int arvPlane, leavePlane, landingSize; //no of arriving planes, departing planes and the cap of Runway
		int tArivingReq = 0; //total number of planes arriving
		int tAcceptedReq = 0;
		int tLandedReq = 0;
		int tDepartReq = 0;
		int tDepartedReq = 0;
		
		System.out.println("Enter the landing capacity of the Runway (Keep it small): ");
		landingSize = scan.nextInt();
		
		System.out.println("Enter the End Time (prefered at least 1000, but it works at lower time too): ");
		endTime = scan.nextInt();
		
		Runway runway = new Runway(landingSize);// instantiating the runway
		Plane plane; //planes
		
		do {
			System.out.println("Enter Arrival Rate(No more then a 1): ");
			arrivalRate = scan.nextDouble();
			System.out.println("Enter Departure Rate(No more then a 1): ");
			departureRate = scan.nextDouble();
		} while ((arrivalRate+departureRate)>1); //if the sum of arrival and departure is greater than 1
		scan.close();
		System.out.println("\n#### State 1 = arriving 2 = departuring ####\n");
		
		
	
		for (int i = 0; i < endTime; i++) {
			arvPlane = poisson(arrivalRate); // generating number of arriving Planes
			leavePlane = poisson(departureRate);// generating number of departing Planes
			tArivingReq += arvPlane;
			
			for (int j = 0; j < arvPlane; j++) { // arriving planes and runway
				plane = new Plane(i+100+j+5, i, 1);
				if (runway.canLand(plane)) {
					runway.addPlane(plane);
					tAcceptedReq++;
				} 

				
			}
			
			for (int k = 0; k < leavePlane; k++) { // departing planes and runway
				plane = new Plane(i+200+k+5, i, 2);
				runway.addTakeOff(plane);
				tDepartReq++;
			}
			
			
			if (!(runway.landing.isEmpty())) { //if planes landing
				runway.activityLand(i);
				tLandedReq++;
			}
			else if(!(runway.takeoff.isEmpty())) { //if no planes landing and planes taking off
				runway.activityTakeoff(i);
				tDepartedReq++;
			}
			else {
				runway.runIdle(i);
			}
			System.out.println("Landing requests left: "+runway.landing.size()); //
			System.out.println("Departing requests left: "+ runway.takeoff.size());
			
			
		}
		
		
		System.out.print("\n### The following are the statistics ###");
		System.out.println("\nTotal idle time of runway: "+ runway.idleTime);
		System.out.println("Total number of planes redirected to Disney World: "+ runway.refused);
		System.out.println("Total number of planes requested landing: " + tArivingReq);
		System.out.println("Total number of planes accepted for landing: "+ tAcceptedReq);
		System.out.println("Total number of planes landed(planes served): "+ tLandedReq);

		System.out.println("Average rate of planes wanting to land per unit time: " + tAcceptedReq +"/" + endTime );
		System.out.println("Average rate of planes wanting to depart per unit time: " + tDepartReq + "/"+ endTime);
		System.out.println("Average time a plane spent in landing line: " +((double)runway.tLandWait/(double)tLandedReq) +" units");
		System.out.println("Average time a plane spent in departing line: "+ ((double)runway.tDepartWait/(double)tDepartedReq) +" units");

	
		
	}
	
	/**
	 * @param rate
	 * @return number of planes
	 */
	public static int poisson(double rate) { 
		double limit = Math.exp(-rate);
		double product = Math.random();
		int planeCount = 0;
		while (product > limit) {
			planeCount++;
			product *= Math.random();
		}
		return planeCount;
	}
	
	

}
