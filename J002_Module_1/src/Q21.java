/*Create a class named 'Print Number' to print various numbers of different data types 
by creating different methods with the same name 'printn' having a parameter for 
each data type. 
*/

class PrintNumber {
	public void printn(char ch) {
		System.out.println("Character Data type :" + ch);
	}

	public void printn(byte num) {
		System.out.println("Byte Data type :" + num);
	}

	public void printn(short num) {
		System.out.println("Short Data type :" + num);
	}

	public void printn(int num) {
		System.out.println("Integer Data type :" + num);
	}

	public void printn(long num) {
		System.out.println("Long Data type :" + num);
	}

	public void printn(float num) {
		System.out.println("Float Data type :" + num);
	}

	public void printn(double num) {
		System.out.println("Double Data type :" + num);
	}

	public void printn(boolean b) {
		System.out.println("Boolean Condition :" + b);
	}
}

public class Q21 {

	public static void main(String[] args) {
		PrintNumber pr = new PrintNumber();
		pr.printn('A');
		pr.printn((byte) 127);
		pr.printn((short) 1232);
		pr.printn(33);
		pr.printn(3.14f);
		pr.printn(23236354343l);
		pr.printn(23.233);
		pr.printn(true);
	}
}
