package collection;

import java.util.ArrayList;

class Employee{
	 private int id;
	 private String name;
	 private String department;
	public Employee(int id, String name, String department) {
	
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	
	 
	 
}

public class ArrayListPractical {
     public static void main(String[] args) {
		
//    	 Employee e1=new Employee(121, "Akshay", "It");
    	 
    	 ArrayList<Employee> emp=new ArrayList<Employee>();
    	 emp.add(new Employee(123, "Parag", "It"));
    	 emp.add(new Employee(124, "Sau", "It"));
    	 emp.add(new Employee(125, "Ram", "It"));
    	 
    	 for(Employee e:emp) {
    		 System.out.println("Id :"+e.getId());
    		// System.out.println("Name:"+e.getName());
    		 //System.out.println("Department:"+e.getDepartment());
    	 }
    	 
    	 
    	 
	}
}
