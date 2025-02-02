/*
 * Q12.Write a Java program to display the system time. 
 */

import java.time.Clock;
import java.time.LocalDateTime;

public class Q12 {

	public static void main(String[] args) {
      
		System.out.println("display the system time:" + Clock.systemUTC().instant());
	}
}
