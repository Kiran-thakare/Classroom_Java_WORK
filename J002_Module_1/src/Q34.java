/*
 *  I3. Write a program which will ask the user to enter his/her 
marks (out of 100). Define a method that will display grades according to the marks 
entered as below: 
Marks Grade 
 91-100 A 
 81-90 B 
 71-80 B 
 61-70 C 
 51-60 D 
41-50 DD
 */

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter his/her marks (out of 100) :");
		int marks = sc.nextInt();

		String Grade = getMarks(marks);

		System.out.println("Student Marks Grade:" + Grade);
	}

	public static String getMarks(int marks) {

		if (marks >= 91 && marks <= 100) {
			return "A";
		} else if (marks >= 81 && marks <= 90) {
			return "B";
		} else if (marks >= 71 && marks <= 80) {
			return "B";
		} else if (marks >= 61 && marks <= 70) {
			return "C";
		} else if (marks >= 51 && marks <= 60) {
			return "D";
		} else if (marks >= 41 && marks <= 50) {
			return "DD";
		} else {
			return "Fail";
		}
	}
}
