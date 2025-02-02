/*
 *  W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero 
   exception and another one is to handle 
   ArrayIndexOutOfBoundException)  int a [] =new int [5]; a [5]=30/0;
 */
public class Q37 {

	public static void main(String[] args) {

		try {
			int[] a = new int[5];
			 a[5]=30/0;
			 System.out.println(a[5]);
		}catch (ArithmeticException e) {
			System.out.println(" java.lang.ArithmeticException: / by zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}

	}
}
