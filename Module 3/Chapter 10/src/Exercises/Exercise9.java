package Exercises;
import java.util.*;

public class Exercise9 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		String impSent = null;
		char tester;
		
		System.out.println("Enter Text: ");
		impSent = input.nextLine();
		impSent = impSent.toLowerCase();
		
		for(int i = 0; i < impSent.length(); i++) {
			tester = impSent.charAt(i);
			if(tester == 'a' || tester == 'e' || tester == 'i' || tester == 'o' || tester == 'u' || tester == 'y' || tester == ' ') {
				
			}else{
				count++;
			}
			System.out.println(tester);
		}
		
		System.out.println("This String contains "+count+" consonants.");
		
		input.close();
	}
}
