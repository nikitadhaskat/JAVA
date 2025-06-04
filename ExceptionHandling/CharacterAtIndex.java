package Practicetasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CharacterAtIndex {
	 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter your name:");
			String name=sc.nextLine();
		    System.out.println("Enter the index number:");
		    int index=sc.nextInt();
		    
		    if(index<0||index>=name.length()) {
		    	System.out.println("Index out of bound! Please enter valid index...");
		    }
		    else {
		    	System.out.println(name.charAt(index));
		    }
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input! Please enter a valid index...");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Index is out of bound for this name...");
		}
		catch(Exception e)
		{
			System.out.println("An error occured:"+e.getMessage());
		}
		finally
		{
			System.out.println("Finally Block");
		}
	}

}
