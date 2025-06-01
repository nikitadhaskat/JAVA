package StringMethods;

import java.util.Scanner;

public class UsernameReport {
	public static void main(String[] args) {
		
		int noOfAlphabets=0,noOfVowels=0,noOfConsonants=0,noOfDigits=0,noOfSymbols=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your username:");
		String username=sc.nextLine();
		String vowels="aeiouAEIOU";
		for(int i=0;i<username.length();i++)
		{
			char ch=username.charAt(i);
			if(Character.isAlphabetic(ch)) {
				noOfAlphabets++;
			    if(vowels.indexOf(ch)!=-1){
				   noOfVowels++;
			    }
			    else{
				   noOfConsonants++;
			    }
			}
			    else if(Character.isDigit(ch)) {
				   noOfDigits++;
			    }
			    else {
				   noOfSymbols++;
			    }
		}
		
        System.out.println("No of Alphabets="+noOfAlphabets);
		System.out.println("No of Consonants="+noOfConsonants);
		System.out.println("No of Vowels="+noOfVowels);
		System.out.println("No of Digits="+noOfDigits);
		System.out.println("No of Symbols="+noOfSymbols);

	}
}
