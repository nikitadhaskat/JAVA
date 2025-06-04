package Practicetasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintTable {
	
	public static void main(String[] args) {
		
		Scanner	sc=new Scanner(System.in);
		try {
			System.out.println("Enter a number");
            int num=sc.nextInt();
            for(int i=1;i<=10;i++) {
            	int result=num*i;
            	System.out.println(result);
            }
            int square=num*num;
            int cube=num*num*num;
            System.out.println("Square of "+num+" = "+square);
            System.out.println("Square of "+num+" = "+cube);
        }
            catch(InputMismatchException e) {
            	System.out.println("Invalid Input!Please enter valid input...");
            }
		    sc.close();
		}
	}
