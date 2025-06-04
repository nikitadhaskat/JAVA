package Tasks;

import java.util.HashSet;
import java.util.Set;

public class CheckedFriend {
	
	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>();
		
		s.add("Neha");
		s.add("Kanya");
		s.add("Vaidehi");
		s.add("Ankita");
		
		System.out.println(s);
		
		System.out.println(s.contains("Neha"));
	}

}
