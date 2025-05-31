package ArrayTasks;

public class Has12 {
	
	public static boolean has12(int a[]) {
		boolean IfYes=false;

		for(int b:a) {
			if(b==1) 
				IfYes=true;
		     if(b==2 && IfYes)
		        return true;
		  }
		return false;
        }
	public static void main(String[] args) {
		
		System.out.println(has12(new int[] {1,3,2}));
		System.out.println(has12(new int[] {3,1,2}));
		System.out.println(has12(new int[] {3,1,4,5,2}));
		System.out.println(has12(new int[] {1,4,5}));
   } 
}
