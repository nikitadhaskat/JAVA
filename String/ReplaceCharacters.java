package StringMethods;

import java.util.Scanner;

public class ReplaceCharacters {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your unsername:");
		String username =sc.nextLine();
		String result="";
		for(int i=0;i<username.length();i++) {
			char ch=username.charAt(i);
			if(Character.isAlphabetic(ch)) {
				result=result+"X";
			}
			else if(Character.isDigit(ch)) {
				result=result+"*";
			}
			else {
				result=result+" ";
			}
		}
		System.out.println(result);
	}

}
