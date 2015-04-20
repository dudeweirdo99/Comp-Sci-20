package Project;

public class Tester {
	
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(1000, "Sally Jones");
		myAccount.deposit(505.22);
		System.out.println(myAccount);
		myAccount.withdraw(100);
		System.out.println(myAccount);
	}

}
