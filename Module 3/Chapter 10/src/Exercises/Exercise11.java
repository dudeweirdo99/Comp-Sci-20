package Exercises;
import java.util.*;

public class Exercise11 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int i = 0;
		ArrayList<Integer> myNums = new ArrayList<>();
		ArrayList<Integer> sortedNums = new ArrayList<>();
		int arrayLength;
		
		System.out.println("How many values should be in the array?");
		arrayLength = input.nextInt();
		
		for(i = 0; i < arrayLength; i++) {
			myNums.add(rand.nextInt((100-1)+1)+1);
		}
		
		System.out.print("Original Contents: ");
		
		for(i = 0; i < myNums.size(); i++) {
			System.out.print(myNums.get(i)+" ");
		}
		
		Collections.sort(myNums);
		sortedNums = myNums;
		
		System.out.println("");
		System.out.print("Sorted Contents: ");
		
		for(i = 0; i < sortedNums.size(); i++) {
			System.out.print(sortedNums.get(i)+" ");
		}
		
		input.close();
	}

}
