package StringMethods;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Password:");
		String password=sc.nextLine();
		
		int noOfDigit=0,noOfSymbols=0;
		for(int i=0;i<password.length();i++) 
		{
			char ch=password.charAt(i);
			
			if(Character.isDigit(ch)) 
			{
				noOfDigit++;
			}
			else if(!Character.isLetterOrDigit(ch))
			{
				noOfSymbols++;
			}
		}
        if(password.length()>8||password.length()<12) 
		{
			if(noOfDigit>=2 && noOfSymbols >=1)
			{
			    System.out.println("Password is Valid");
		    }
		    else
		    {
		     	System.out.println("Password is Invalid");
			}
		}
	}
}
