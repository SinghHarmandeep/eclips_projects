
class Plane {
	int flightNumber;
	int clockStart; // time the plane enters the runway system
	int clockStop;
	int status;// null 0, arriving 1, departing 2
	
	
	public Plane() {}
	public Plane(int fltNum, int time, int stat){
		flightNumber = fltNum;
		clockStart = time;
		status = stat;
	}
	
	public void refuse() { //?
		System.out.println(this.toString()+ " is redirected");
	}
	
	public void land(int time) {
		clockStop = time;
		System.out.println("Landing flight: " + this.flightNumber+ " Clock Start:" + clockStart+ "...");
		System.out.println("Landed flight: " + this.flightNumber+" Clock Stop: "+clockStart +" wait time: "+ (clockStop-clockStart)+" time units\n");
		
	}
	
	public void fly(int time) {
		clockStop = time;
		System.out.println("Departing flight: "+ this.flightNumber+ " Clock Start: " + clockStart+"...");
		System.out.println("Departed flight: "+ this.flightNumber+" Clock Stop: "+clockStart + " wait time: "+ (clockStop-clockStart) + " time units\n");
		
	}
	
	public int started() {
		return this.clockStart;
	}
	
	@Override
	public String toString() {
		return "Plane request Flight No:" + flightNumber + " Clock Start:" + clockStart + " Status:"+ status+ "\n";
	}
	
	
}
