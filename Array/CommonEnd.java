package ArrayTasks;

public class CommonEnd {
	public static boolean commonEnd(int[] a,int[] b) {
		 
		if(a[a.length-1]==b[b.length-1])
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		
		System.out.println(commonEnd(new int[]{1,2,3},(new int[]{7,3})));
		System.out.println(commonEnd(new int[]{1,2,3},(new int[]{7,3,2})));
		System.out.println(commonEnd(new int[]{1,2,3},(new int[]{1,3})));

	}

}
