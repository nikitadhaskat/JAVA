package Tasks;

import java.util.ArrayList;

public class EmployeeInfo {

	public static void main(String[] args) {
  
		ArrayList<Employee> list=new ArrayList<Employee>();
	    
		list.add(new Employee(1,"Nikita","Pune",23, "Female","Nikita@gmail.com","Developer","1 year", 45000));
		list.add(new Employee(2, "Gunjan","Pune", 22,"Female","Gunjan@gmail.com","Tester","Fresher",50000));
		list.add(new Employee(3,"Bansi","Amravati",24,"Male","Bansi@gmail.com","Manager","Fresher", 60000));
        list.add(new Employee(4,"Prathmesh","Amravati",24,"Male","Prathmesh@gmail.com","Developer","2 year",40000));
		list.add(new Employee(5,"Arpita","Amravati",23,"Female","Arpita@gmail.com","Tester","Fresher", 45000));
		list.add(new Employee(6,"Tejas","Pune", 25,"Male","Tejas@gmail.com","Developer","2.5 year", 65000));
		list.add(new Employee(7,"Ayush","Pune", 24,"Male","Ayush@gmail.com","Manager","1 year", 55000));
		list.add(new Employee(8,"Chandra","Pune", 25,"Male","Chandra@gmail.com","Tester","Fresher", 55000));
		list.add(new Employee(9,"Pratiksha","Mumbai", 23,"Female","Pratiksha@gmail.com","Manager","Fresher", 50000));
		list.add(new Employee(10,"Gayatri","Amravati", 24,"Female","Gayatri@gmail.com","Developer","1.5 year", 60000));

		System.out.println("List of Employees outside of pune:");
        for(Employee i:list) {
			if(!i.address.equals("Pune")) 
				System.out.println(i.name);
			}
        System.out.println("\nEmail of all fresher with their salary and designation:");
		for(Employee i:list) {
			if(i.exp.equals("Fresher")) {
				System.out.println(i.email);
			    System.out.println(i.salary);
			    System.out.println(i.designation);
			}
		}
		System.out.println("\nAddress of all male employees:");
		for(Employee i:list) {
			if(i.gender.equals("Male"))
					System.out.println(i.name+"="+i.address);
		}
		System.out.println("\nAge of all developers:");
		for(Employee i:list) {
			if(i.designation.equals("Developer"))
				System.out.println(i.name+"="+i.age);
		}
		System.out.println("\nSalary of all female testers:");
		for(Employee i:list) {
			if(i.designation.equals("Tester"))
				System.out.println(i.name+"="+i.salary);
		}
    }
}
	


