package standardexam1;

import java.util.List;

public class Admin {
	
	
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double resultats = 0;
		for(Employee e : list) {
			resultats+= e.computeUpdatedBalanceSum();
		}
		return resultats;
	}
}
