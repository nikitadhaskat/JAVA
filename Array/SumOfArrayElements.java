package ArrayTasks;

public class SumOfArrayElements {
	
	public static int sum3(int a[]) {
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
	public static void main(String[] args) {

		System.out.println("Sum of array= "+sum3(new int[] {1,2,3}));
		System.out.println("Sum of array= "+sum3(new int[] {5,11,2}));
		System.out.println("Sum of array= "+sum3(new int[] {7,0,0}));
   }
}
