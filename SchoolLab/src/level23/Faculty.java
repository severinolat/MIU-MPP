package level23;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {

	private double salary;
	private List<Course> courses;
	
	public Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age);
		courses = new ArrayList<Course>();
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public void addCourse(Course c) {
		courses.add(c);
	}
	
	public int getTotalUnits() {
		int result =0;
		for(Course c: courses) {
			result+=c.getUnirs();
		}
		
		return result;
	}
	
	
	
}
