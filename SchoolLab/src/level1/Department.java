package level1;


import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private static List<Person> persons;
	
	
	public Department(String name) {
		super();
		persons = new ArrayList<Person>();
		this.name = name;
	}

    

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getTotalSalary() {
		
		double result = 0;
		for(Person p : persons) {
			if(p instanceof Faculty ) {
				result+= ((Faculty) p).getSalary();
			}
			if(p instanceof Staff) {
				result += ((Staff) p).getSalary();
			}
			
		}
		return result;
	}
	
   public double getTotalSalary2() {
		
		double result = 0;
		for(Person p : persons) {
			result+= p.getSalary();
			
		}
		return result;
	}
	
	public static void showAllMembers() {
		for(Person p : persons) {
			System.out.println(p.getName()+" "+p.getPhone()+" "+p.getAge()+" "+p.getClass().getSimpleName());
		}
		
	}
	
	public void unitsPerFaculty() {
		for(Person p : persons) {
			if(p instanceof Faculty) {
				System.out.println(p.getName()+" "+((Faculty) p).getTotalUnits());
			}
		}
	}

	public void addPerson(Person p) {
		// TODO Auto-generated method stub
		persons.add(p);
		
		
	}

	public void addFaculty(Person f) {
		// TODO Auto-generated method stub
		persons.add(f);
		
	}

	public void addStudent(Person s) {
		// TODO Auto-generated method stub
		persons.add(s);
		
	}
	
	public void addStaff(Person staff) {
		persons.add(staff);
	}
	
}
