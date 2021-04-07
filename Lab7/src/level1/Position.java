package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
	
	
	@Override
	public boolean equals(Object position) {
		if(position == null)return false;
		if(!(position instanceof Position)) return false;
		Position p = (Position) position;
		return
			title.equals(p.title) &&
			description.equals(p.description) &&
			employees.equals(p.employees);
		
	}

	
	
	public String toString() {
		return "Title "+title+" Description "+description+ " Employees "+employees;
	}
	
	public int hashCode() {
		return Objects.hash(title,description,employees);
	}

}
