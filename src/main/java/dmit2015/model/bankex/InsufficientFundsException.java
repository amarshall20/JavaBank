package dmit2015.model.bankex;

@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
		super(message);
	}

}
