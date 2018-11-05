import java.util.Scanner;
import java.util.ArrayList;
public class Patient_Doctor_Billing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Billing> billHistory = new ArrayList<>();
		
		for(int x = 0; x < 2; x++) {
		Doctor doc = new Doctor();
		Patient patient = new Patient();
		Billing makebill = new Billing();
		System.out.println("Enter the info to create the bill:");
		System.out.print("Enter Doctor's name: "); //get doctor's name
		doc.setName(scan.nextLine());
		System.out.print("\nEnter " + doc.getName() + " specialty: "); //get doctor's specialty
		doc.setSpecialty(scan.nextLine());
		System.out.print("\nEnter " + doc.getName() + " fee: ");//get doctor's fee
		doc.setOfficeFee(scan.nextDouble());
		scan.nextLine();//its because we read a double and my professor told me
		
		System.out.println("\n\nNow enter the patient's info, being charged for the visit to " + doc.getName()+"."); //get patient's info with that doctor
		
		System.out.print("Enter patient's name: \n"); //patient's name
		patient.setName(scan.nextLine());

		
		System.out.print("\nEnter " + patient.getName() +"'s id: "); //patient's id
		patient.setId(scan.nextLine());
		
		makebill.makeBill(patient,doc);
		billHistory.add(makebill);
		}
		scan.close();
		System.out.println(billHistory.size());
		
		for (Billing billing : billHistory) { //print all the bills that have been created
			System.out.println(billing);
		}

		double totalBill = 0;
		for (Billing billing : billHistory) {
			totalBill = billing.doc.getOfficeFee()+totalBill;
			System.out.println("Totla bill in the system is: "+ totalBill); //outputting total bill
		}
	}

}
 