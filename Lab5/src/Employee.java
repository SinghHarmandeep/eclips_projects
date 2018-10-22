	/**
	 * 
	 * @param x is the first parameter (String)
	 * @param idn is the second (integer)
	 * @param d is third (String)
	 * @param p is fourth (String)
	 * @param passa fifth (double)
	 */

public class Employee {
	private String name;
	private int idNumber;
	private String department;
	private String position;
	private double salary;

	
	//The following is the default constructor (Just to save time i'm initializing the values in the constructor)
	
	public Employee(String x, int idn, String d, String p, double passa){
		this.setName(x);
		this.setIdNumber(idn);
		this.setDepartment(d);
		this.setPosition(p);
		this.setSalary(passa);
	}
	
	public Employee(String nam, int id){
	name = nam;
	idNumber = id;
	department = position = "";
	salary = 0;
	}
	
	public Employee(String nam, int id, double passa) {
		name = nam;
		idNumber = id;
		salary = passa;
		department = position = "";
	}
	
	public Employee() {
		name = department = position = null;
		idNumber = 0;
		salary = 0;
	}
	
	//The following methods are setting methods
	public void setName(String nam) {
		if(nam.isEmpty()) {
			System.out.println("You didnt't enter a name");
		}
		else {
			name = nam;
		}
	}
	public void setIdNumber(int id) {
		if(id<0) {
			System.out.println("Your entered id is a negative number");
		}
		else {
			idNumber = id;
		}
	}
	public void setDepartment(String dept) {
		if(dept.isEmpty()) {
			System.out.println("You didn't enter a department");
		}
		else {
			department = dept;
		}
	}
	public void setPosition(String post) {
		if(post.isEmpty()) {
			System.out.println("You didn't enter a position");
		}
		else {
			position = post;
		}
	}
	public void setSalary(double money) {
		if(money<0) {
			System.out.println("Your entered Salary is a negative number");
		}
		else {
			salary = money;
		}
	}
	
	//The following methods are accessing methods
	public String getName() {
		return name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public String getDepartment() {
		return department;
	}
	public String getPosition() {
		return position;
	}
	public double getSalary() {
		return salary;
	}
	
	public boolean equals(Employee obj2) {
		return (idNumber == obj2.idNumber);
	}

	public String toString() {
		return String.format("%1$-20s"+"%2$-20s"+"%3$-20s"+"%4$-20s"+"%5$-20s", name, idNumber,department,position,salary);
		// this is formating the output so that each value has 20 spaces to display the value;
	}
}
