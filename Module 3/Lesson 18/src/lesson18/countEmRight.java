package lesson18;

import java.util.*;

public class countEmRight {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean exit = false;
		
		do{
			System.out.println("Input a sentance: (exit, to stop)");
			
			String sentance = "";
			int spLength = 0;
			
			sentance = input.nextLine();
			
			if(sentance.equalsIgnoreCase("EXIT")) {
				exit = true;
				System.out.println("Exiting...");
			}else{
				exit = false;
				
				sentance = sentance + " harmless";
				sentance = sentance.replaceAll("\\s+", "");
				sentance = sentance.toUpperCase();		
				
				String sp[] = sentance.split("SA");
				
				spLength = sp.length -1;
				
				System.out.println("There are "+spLength+" orrcurrences");
			}
			
		}while(exit == false);
		
		input.close();
	}
}