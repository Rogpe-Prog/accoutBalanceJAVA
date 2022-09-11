package entities;

public class Account {
	
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public Account() {
	}
	
	public Account(int accountNumber, String accountHolder, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		addBalance(accountBalance);
	}

	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}	
	

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {//para mudar o nome do Holder
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	
	public void addBalance(double balance) {// deposit
		accountBalance += balance;
	}
	
	public void withdrawBalance(double withdrawValue) {
		accountBalance -= withdrawValue + 5.00;
	}

	@Override
	public String toString() {
		
		return "Account data: \n"
			   + "Account " + accountNumber
			   + ", "
			   + "Holder: " + accountHolder
			   + ", "
			   + "Balance: $ " + String.format("%.2f", accountBalance);
	}
	
	
	
	

}
