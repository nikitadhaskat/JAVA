package StringCLasses;

import java.util.Scanner;

public class makeTwoStrings {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		String str=sc.nextLine();
		StringBuilder s1=new StringBuilder();
		StringBuilder s2=new StringBuilder();

		for(int i=0;i<str.length();i++) {
         if(i%2==0) {
        	 s1.append(str.charAt(i));
         }
         else {
        	 s2.append(str.charAt(i));
         }
       }
        System.out.println("Even String:"+s1.toString());
        System.out.println("Odd string:"+s2.toString());
        sc.close();
    }
}
