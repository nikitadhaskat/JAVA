package ArrayTasks;

import java.util.Stack;

public class Demo {
	public static void main(String[] args) {
		
	      Stack<Integer> s=new Stack<Integer>();
	        //push
	        s.push(10);
	        s.push(20);
	        s.push(30);
	        s.push(40);
	        System.out.println("Pushed element:"+s);

	        //pop
	        System.out.println("Popped element:"+s.pop());
	        
	        //peek
	        System.out.println("Peeked element:"+s.peek());
	        
	        //isEmpty
	        System.out.println(s.isEmpty());
	        
	        //contains
	        System.out.println(s.contains(10));
	        
	        //remove
	        System.out.println(s.remove(2));
	        
	        //size
	        System.out.println("Size of element:"+s.size());
	  } 

}


