import java.util.Scanner;

public class JavaConditionalOperator {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number : ");
		int num = sc.nextInt();

		// System.out.println("num = "+num);

	/*	int result = -1;
		
		if(num>=0) {
			result = 1;
		}else {
			result = 0;
		}
	*/
		
		int result = (num>=0) ? 1 : 0;
		
		switch (result) {
		case 1:
			// positive or zero
			if (num == 0) {
				System.out.println("Zero");
			} else {
				System.out.println("Positive number");
			}

			break;
		case 0:

			// negative
			System.out.println("Negative number");

			break;
		}
		

		System.out.println("Program ends here.");

	}

}

//WAP to find out given number is positive of negative.

		/*
		 * int num = 4;
		 * 
		 * if(num>0) { System.out.println("Positive number"); }else {
		 * System.out.println("Negative number"); }
		 */

		// Nested if - condition within condition

		/*
		 * int num = 0;
		 * 
		 * if (num >= 0) {
		 * 
		 * // positive or zero if (num == 0) { System.out.println("Zero"); } else {
		 * System.out.println("Positive number"); }
		 * 
		 * } else {
		 * 
		 * // negative number System.out.println("Negative number");
		 * 
		 * }
		 * 
		 */

		/*
		 * 
		 * int num = 45;
		 * 
		 * if(num>0) { System.out.println("Positive"); }else if(num<0) {
		 * System.out.println("Negative"); }else { System.out.println("Zero"); }
		 * 
		 */


/*
 * 	1. if statement 
 * 
 * 		if(condition)
 * 		{
 * 			// statement 
 * 		}
 * 
 * 	2. if else statement 
 * 
 * 		if(condition)
 * 		{
 * 			// statement 
 * 		}else{
 * 			// statement 
 * 		}
 * 		
 * 	3. else if ladder statement
 * 
 *  	if(condition){
 *  	
 *  	}else if(condition){
 *  
 *  	}else if(condition){
 *  	
 *  	}	
 *  
 *  
 * 	4. nested if statement
 * 
 * 		if(condition)
 * 		{
 * 			if(condition){
 * 
 * 			}
 * 		}
 *  
 * 	5. switch case statement
 * 
 * 		switch(expression)
 * 		{
 * 			case CONSTANT :
 * 					break;
 * 			case CONSTANT :
 * 					break;
 * 			case CONSTANT :
 * 					break;
 * 			default:
 * 		}
 * 
 */

