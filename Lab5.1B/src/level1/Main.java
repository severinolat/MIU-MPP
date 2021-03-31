package level1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		Employee e1 = new Hourly(1,11.23,40);
		Employee e2 = new Salaried(2,15.34);
		Employee e3 = new Commissioned(3,1200);
		
		List<Order> orders = new ArrayList<Order>();
		Order o1 = new Order(1,LocalDateTime.of(2021, 3, 1, 0, 0),2345.53);
		Order o2 = new Order(1,LocalDateTime.of(2021, 3, 14, 0, 0),245.53);
		Order o3 = new Order(1,LocalDateTime.of(2021, 3, 21, 0, 0),345.53);
		
		((Commissioned) e3).addOrder(o1);
		((Commissioned) e3).addOrder(o2);
		((Commissioned) e3).addOrder(o3);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		for(Employee e: employees) {
			Paycheck pc = e.calcCompensation(3, 2021);
			System.out.printf("Employee id = %s Netpay = $%,.2f \n",e.getEmpId(),pc.getNetPay());
			//System.out.println(e.getEmpId()+" "+pc.getNetPay());
			
		}
		
	}
}
