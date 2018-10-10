
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
	
	Employee(String x, int idn, String d, String p, double passa){
		this.setName(x);
		this.setIdNumber(idn);
		this.setDepartment(d);
		this.setPosition(p);
		this.setSalary(passa);
	};
	
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

	//The following methods are changing methods. (I know it's recursive but it's for the sake of organizing)
	public void changeName(String nam) {
		setName(nam);
	}
	public void changeIdNumber(int id) {
		setIdNumber(id);
	}
	public void changeDepartment(String dept) {
		setDepartment(dept);
	}
	public void changePosition(String post) {
		setPosition(post);
	}
	public void changeSalary(double money) {
		setSalary(money);
	}

	public String toString() {
		return String.format("%1$-20s"+"%2$-20s"+"%3$-20s"+"%4$-20s"+"%5$-20s", name, idNumber,department,position,salary);
		// this is formating the output so that each value has 20 spaces to display the value;
	}
}
