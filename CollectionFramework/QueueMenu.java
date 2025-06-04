package Tasks;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;

public class QueueMenu {
	    static Queue<Integer> q=new ConcurrentLinkedDeque<Integer>();

	    public static void addElement() {
           Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the number to add:");
		   int num=sc.nextInt();
		   q.add(num);
		   System.out.println("Element " +num+ " is added to the queue");
		}
	    public static void removeElement() {
	    	
	    	if(!q.isEmpty()){
	    		int removedElement=q.remove();
	    		System.out.println("Element "+removedElement+" is removed from the queue");
	    	}
	    	else {
	    		System.out.println("Queue is Empty! Cannot remove an element");
	    	}
		}
	    public static void CheckElement(){
	    	
	    	if(!q.isEmpty()) {
	    		int frontElement=q.peek();
	    		System.out.println("The front element of the queue is "+frontElement);;
	    	}
	    	else{
	    		System.out.println("Queue is empty");
	    	}
	    }
       public static void main(String[] args) {
    	   
    	 Scanner sc=new Scanner(System.in);
    	 int choice = 0;
    	 
    		 System.out.println("Queue Menu:");
    		 System.out.println("1. Add");
    		 System.out.println("2. Remove");
    		 System.out.println("3. Check");
    		 System.out.println("4. Exit");
    		 do {
    		 System.out.println("\nEnter your choice:");
    		 choice =sc.nextInt();
    		 
    		 switch(choice) {
    		 case 1:
    			 addElement();
    			 break;
    		 case 2:
    			 removeElement();
    			 break;
    		 case 3:
    			 CheckElement();
    			 break;
    		 case 4:
    			 System.out.println("Exiting Program!");
    			 break;
    		 default:
    			 System.out.println("Invalid choice! Please try again...");
    		 }
    	}
        while(choice!=4);
     }
}
