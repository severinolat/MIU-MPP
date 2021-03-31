package level1;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
	
	private double commission;
	private double baseSalary;
	List<Order> orders;
	
	public Commissioned(int empId, double baseSalary) {
		super(empId);
		commission = 7;
		this.baseSalary = baseSalary;
		orders = new ArrayList<Order>();
	}

	@Override
	public double calcGrossPay() {
		double totalValue =0;
		double bonus =0;
		for(Order o: orders) {
			totalValue+= o.getOrderAmount();
		}
		
		bonus = (totalValue * commission)/100;
		return baseSalary+bonus;
	}
	
	public void addOrder(Order o) {
		orders.add(o);
	}
	
	

}
