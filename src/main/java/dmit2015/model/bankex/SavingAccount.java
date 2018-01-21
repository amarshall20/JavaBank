package dmit2015.model.bankex;

import dmit2015.model.bankex.InsufficientFundsException;

public class SavingAccount extends BankAccount {

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount > 0) {
			balance -= amount;
		}

	}

}
