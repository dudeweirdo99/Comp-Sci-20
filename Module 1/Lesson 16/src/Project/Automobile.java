package Project;

public class Automobile {
	
	public double mpg;
	public double gallons;

	public Automobile(double m) {
		double mpg = m;
		double gallons = 0;
	}
	
	public void fillUp(double f) {
		gallons += f;
	}
	
	public void takeTrip(double t) {
		gallons -= t/mpg;
	}
	
	public double reportFuel() {
		double r = gallons;
		return r;
	}
}
