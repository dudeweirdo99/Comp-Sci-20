package Exercise2;

public class PersonalAcct extends Account {

	public PersonalAcct(double bal, String fName, String lName, String str, String city, String st, String zip) {
		super(bal, fName, lName, str, city, st, zip);
		
	}
	
	public double minBal(double bal) {
		if(bal<100) {
			int neg = 2;
			return neg;
		}else{
			return 0;
		}
	}
}
