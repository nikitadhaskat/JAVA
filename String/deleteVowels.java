package StringMethods;

import java.util.Scanner;

public class deleteVowels {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name=sc.nextLine();
		StringBuilder s=new StringBuilder();
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch!='a'&& ch!='e' && ch!='i' && ch!='o' && ch!='u') {
				s.append(name.charAt(i));
			}
		}
		System.out.println("After removing Vowels: "+s.toString());
	}

}
