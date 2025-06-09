package StringCLasses;

import java.util.Scanner;

public class lengthOfString {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		String str=sc.nextLine();
		StringBuilder s=new StringBuilder();
		int length=str.length();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			char encryptChar=(char) (ch+length);
			s.append(encryptChar);
			}
		System.out.println("Encrypted String: "+s.toString());
	}

}
