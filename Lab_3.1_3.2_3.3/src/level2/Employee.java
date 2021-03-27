package level2;


public class Employee {

	private int employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String birthDate;
	private String ssn;
	private double salary;
	
	
	
	public Employee(int employeeId, String firstName, String middleInitial, String lastName, String birthDate,
			String ssn, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getFirdtName() {
		return firstName;
	}


	public void setFirdtName(String firdtName) {
		this.firstName = firdtName;
	}


	public String getMiddleInitial() {
		return middleInitial;
	}


	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

   
	public void print() {
		System.out.println("Employee [employeeId=" + employeeId + ", firdtName=" + firstName + ", middleInitial=" + middleInitial
				+ ", lastName=" + lastName + ", birthDate=" + birthDate + ", ssn=" + ssn + ", salary=" + salary + "]");
	}


	
	
	
}
