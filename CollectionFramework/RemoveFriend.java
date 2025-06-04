package Tasks;

import java.util.HashSet;
import java.util.Set;

public class RemoveFriend {
	
	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>();
		
		s.add("Aniket");
		s.add("Nikita");
		s.add("Gunjan");
		
		s.remove("Aniket");
		
		System.out.println(s);
	}

}
