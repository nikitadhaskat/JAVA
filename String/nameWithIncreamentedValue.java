package StringMethods;

import java.util.Scanner;

public class nameWithIncreamentedValue {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you name:");
		String name=sc.nextLine();
		
		StringBuilder s=new StringBuilder();
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			char increValue=(char) (ch+1);
			s.append(increValue);
		}
	  
	    System.out.println(s.toString());
    }
}
