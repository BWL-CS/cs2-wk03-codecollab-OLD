public class BankAccount {

	// INSTANCE VARIABLES
	private String clientName;
	private double balance;

	// CONSTRUCTORS
	public BankAccount() {
		clientName = "None";
		balance = 0.00;
	}

	public BankAccount(double initialBalance) {
		clientName = "None";
		balance = initialBalance;
	}

	public BankAccount(String initialName, double initialBalance) {
		clientName = initialName;
		balance = initialBalance;
	}

	// METHODS
	public String getClientName() {
		return clientName;
	}

	public double getBalance() {
		return balance;
	}

	public void setClientName(String newName) {
		clientName = newName;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}
}
