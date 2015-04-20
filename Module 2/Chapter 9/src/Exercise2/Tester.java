package Exercise2;

public class Tester {
	
	public static void main(String[] args) {
		PersonalAcct persAcct = new PersonalAcct(100, "Branden", "Brooks", "Regency Dr.", "Sherwood Park", "Alberta", "T8A5R9");
		BusinessAcct busAcct = new BusinessAcct(500, "Branden", "Brooks", "Regency Dr.", "Sherwood Park", "Alberta", "T8A5R9");
		
		persAcct.withdrawal(50);
		busAcct.withdrawal(50);
		
		persAcct.withdrawal(persAcct.minBal(persAcct.getBalance()));
		busAcct.withdrawal(busAcct.minBal(busAcct.getBalance()));
		
		System.out.println("Personal Account: $"+persAcct.getBalance());
		System.out.println("Business Account: $"+busAcct.getBalance());
	}
}