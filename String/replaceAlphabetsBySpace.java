package StringMethods;

import java.util.Scanner;

public class replaceAlphabetsBySpace {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Username:");
		String username=sc.nextLine();
		StringBuilder s=new StringBuilder();
		for(int i=0;i<username.length();i++) {
			
			char ch=username.charAt(i);
			if(Character.isAlphabetic(ch)) {
				s.append(ch);
			}
			else {
				s.append(' ');
			}
		}
		System.out.println("After replacing the character by white space="+s.toString());
    }
}
