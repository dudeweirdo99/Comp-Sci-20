package exercises;

import java.util.*;

public class Exercise8 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int answer;
		int playerAns;
		int score = 0;
		
		Scanner input = new Scanner(System.in);
		
		do{
			num1 = 1+(int)(Math.random()*20);
			num2 = 1+(int)(Math.random()*20);
			answer = num1 + num2;
			
			System.out.println("Math Game(enter 999 to end game)");
			System.out.print(num1+" + "+num2+" = ");
			playerAns = input.nextInt();
			if(playerAns == answer) {
				System.out.println("Correct Answer.");
				score++;
			}else if(playerAns == 999){
				System.out.println("Your Score is: "+score);
			}else{
				System.out.println("Wrong answer, try again.");
			}
		}while(playerAns != 999);
		
		input.close();
	}
}
