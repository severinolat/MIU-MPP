package standardexam1;

public class CheckingAccount extends Account {

	private double balance;
	private double monthlyFee;
	private String acctId;
	
	

	public CheckingAccount(String acctId, double monthlyFee,double balance ) {
		super();
		this.balance = balance;
		this.monthlyFee = monthlyFee;
		this.acctId = acctId;
	}



	

	public double getBalance() {
		return balance;
	}





	public void setBalance(double balance) {
		this.balance = balance;
	}





	public double getMonthlyFee() {
		return monthlyFee;
	}





	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}





	public String getAcctId() {
		return acctId;
	}





	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}





	@Override
	public double computeUpdatedBalance() {
		// TODO Auto-generated method stub
		return balance - monthlyFee;
	}





	@Override
	public String getAccountID() {
		// TODO Auto-generated method stub
		return null;
	}

}
