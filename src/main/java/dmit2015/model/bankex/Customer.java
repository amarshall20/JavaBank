package dmit2015.model.bankex;

import java.util.UUID;

public class Customer {
	private String id = UUID.randomUUID().toString();
	private SavingAccount savingAccount;
	private CheckingAccount checkingAccount;
	
	public String getId() {
		return id;
	}
	public SavingAccount getSavingAccount() {
		return savingAccount;
	}
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}
	
	public void addSavingAccount () {
		savingAccount = new SavingAccount();
		savingAccount.owner=this;
	}
	
	public void addCheckingAccount () {
		checkingAccount = new CheckingAccount();
		checkingAccount.owner=this;
	}

}
