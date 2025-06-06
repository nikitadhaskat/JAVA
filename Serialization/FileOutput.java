package Tasks;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileOutput {
	
	public static void main(String[] args) throws IOException  {
		
		FileOutputStream f=new FileOutputStream("F:\\Nikita.txt");
		
		try (ObjectOutputStream o = new ObjectOutputStream(f)) {
			Bird b=new Bird("Peacock","Multicolor");
			Bird b1=new Bird("Parrot","Green");
			Bird b2=new Bird("Sparrow","Grey");

			o.writeObject(b);
			o.writeObject(b1);
			o.writeObject(b2);
			System.out.println("Object Serialized!");

		}
		catch(IOException e) {
			e.printStackTrace();
		}
				
    }
}
