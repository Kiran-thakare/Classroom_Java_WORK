/*
 *  W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch 
    block. try { 
			try 
			{//code} 
			catch (Exception e) 
			{//code} 
			catch (Exception e) 
			{//code} 
 */
public class Q38 {

	public static void main(String[] args) {

		try {
			try {
				int a[] = new int[5];
				//a[5] = 30 / 0;
				System.out.println("Index:"+a[5]);
			} catch (ArithmeticException e) {
				System.out.println("Inner catch: ArithmeticException: Division by zero.");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Outer catch: ArrayIndexOutOfBoundsException");
		}
	}
}
