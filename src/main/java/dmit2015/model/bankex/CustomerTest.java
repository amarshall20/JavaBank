package dmit2015.model.bankex;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testGetId() throws InsufficientFundsException {
		Bank theBank = Bank.getInstance();
		Customer customer1 = new Customer();
		customer1.addSavingAccount();
		theBank.AddCustomer(customer1);
		theBank.AddAccount(customer1.getSavingAccount());
		customer1.getSavingAccount().deposit(100);
		customer1.getSavingAccount().withdraw(100);
		assertEquals(0,customer1.getSavingAccount().getBalance(),0);
		
		customer1.addCheckingAccount();
		theBank.AddAccount(customer1.getCheckingAccount());
		customer1.getCheckingAccount().deposit(100);
		customer1.getCheckingAccount().withdraw(100);
		assertEquals(0,customer1.getCheckingAccount().getBalance(),0);
		assertEquals(0,customer1.getSavingAccount().getBalance(),0);
		
	}

}
