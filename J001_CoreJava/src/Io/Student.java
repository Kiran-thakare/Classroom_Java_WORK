package Io;

import java.io.Serializable;

public class Student implements Serializable {
      private int roll;
      private String name;
      private String Course;
      
	public Student(int roll, String name, String course) {
	
		this.roll = roll;
		this.name = name;
		this.Course = course;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}
    
}
