package lesson42;
import java.util.*;

public class Tester {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<BankAccount> aryLst = new ArrayList<BankAccount>();
		String name;
		double balance;
		boolean exit = false;
		double maxBal = 0;
		String maxName = "";
		
		do{
			System.out.println("Please enter the name to whom the account belongs. (\"Exit\" to abort) ");
			name = input.next();
			
			if(name.equalsIgnoreCase("EXIT")) {
				exit = true;
			}else{
				System.out.println("Please enter the amount of the deposit. ");
				balance = input.nextDouble();
				BankAccount bnkact = new BankAccount(name, balance);
				aryLst.add(bnkact);
			}			
		}while(exit != true);
		
		for(int i = 0; i < aryLst.size(); i++) {
			BankAccount ba = aryLst.get(i);
			double bBal = ba.balance;
			String bName = ba.name;
			if(bBal > maxBal) {
				maxBal = bBal;
				maxName = bName;
			}
		}
		
		System.out.println("The Bank Account with the largest Sum of money is: "+maxName+"'s");
		System.out.println("The amount is: $"+maxBal);
		
		input.close();
	}
}
