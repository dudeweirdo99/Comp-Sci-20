package exercises;

import java.util.*;

public class Exercise2 {

	public static void main(String[] args) {
		
		int userNum = 0;
		int choice = 0;
		
		Scanner input = new Scanner(System.in);
		
		do{	
			System.out.println("Enter an integer: ");
			userNum = input.nextInt();
			System.out.println("show (1) Whole number.");
			System.out.println("show (2) Ones place number.");
			System.out.println("show (3) Tens place number.");
			System.out.println("show (4) Hundreds place number.");
			System.out.println("(5) Quit");
			System.out.println("Enter your choice: ");
			choice = input.nextInt();
		
			if(choice == 1) {
				System.out.println("Your whole number is: "+userNum);
			}else if(choice == 2) {
				System.out.println("The ones place for your digit is: "+userNum%10);
			}else if(choice == 3) {
				System.out.println("The tens place for your digit is: "+userNum/10%10);
			}else if(choice == 4) {
				System.out.println("The hundreds place for your digit is: "+userNum/100%10);
			}
		}while(choice!= 5);
		
		input.close();
	}
}
