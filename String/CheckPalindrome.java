package StringCLasses;

import java.util.Scanner;

public class CheckPalindrome {

	+
	public static void main(String[] args) {
		
		int num = 0,rev=0,copy=num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		num=sc.nextInt();
		while(num!=0)
		{
		  rev=rev*10+(num%10);
		  num=num/10;
		}
		if(copy==num)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
		
		
	}
}
