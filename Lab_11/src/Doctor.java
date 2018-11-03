
public class Doctor extends Person {
	private String specialty;
	private double officeFee;
	/**
	 * @return the officeFee
	 */
	public double getOfficeFee() {
		return officeFee;
	}
	/**
	 * @param officeFee the officeFee to set
	 */
	public void setOfficeFee(double officeFee) {
		this.officeFee = officeFee;
	}
	/**
	 * @return the specialty
	 */
	public String getSpecialty() {
		return specialty;
	}
	/**
	 * @param specialty the specialty to set
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	public String toString() {
		return super.toString() + " specialty in " + specialty + " has office bill of " + officeFee;
	}
	
}
