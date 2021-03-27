package level1;


public class Staff extends Person{

	private double salary;
	
	public Staff(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;		// TODO Auto-generated constructor stub
	}
	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
