package level1;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public abstract class Employee {

	private int empId;
	
	public Employee(int empId) {
		this.empId = empId;
	}
	
	
	
	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public void print() {
		
	};
	
	 public Paycheck calcCompensation(int month, int year) {
			
			double grossPay = calcGrossPay();
			double fica = (grossPay * 23)/100;
			double state = (grossPay * 5)/100;
			double local = (grossPay * 1)/100;
			double medicare = (grossPay * 3)/100;
			double socialSecurity = (grossPay * 7.5)/100;
			
			Calendar calendar = Calendar.getInstance();
	        calendar.add(Calendar.MONTH, 0);
	        calendar.set(year, month, 1);
	        Date firstDay = calendar.getTime();
	        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
	        Date lastDay = calendar.getTime();
	        LocalDateTime monthFirstDay = DateRange.convertToLocalDateTimeViaInstant(firstDay);
	        LocalDateTime monthLastDay = DateRange.convertToLocalDateTimeViaInstant(lastDay);
			DateRange dateRange = new DateRange(monthFirstDay,monthLastDay);
			Paycheck paycheck = new Paycheck(grossPay,fica,state,local,medicare,socialSecurity,dateRange);
			return paycheck;
			
		}
	
	public abstract double calcGrossPay();
}
