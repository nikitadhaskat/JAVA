package StringMethods;

import java.util.Scanner;

public class DomainName {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your EmailId:");
		String emailId=sc.nextLine();
		
		String domain=emailId.split("@")[1].split("\\.")[0];	
		
		System.out.println("Domain Name="+domain);
	}

}
