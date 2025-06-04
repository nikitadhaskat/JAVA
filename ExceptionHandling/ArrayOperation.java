package Practicetasks;

import java.util.Scanner;

public class ArrayOperation {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num[]=new int[10];
		
		try {
			System.out.println("Enter 10 numbers:");
			for(int i=0;i<num.length;i++)
			{
				//System.out.println("Enter number:")
				num[i]=sc.nextInt();
			}
			System.out.println("Enter index a:");
			int a=sc.nextInt();
			System.out.println("Enter index b:");
			int b=sc.nextInt();
			int result=num[a]/num[b];
			System.out.println("Result of num[a]/num[b]= "+result);
		}
		catch(ArithmeticException e) {
			System.out.println("Error Occurred:Division is not allowed by zero...");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error Occurred:Please enter valid index between 0 to 9...");
		}
		catch(Exception e) {
			System.out.println("An unexpected error occured"+e.getMessage());
		}
		finally {
			System.out.println("Finally Block Executed....");
		}
	}

}
