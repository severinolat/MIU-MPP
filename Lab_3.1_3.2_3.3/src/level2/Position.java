package level2;

import java.util.ArrayList;
import java.util.List;

public class Position {
	
	private String title;
	private String description;
	private List<Employee> employees;
	
	public Position(String title, String description) {
		super();
		this.title = title;
		this.description = description;
		employees = new ArrayList<Employee>();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void addEmployee(Employee e) {
		employees.add(e);
	}
	
	public void print() {
		for (Employee e: employees) {
			e.print();
		}
	}
	
	public double  getSalary() {
		double result = 0;
		for(Employee e : employees) {
			result += e.getSalary();
		}
		return result;
		
	}
	
	

}
