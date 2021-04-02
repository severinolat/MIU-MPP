package standardexam1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private List<Account> accounts;
	
	public Employee(String name) {
		this.name = name;
		accounts = new ArrayList<Account>();
	}

	public double computeUpdatedBalanceSum() {
		//implement
		double result =0;
		for(Account ac: accounts) {
			result+= ac.getBalance();
		}
		return result;
	}
	
	public void addAccount(Account a) {
		accounts.add(a);
	}
}
