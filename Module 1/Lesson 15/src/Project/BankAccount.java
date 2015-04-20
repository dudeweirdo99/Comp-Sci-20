package Project;

public class BankAccount {
	
	private double balance;
	private String name;
	
	public BankAccount(double balance, String name) {
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if((balance-amount)>0) {
			balance -= amount;
		}
	}
	
	public String toString() {
		return "The "+name+" account balance is, $"+balance;
	}
}
