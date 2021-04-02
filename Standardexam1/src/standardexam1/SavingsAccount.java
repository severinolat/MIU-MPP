package standardexam1;

public class SavingsAccount extends Account {
	
	private double balance;
	private double interestRate;
	private String accId;
	
	
	public SavingsAccount( String accId, double interestRate,double balance) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
		this.accId = accId;
	}


	@Override
	public String getAccountID() {
		// TODO Auto-generated method stub
		return null;
	}


	


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	public String getAccId() {
		return accId;
	}


	public void setAccId(String accId) {
		this.accId = accId;
	}


	@Override
	public double computeUpdatedBalance() {
		// TODO Auto-generated method stub
		return balance + (interestRate * balance);
	}

	
}
