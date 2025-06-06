package Tasks;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class SerializeOfAll {
		
		public static void main(String[] args) throws Exception {
			
			FileOutputStream f=new FileOutputStream("F://Nikita.txt");
			
			ObjectOutputStream o=new ObjectOutputStream(f);
			
			Bird b=new Bird("Peacock","Multicolor");
			Animal a=new Animal("Tiger","Wild");
			Tree t=new Tree("AppleTree");
			
			System.out.println("Serialized all of above objects!");
		}

}



