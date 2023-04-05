/*
 * Class: CheckingAccount
 * Extends: BankAccount
 * Description: This class represents a checking account that extends the BankAccount class. It has a static
constant FEE of 0.15 and overrides the withdraw method of BankAccount to include this fee.
 *Author: Harlene Kaur
 *Due Date: 04/05/2023
 *Honor Code: I pledge that I have completed the programming
assignment independently. I have not copied the code
from a student or any source. I have not given my code
to any student.
 */

public class CheckingAccount extends BankAccount {

	// static constant fee for withdrawing money from checking account
	static double FEE = 0.15;

	// constructor for checking account with name and initial balance
	public CheckingAccount (String name, double amount) {
		super(name, amount);

		// modify account number to indicate checking account
		super.setAccountNumber(super.getAccountNumber()+"-10"); 
	}

	// overridden withdraw method to include the fee
	public boolean withdraw(double amount) {
		return super.withdraw(amount+FEE);		
	}
}
