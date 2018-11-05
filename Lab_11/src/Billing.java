
public class Billing {
	
	private String docPatBill;
	Patient patient = new Patient(); //local objects are null
	Doctor doc = new Doctor(); //local objects are null
	
	public void makeBill(Patient billP, Doctor docs_bill) {
		patient = billP; //initializing the local objects 
		doc = docs_bill; //initializing the local objects
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
