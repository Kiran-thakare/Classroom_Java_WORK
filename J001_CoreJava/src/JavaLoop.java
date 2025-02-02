/*
 * 	Looping Statement - Looping in Java allows you to execute a block of code multiple times. 
 * 
 * 	1. while loop
 * 
 * 		while(condition)
 * 		{
 * 			// statement 
 * 		}
 * 
 * 	2. do.. while loop 
 * 
 * 		do{
 * 
 * 			// statement
 * 
 * 		}while(condition);
 * 
 * 	3. for loop 
 * 
 * 		for(initialization; condition; increment/decrement)
 * 		{
 * 			// statement 
 * 		}			
 * 
 * 	4. advance for loop 
 * 
 * 		for(dataType varName : Array)
 * 		{
 * 			// statement 
 * 		}
 * 
 * 	5. for-each loop
 * 	
 * 
 * 
 */
public class JavaLoop {

	public static void main(String[] args) {

		int num = 1;
		while (num <= 10) {
			System.out.println("Number:" + num);
			num++;
		}
		do {
			System.out.println("Number:" + num);
			num++;
		} while (num <= 11);
		System.out.println("Final Number of Loop:" + num);
	}
}
