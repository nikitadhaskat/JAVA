package ArrayTasks;

import java.util.Scanner;

public class MockTask {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string:");
		String name=sc.next();
		
		System.out.println(name.charAt(0));
		System.out.println(name.substring(1, 3));
		System.out.println(name.substring(3));
	}

}
