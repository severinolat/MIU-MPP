package level1;


public class Student extends Person {

	private double gpa;
	
	public Student(String name, String phone, int age, double gpa) {
		super(name, phone, age);
		this.gpa = gpa;
		// TODO Auto-generated constructor stub
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public double getSalary() {
		return 0;
	}
	
	
}
