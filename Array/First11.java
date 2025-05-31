package ArrayTasks;

import java.util.ArrayList;

public class First11 {
	
	public static ArrayList<Integer> first11(int a[],int b[]) {
		
		ArrayList<Integer> result=new ArrayList<>();
		if(a.length>0)
			result.add(a[0]);
		if(b.length>0)
			result.add(b[0]);
		return result;
		}
	public static void main(String[] args) {
		
		System.out.println(first11(new int[] {1,2,3},new int[] {7,9,8}));
		System.out.println(first11(new int[] {1,2,},new int[] {2,7}));
		System.out.println(first11(new int[] {1,4},new int[] {}));

	}

}
