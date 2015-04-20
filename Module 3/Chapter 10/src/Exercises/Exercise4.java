package Exercises;
import java.util.*;

public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean exit = false;
		int userNum;
		int numSum = 0;
		int average;
		int max;
		int min;
		int range;
		int count = 0;
		ArrayList<Integer> oneLst = new ArrayList<>();
		ArrayList<Integer> twoLst = new ArrayList<>();
		ArrayList<Integer> threeLst = new ArrayList<>();
		ArrayList<Integer> fourLst = new ArrayList<>();
		ArrayList<Integer> fiveLst = new ArrayList<>();
		ArrayList<Integer> sixLst = new ArrayList<>();
		ArrayList<Integer> sevenLst = new ArrayList<>();
		ArrayList<Integer> eightLst = new ArrayList<>();
		ArrayList<Integer> nineLst = new ArrayList<>();
		ArrayList<Integer> tenLst = new ArrayList<>();
		
		do{
			System.out.println("Enter a numer between 1 and 50(999 to quit)");
			userNum = input.nextInt();
			
			if(userNum != 999) {
				if(userNum>1 && userNum<6) {
					oneLst.add(userNum);
					numSum += userNum;
				}else if(userNum>5 && userNum<11) {
					twoLst.add(userNum);
					numSum += userNum;
				}else if(userNum>10 && userNum<16) {
					threeLst.add(userNum);
					numSum += userNum;
				}else if(userNum>15 && userNum<21) {
					fourLst.add(userNum);
					numSum += userNum;
				}else if(userNum>20 && userNum<26) {
					fiveLst.add(userNum);
					numSum += userNum;
				}else if(userNum>25 && userNum<31) {
					sixLst.add(userNum);
					numSum += userNum;
				}else if(userNum>30 && userNum<36) {
					sevenLst.add(userNum);
					numSum += userNum;
				}else if(userNum>35 && userNum<41) {
					eightLst.add(userNum);
					numSum += userNum;
				}else if(userNum>40 && userNum<46) {
					nineLst.add(userNum);
					numSum += userNum;
				}else {
					tenLst.add(userNum);
					numSum += userNum;
				}
			}else{
				exit = true;
			}
			count++;
		}while(exit == false);
		
		average = numSum/count;
		max = Collections.max(tenLst);
		min = Collections.min(oneLst);
		range = max - min;
		
		System.out.println("Average: "+average);
		System.out.println("Max: "+max);
		System.out.println("Range: "+range);
		System.out.print("1 - 5: ");
		stars(oneLst.size());
		System.out.println("");
		System.out.print("6 - 10: ");
		stars(twoLst.size());
		System.out.println("");
		System.out.print("1 - 15: ");
		stars(threeLst.size());
		System.out.println("");
		System.out.print("16 - 20: ");
		stars(fourLst.size());
		System.out.println("");
		System.out.print("21 - 25: ");
		stars(fiveLst.size());
		System.out.println("");
		System.out.print("26 - 30: ");
		stars(sixLst.size());
		System.out.println("");
		System.out.print("31 - 35: ");
		stars(sevenLst.size());
		System.out.println("");
		System.out.print("36 - 40: ");
		stars(eightLst.size());
		System.out.println("");
		System.out.print("41 - 45: ");
		stars(nineLst.size());
		System.out.println("");
		System.out.print("46 - 50: ");
		stars(tenLst.size());
		System.out.println("");
		
		input.close();
	}
	
	public static void stars(int amount) {
		for(int i = 0; i < amount; i++) {
			System.out.print("*");
		}
	}
	
}
