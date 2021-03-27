package level23;

import java.util.ArrayList;
import java.util.List;

public class StaffStudent extends Staff {
	
	private List<Student> students;
	
	public StaffStudent(String name, String phone, int age, double salary) {
		super(name, phone, age, salary);
		// TODO Auto-generated constructor stub
		students = new ArrayList<Student>();
	}

	
	
}
