package StringMethods;

import java.util.Scanner;

public class OTP {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 6-digit OTP:");
        String otp=sc.nextLine();
        StringBuilder s=new StringBuilder(otp);
        
        if(otp.length()==6 && otp.matches("\\d{6}"))
        {
        	s.setLength(3);
        	System.out.println(s.toString());
        }
        else {
        	System.out.println("Invalid OTP! Please enter a 6-digit OTP...");
        }
	}
  
}
