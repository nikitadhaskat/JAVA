package Tasks;

import java.util.TreeMap;

public class StudentInfo {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,Student> map=new TreeMap<Integer,Student>();
		Student s1=new Student("Nikita","Pune", 23, 8379941337l, 5.5f);
		Student s2=new Student("Gunjan","Mumbai", 22, 9856412357l, 5.0f);
		Student s3=new Student("Bansi","Amravati", 24, 7541236589l, 5.8f);
		Student s4=new Student("Prathmesh","Mumbai", 24, 9852943371l, 5.7f);
		Student s5=new Student("Tejas","Pune", 26, 8123654785l, 6.1f);
		
		map.put(1,s1);
		map.put(2,s2);
		map.put(3,s3);
		map.put(4,s4);
		map.put(5,s5);
		
		System.out.println("Name of students who lives outside of pune:");
	    for(Student i:map.values()) {
	    	if(!i.address.equals("Pune")) 
	    		System.out.println(i.name);
	    }
	    System.out.println("\nPhone No of students with their address and age:");
	    for(Student i:map.values()) {
	    	System.out.println("Name= "+i.name);
	        System.out.println("Address ="+i.address);
	        System.out.println("Age ="+i.age);
	     }
	    System.out.println("\nAddress of all students:");
	    for(Student i:map.values()) {
	    	System.out.println(i.address);
	    }
	    System.out.println("\nAge of students who are taller than 6ft:");
	    for(Student i:map.values()) {
	    	if(i.height>6)
	    		System.out.println(i.age);
	    }
	    System.out.println("\nHeight of students who are between 20 to 25 yrs of age:");
	    for(Student i:map.values()) {
	    	if(i.age>=20 && i.age<=25)
	    		System.out.println(i.height);
        }
    }
}
