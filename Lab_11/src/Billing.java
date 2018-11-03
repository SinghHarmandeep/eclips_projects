
public class Billing {
	
	private String docPatBill;
	Patient patient = new Patient();
	Doctor doc = new Doctor();
	
	public void makeBill(Patient billP, Doctor docs_bill) {
		docPatBill = ""+ billP +" _has a bill with_ Dr." +docs_bill;
	}
	
	
	
	public String toString() {
		return docPatBill;
	}

	/**
	 * @return the docPatBill
	 */
	public String getDocPatBill() {
		return docPatBill;
	}

	/**
	 * @param docPatBill the docPatBill to set
	 */
	public void setDocPatBill(String docPatBill) {
		this.docPatBill = docPatBill;
	}
	
	
}
