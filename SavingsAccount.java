/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer 
 * Due: 04/05/2023
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Harlene Kaur
 */

public class SavingsAccount extends BankAccount{
	public final double RATE = .025; // constant interest rate
	public int savingsNumber = 0; // account number for each saving account
	public String accountNumber; // the account number for this savings account


	// constructor to create a new savings account
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber()+"-"+savingsNumber; 
	}

	// constructor to create a new savings account from an old account
	public SavingsAccount(SavingsAccount oldAccount, int amount) {
		super(oldAccount, amount);
		savingsNumber++;
		accountNumber = super.getAccountNumber()+"-"+savingsNumber; 
	}

	// method to add interest to the account
	public void postInterest() {
		super.deposit((RATE*super.getBalance())/12);	
	}

	// getter method for accountNumber
	public String getAccountNumber() {
		return accountNumber;
	}
}
