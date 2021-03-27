package level1;

import java.util.ArrayList;
import java.util.List;

public class Company {
   
	private String name;
	private List<Department> departments;

	public Company(String name) {
		super();
		this.name = name;
		departments = new ArrayList<Department>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		//System.out.println();
		for(Department d : departments) {
			System.out.println(d.getName()+" : "+d.getLocation()+"/n");
			d.print();
			System.out.println();
		}
	}
	
	public void addDepartment(Department d) {
		departments.add(d);
	}
}
