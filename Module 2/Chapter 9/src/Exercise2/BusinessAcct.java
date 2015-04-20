package Exercise2;

public class BusinessAcct extends Account {

	public BusinessAcct(double bal, String fName, String lName, String str, String city, String st, String zip) {
		super(bal, fName, lName, str, city, st, zip);
	}
	
	public double minBal(double bal) {
		if(bal<500) {
			int neg = 10;
			return neg;
		}else{
			return 0;
		}
	}
}
