package Project;

public class Tester {
	
	public static void main(String args) {
		Automobile myCar = new Automobile(24);
		myCar.fillUp(20);
		myCar.takeTrip(100);
		double fuel_left = myCar.reportFuel();
		System.out.println(fuel_left);
	}

}
