package dmit2015.model.bankex;

public class CheckingAccount extends BankAccount {

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		} else {
			if (owner.getSavingAccount() != null) {
				double overAmount = amount - balance;
				
				if (owner.getSavingAccount().getBalance() >= overAmount) {
					owner.getSavingAccount().withdraw(overAmount);
					deposit(overAmount);
					balance -= amount;
				} else {
					throw new InsufficientFundsException("Insufficient funds.");
				}
				
			} else {
				throw new InsufficientFundsException("Insufficient funds and do not have a savings account.");
			}
		}

	}

}
