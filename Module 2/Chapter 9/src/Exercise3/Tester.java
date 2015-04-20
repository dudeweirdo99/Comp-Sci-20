package Exercise3;

import java.util.*;

public class Tester {
	
	public static void main(String[] args) {
		
		Car car = new Car(2000, "Camery", true, true, false);
		Truck truck = new Truck(1990, "Tacoma", false, true, false);
		Minivan mvan = new Minivan(2015, "Highlander", true, false, true);
		
		String userInterest;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to know about the Car(c), Truck(t) or the Minivan(m)");
		userInterest = input.nextLine();
		
		if(userInterest.equalsIgnoreCase("c")) {
			
			if(car.getRuns()) {System.out.println("This Car Runs");}
			System.out.println("Year: "+car.getYear());
			System.out.println("Name: "+car.getName());
			if(car.getGas()) {System.out.println("This Car Runs On Gas");}
			if(car.getHybrid()) {System.out.println("This Car Runs On Electricity");}
		}else if(userInterest.equalsIgnoreCase("t")) {
			
			if(truck.getRuns()) {System.out.println("This Truck Runs");}else{System.out.println("This Truck Does Not Run");}
			System.out.println("Year: "+truck.getYear());
			System.out.println("Name: "+truck.getName());
			if(truck.getGas()) {System.out.println("This Truck Runs On Gas");}
			if(truck.getHybrid()) {System.out.println("This Truck Runs On Electricity");}
		}else if(userInterest.equalsIgnoreCase("m")) {
			
			if(mvan.getRuns()) {System.out.println("This Minivan Runs");}
			System.out.println("Year: "+mvan.getYear());
			System.out.println("Name: "+mvan.getName());
			if(mvan.getGas()) {System.out.println("This Minivan Runs On Gas");}
			if(mvan.getHybrid()) {System.out.println("This Minivan Runs On Electricity");}
		}
		input.close();
	}
}
