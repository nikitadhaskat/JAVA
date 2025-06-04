package Tasks;

import java.util.HashSet;
import java.util.Set;

public class ClearFriend {
	
	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>();
		
		s.add("Nikita");
		s.add("Ayush");
		s.add("Bansi");
		s.add("Gunjan");
		
		s.clear();
		System.out.println(s);
		
	}

}
