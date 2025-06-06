package Tasks;

import java.io.Serializable;

public class Animal implements Serializable {
	
	public String name;
	public String type;
	
	public Animal(String name,String type) {
		this.name=name;
		this.type=type;
		
	}

}
