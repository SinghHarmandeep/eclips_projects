import java.util.Scanner;
public class Patient_Doctor_Billing {

	public static void main(String[] args) {
		Doctor doc = new Doctor();
		Patient patient = new Patient();
		Billing makebill = new Billing();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the info to create the bill:");
		System.out.print("Enter Doctor's name: "); //get doctor's name
		doc.setName(scan.nextLine());
		System.out.print("\nEnter " + doc.getName() + " specialty: "); //get doctor's specialty
		scan.reset();
		doc.setSpecialty(scan.nextLine());
		System.out.print("\nEnter " + doc.getName() + " fee: ");//get doctor's fee
		doc.setOfficeFee(scan.nextDouble());
		
		System.out.println("\n\nNow enter the patient's info, being charged for the visit to " + doc.getName()+"."); //get patient's info with that doctor
		
		System.out.print("Enter patient's name:");//patient's name
		patient.setName(scan.nextLine());
		
		System.out.print("\nEnter " + patient.getName() +"'s id: "); //patient's id
		patient.setId(scan.nextLine());
		
		makebill.makeBill(patient,doc);
		
		System.out.println("\n"+makebill);
		scan.close();
	}

}
 