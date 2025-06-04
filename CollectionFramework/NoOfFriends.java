package Tasks;
import java.util.Set;
import java.util.TreeSet;
public class NoOfFriends {
	
		public static void main(String[] args) {
		
		Set<String> s=new TreeSet<String>();
		
		s.add("Nikita");
		s.add("Ayush");
		s.add("Gunjan");
		s.add("Bansi");
		s.add("Pratiksha");
		s.add("Chandra");
		s.add("Gayatri");
		s.add("Arpita");
		s.add("Prajakta");
		s.add("Tejas");
		s.add("Patya");
		s.add("Pravin");
        System.out.println(s);
		System.out.println("Guys 2.0 = "+s.size());
	}
}
