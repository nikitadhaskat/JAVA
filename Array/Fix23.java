package ArrayTasks;

public class Fix23 {
	
	public static int[] fix23(int a[]) {
		 
		for(int i=0;i<a.length;i++) {
			if(a[i]==2 && a[i+1]==3) {
				a[i+1]=0;
			}
		}
		return a;
	  }
	public static void main(String[] args) {
		 
		int[] array1=fix23(new int[] {1,2,3});
		int[] array2=fix23(new int[] {2,3,5});
		int[] array3=fix23(new int[] {1,2,1});
		
		System.out.println(java.util.Arrays.toString(array1));
		System.out.println(java.util.Arrays.toString(array2));
		System.out.println(java.util.Arrays.toString(array3));
   }

}
