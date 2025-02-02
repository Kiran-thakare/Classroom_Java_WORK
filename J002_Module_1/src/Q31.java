/*
 * We have to calculate the percentage of marks obtained in three subjects (each out of 
100) by student A and in four subjects (each out of 100) by student B. Create an 
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two 
other classes 'A' and 'B' each having a method with the same name which returns the 
percentage of the students. The constructor of student A takes the marks in three 
subjects as its parameters and the marks in four subjects as its parameters for student 
B. Create an object for each of the two classes and print the percentage of marks for 
both the students.

*/

abstract class Marks{
	 
	abstract double getPercentage();
}

class StudentA extends Marks{
	
	int computerScience;
	int rubyAndRails;
	int python;
		
	

	public StudentA(int computerScience, int rubyAndRails, int python) {
		this.computerScience = computerScience;
		this.rubyAndRails = rubyAndRails;
		this.python = python;
		
	}



	@Override
	double getPercentage() {
		double total=computerScience+rubyAndRails+python;
		return (total/3.0);
	}


	
}

class StudentB extends Marks{
	
	int computerScience;
	int rubyAndRails;
	int python;
	int java;
		
	

	public StudentB(int computerScience, int rubyAndRails, int python, int java) {
		this.computerScience = computerScience;
		this.rubyAndRails = rubyAndRails;
		this.python = python;
		this.java=java;
		
	}

	@Override
	double getPercentage() {
		double total=computerScience+rubyAndRails+python+java;
		return (total/4.0);
	}
	
	
	
}
public class Q31 {
   
	public static void main(String[] args) {
		
		StudentA s1=new StudentA(45, 56, 70);
		
		
		StudentB s2=new StudentB(35, 56, 65, 70);
		
		
		System.out.println("Percentage of marks for student A: " + s1.getPercentage() + "%");
        System.out.println("Percentage of marks for student B: " + s2.getPercentage() + "%");
		
		
	}
}
