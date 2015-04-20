package Exercise3;

public class Truck extends Vehicle {

	public Truck(int year, String name, boolean runs, boolean gas, boolean hybrid) {
		super(year, name, runs, gas, hybrid);
	}

	public boolean fourWheelKit(boolean fourByFour) {
		if(getYear()>1995) {
			fourByFour = true;
		}
		return(fourByFour);
	}
}
