package StringCLasses;

import java.util.Scanner;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		String str=sc.nextLine();
		StringBuilder s=new StringBuilder(str);
		String reversedString=s.reverse().toString();
		
        if(str.equals(reversedString)){
        	System.out.println("It is a palindrome");
        }
        else {
        	System.out.println("It is not a palindrome");
        }
	}

}
