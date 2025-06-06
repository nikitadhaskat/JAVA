package Tasks;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ATserialize {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream f=new FileOutputStream("F:\\Nikita.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		
		Animal a=new Animal("Tiger","Wild");
		Tree t=new Tree("AppleTree");
		
		o.writeObject(a);
		o.writeObject(t);

		System.out.println("Animal Object serialized");
		System.out.println("Tree Object serialized");

	}

}
