import java.time.Year;
public class EmployeeDemo {

	public static void main(String[] args) {				
		Employee worker1 = new Employee("Hline Susan Mayers",47899,"Accouting","Vice Precident",500000);
		Employee worker2 = new Employee("Mark Jones",39119,"IT","Programmer",250000);
		Employee worker3 = new Employee("Joy Rogers",81774,"Manufacturing","Engineer",350000);
				
		System.out.printf("%1$-20s"+"%2$-20s"+"%3$-20s"+"%4$-20s"+"%5$-20s\n","Name","ID Number","Department","Position","Salary $");
		System.out.println(worker1.toString());
		System.out.println(worker2.toString());
		System.out.println(worker3.toString());
	}
}