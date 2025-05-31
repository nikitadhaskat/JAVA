package ArrayTasks;

import java.util.Scanner;

public class firstLastElement {
	
	public static boolean firstLast6(int number[]) {
		
		if(number[0]==6||number[number.length-1]==6) 
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter array element:");
		int number=(int) sc.nextInt();*/
		System.out.println(firstLast6(new int[] {1,2,6}));
		System.out.println(firstLast6(new int[] {6,1,2,3}));
		System.out.println(firstLast6(new int[] {13,6,1,2,3}));

	}
}
