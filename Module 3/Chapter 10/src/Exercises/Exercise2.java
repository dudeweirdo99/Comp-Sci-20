package Exercises;

public class Exercise2 {

	public static void main(String[] args) {
		
		int index;
		int genNum;
		int genNums[] = new int[101];
		
		for(int i = 0; i < 101; i++) {
			
			index = i;
			
			genNum = ((index / 10) + (index%10)) + index;
			
			genNums[i] = genNum;
		}
		
		System.out.println("Index\tGenerated Number");
		
		for(int i = 0; i < 101; i++) {
			System.out.println(i+"\t\t"+genNums[i]);
		}
	}
}
