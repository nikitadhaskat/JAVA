package StringMethods;

import java.util.Scanner;

public class Fruit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of Fruit:");
		String fruit=sc.nextLine();
		if(fruit.contains("p")||fruit.contains("k")) {
			System.out.println("It is a Valid Fruit");
		}
		else {
			System.out.println("It is Invalid Fruit");
		}
	}

}
