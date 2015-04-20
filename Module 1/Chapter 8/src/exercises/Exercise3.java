package exercises;

import java.util.*;

public class Exercise3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numHam;
		int numSal;
		int numFri;
		int numPop;
		double orderTotal;
		
		System.out.print("Enter number of hamburgers: ");
		numHam = input.nextInt();
		System.out.println("Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber.");
		System.out.print("Enter number of salads: ");
		numSal = input.nextInt();
		System.out.println("Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber.");
		System.out.print("Enter number of fries: ");
		numFri = input.nextInt();
		System.out.println("French fries have 11.0g of fat, 36.0g of carbs, and 4.0 of fiber.");
		System.out.print("Enter number of Pops: ");
		numPop = input.nextInt();
		System.out.println("Each pop has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber.");
		
		orderTotal = (numHam*1.85+(numSal*2)+(numFri*1.3)+(numPop*0.95));
		
		System.out.println("Your order comes to: $"+orderTotal);
		
		input.close();
	}
}
