package programmeOOP.object;

public class BankAccount { // BankAccount template for Practice-It
	private String id;
	private double balance;
	private String name;
	private int transactions;
	private String transactionText;

	public BankAccount(String id) {
		this.id = id;
		balance = 0;
		transactions = 0;
		transactionText = "";
	}

	public double getBalance() {
		return balance;
	}

	public String getID() {
		return id;
	}

	public int getTransactionCount() {
		return transactions;
	}

	public String getTransactions() {
		return transactionText;
	}

	public void deposit(double amount) {
		if (0 <= amount && amount <= 500) {
			balance += amount;
			transactionText += "deposit of $" + amount + "\n";
		}
		transactions++;
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			transactionText += "withdrawal of $" + amount + "\n";
		}
		transactions++;
	}

	// public String toString() {
	// return id;
	// }

	// YOUR CODE GOES HERE

	/**
	 * BJP4 Exercise 8.11: transactionFeeBankAccount
	 * 
	 * @param a
	 * @return
	 */
	public boolean transactionFee(double a) {
		if (transactions == 0) {
			return false;
		}
		if (balance <= a) {
			balance = 0;
			return false;
		}
		// cap so nhan voi cong boi q
		double cost = transactions * (2 * a + (transactions - 1) * a) / 2;
		balance -= cost;
		if (balance < 0) {
			balance = 0;
			return false;
		} else {
			return true;
		}
	}

	/**
	 * BJP4 Exercise 8.12: toStringBankAccount
	 * 
	 * @return
	 */
	public String toString() {
		String money;
		if (balance < 0) {
			money = "-$" + Math.abs(balance);
		} else {
			money = "$" + balance;
		}
		if (money.lastIndexOf(".") == money.length() - 2) {
			money += "0";
		}
		return name + ", " + money;
	}

	/**
	 * BJP4 Exercise 8.13: transferBankAccount
	 */
	public void transfer(BankAccount other, double money) {
		if (this.balance <= 5 || money <= 0) {
			return;
		}
		this.balance -= 5;
		double tienChuyen = this.balance > money ? money : this.balance;
		this.balance -= tienChuyen;
		other.balance += tienChuyen;

		this.transactions++;
		other.transactions++;
	}

	public static void main(String[] s){
		
	}
}