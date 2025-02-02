/*
 *  Write a Java program of swap two elements in an array list. 
 */

import java.util.ArrayList;
import java.util.Collections;

public class Q65 {
  
	public static void main(String[] args) {

		ArrayList<Integer> num1 = new ArrayList<Integer>();

		num1.add(22);
		num1.add(44);
		num1.add(66);
		num1.add(88);
		num1.add(11);
		num1.add(99);
		
		System.out.println("Before Swap:"+num1);
		
		Collections.swap(num1, 4, 0);
		
		for(int i=0;i<num1.size();i++) {
			System.out.println("Index "+i+" :"+num1.get(i));
		}
	}
}
