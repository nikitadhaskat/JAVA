package ArrayTasks;

import java.util.Scanner;

public class CarMain {
	
	public static void main(String[] args) {
	
	Car[] c=new Car[5];
	
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<c.length;i++) 
	{
		c[i]=new Car();
		
		System.out.println("Enter a name of car:");
		c[i].name=sc.nextLine();
		
		System.out.println("Enter a color of car:");
		c[i].color=sc.nextLine();
     }
	 System.out.println("\nCar Names:");
	 for(int i=0;i<c.length;i++) 
	 {
		 System.out.println(c[i].name);
	 }
   }
}
