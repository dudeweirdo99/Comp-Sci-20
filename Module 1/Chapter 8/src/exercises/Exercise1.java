package exercises;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		
		System.out.println("1. Show total in bank.");
		System.out.println("2. Add a penny.");
		System.out.println("3. Add a nickel.");
		System.out.println("4. Add a dime.");
		System.out.println("5. Add a quarter.");
		System.out.println("6. Take money out of bank.");
		System.out.println("Enter 0 to quit.");
		System.out.println("Enter your choice: ");
		
		Scanner input = new Scanner(System.in);
		
		double money;
		money = 0;
		int choice = 10;
		
		while(choice != 0) {
			choice = input.nextInt();
			
			switch(choice) {
				
			case 1: System.out.println("$"+money);break;
			case 2: money = money + 0.01;System.out.println("$"+money);break;
			case 3: money = money + 0.05;System.out.println("$"+money);break;
			case 4: money = money + 0.1;System.out.println("$"+money);break;
			case 5: money = money + 0.25;System.out.println("$"+money);break;
			case 6: money = 0;System.out.println("$"+money);break;
			}
		}
		
		input.close();
	}
}