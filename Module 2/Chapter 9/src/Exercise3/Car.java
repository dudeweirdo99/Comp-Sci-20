package Exercise3;

public class Car extends Vehicle {

	public Car(int year, String name, boolean runs, boolean gas, boolean hybrid) {
		super(year, name, runs, gas, hybrid);
	}

	public boolean exhaustFiltered(boolean filtered) {
		if(getYear()<2002) {
			filtered = false;
		}
		return(filtered);
	}
}
