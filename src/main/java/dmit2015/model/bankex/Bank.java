package dmit2015.model.bankex;

import java.util.HashMap;
import java.util.Map;

public class Bank {
	
	private Bank() {
		
	}
	
	private static final Bank INSTANCE = new Bank();
	
	public static Bank getInstance() {
		return INSTANCE;
	}
	
	private Map<String, Customer> customers = new HashMap<>();
	private Map<String, BankAccount> accounts = new HashMap<>();

	public Map<String, Customer> getCustomers() {
		return customers;
	}
	public Map<String, BankAccount> getAccounts() {
		return accounts;
	}
	
	public void AddCustomer(Customer newCustomer) {
		customers.put(newCustomer.getId(), newCustomer);
	}
	
	public void AddAccount(BankAccount newAccount) {
		accounts.put(newAccount.getAccountNo(), newAccount);
	}

}
