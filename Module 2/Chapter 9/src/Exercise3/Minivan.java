package Exercise3;

public class Minivan extends Vehicle {

	public Minivan(int year, String name, boolean runs, boolean gas, boolean hybrid) {
		super(year, name, runs, gas, hybrid);
	}

	public boolean fuelEfficient(boolean fuelEff) {
		if(getHybrid()) {
			fuelEff = true;
		}
		return(fuelEff);
	}
}
