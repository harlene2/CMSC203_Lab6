
public class SavingsAccount extends BankAccount{
	public final double RATE = .025;
	public int savingsNumber = 0;
	public String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber()+"-"+savingsNumber; 
	}
	
	public SavingsAccount(SavingsAccount oldAccount, int amount) {
		super(oldAccount, amount);
		savingsNumber++;
		accountNumber = super.getAccountNumber()+"-"+savingsNumber; 
	}
	
	public void postInterest() {
		super.deposit((RATE*super.getBalance())/12);	
	}

	public String getAccountNumber() {
		return accountNumber;
	}

}