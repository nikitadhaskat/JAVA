package Tasks;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationOfAll {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream f=new FileInputStream("F://Nikita.txt");
		
		ObjectInputStream o=new ObjectInputStream(f);
		
		Bird b=(Bird) o.readObject();
		Animal a=(Animal) o.readObject();
		Tree t=(Tree) o.readObject();
		
		System.out.println(b.name+"is"+b.color);
		System.out.println(a.name+"is"+a.type);
		System.out.println(t.Tname);

		
	}

}
