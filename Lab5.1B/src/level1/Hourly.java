package level1;


public class Hourly extends Employee{
	
	private double hourlyWage;
	private int hourPerWeek;
	
	
	
	public Hourly(int empId, double hourlyWage, int hourPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hourPerWeek = hourPerWeek;
	}



	@Override
	public double calcGrossPay() {
		// TODO Auto-generated method stub
		double grossPay = hourlyWage * hourPerWeek;
		return grossPay;
	}
	

}
