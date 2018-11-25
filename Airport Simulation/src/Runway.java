import java.util.ArrayList;

class Runway {
	
	int idleTime;
	int refused;
	int tLandWait = 0;
	int tDepartWait = 0;
	final int landLimit; //the limit of landing list
	ArrayList<Plane> landing = new ArrayList<>();
	ArrayList<Plane> takeoff = new ArrayList<>();
	
	public Runway(int limit) {
		this.landLimit = limit;
	}
	
	public boolean canLand(Plane current) {
		if(landing.size()<landLimit && current.status == 1) {
			return true;
		}
		else {
			System.out.println(landing.size());
			current.refuse();
			refused++;
			return false;
		}
	}
	
	public void addPlane(Plane current) {
		 //No need for checking if the plane can land itself
			landing.add(current);
			System.out.println("\n"+current);
		
	}
	
	/**
	 * @param current  adding to 
	 */
	public void addTakeOff(Plane current) {
		takeoff.add(current);
		System.out.println("\n"+current);

	}
	/**
	 * @param time  tracked for landing
	 */
	public void activityLand(int time) {
		if(landing.size()==0) {
			System.out.println(landing.size()+" planes to Land.");
		}
		else {
			landing.get(0).land(time);//landing 1st plane in list
			tLandWait += (time - landing.get(0).clockStart);
			landing.remove(0);
		}
	}
	
	
	/**
	 * @param time  tracked for takeoff
	 */
	public void activityTakeoff(int time) {
		if(takeoff.size() == 0) {
			System.out.println( takeoff.size()+" planes to takeoff.");
		}
		else {
			takeoff.get(0).fly(time); //flying 1st plane in list
			tDepartWait += (time - takeoff.get(0).clockStart);
			takeoff.remove(0);
		}
	}
	
	/**
	 * @param time  tracked for idle time
	 */
	public void runIdle(int time) {
		if(landing.isEmpty() && takeoff.isEmpty()) {
			System.out.println("The runway is idle at iteration: "+ time);
			idleTime++;
		}
	}

	
	
}




