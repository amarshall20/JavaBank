package dmit2015.model.bankex;

import java.util.UUID;

import dmit2015.model.bankex.InsufficientFundsException;

public abstract class BankAccount {
	protected String AccountNo = UUID.randomUUID().toString();
	protected Customer owner;
	protected double balance;
	
	public String getAccountNo() {
		return AccountNo;
	}
	public Customer getOwner() {
		return owner;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit (double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	public abstract void withdraw (double amount) throws InsufficientFundsException;

}
