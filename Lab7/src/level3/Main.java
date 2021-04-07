package level3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	private static List<Company> companies = new ArrayList<Company>();

	public static void main(String[] args) {
		Position p1 = new Position("Teacher","Teach courses");
		Position p2 = new Position("Superviser","Supervise students");
		Position p3 = new Position("Headmister","Admin school");
		Position p4 = new Position("CSTech","Assistance in IT");
		Position p5 = new Position("Maintainer","Cleaning");
		Position p8 = new Position("Maintainer","Cleaning");
		Position p6 = new Position("Nurse","Health care");
		Position p7 = new Position("Nurse","Health care");
		
		Employee e1 = new Employee(1,"John","Mike","Doe","10/21/1964","234-32-4567",2500);
		Employee e2 = new Employee(1,"Peter","Mike","Doe","10/21/1964","234-32-4567",2500);
		Employee e3 = new Employee(1,"Peter","Mike","Doe","10/21/1964","234-32-4567",2500);
		
		p5.addEmployee(e1);
		p5.addEmployee(e2);
		
		p8.addEmployee(e1);
		p8.addEmployee(e2);
		
		Department d1 = new Department("Compro","East Av");
		Department d2 = new Department("MBA","West Av");
		Department d3 = new Department("MBA","West Av");
		
		d1.addPosition(p1);
		d1.addPosition(p2);
		d1.addPosition(p3);
		
		d2.addPosition(p4);
		d2.addPosition(p5);
		d2.addPosition(p6);
		
		d3.addPosition(p4);
		d3.addPosition(p5);
		d3.addPosition(p6);
		
		
		
		Company miu = new Company("Maharishi International University");
		miu.addDepartment(d1);
		miu.addDepartment(d2);
		
		
		companies.add(miu);
		
		System.out.println(p1.hashCode());
		System.out.println(p7.hashCode());
		
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		System.out.println(e1);
		System.out.println(p5);
		System.out.println(d1);
		
		System.out.println(d2.equals(d3));
		
		System.out.println(p5.equals(p8));
		
		System.out.println(e2.equals(e3));
		System.out.println(e1.equals(e3));
	
		
		print();
	}
	
	public static void print() {
		for(Company c: companies) {
			System.out.println(c.getName());
			System.out.println();
			c.print();
		}
	}
}
