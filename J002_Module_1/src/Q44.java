/*
 *  W.A.J. P to create one thread by extending Thread class in another Class. 
 *  
 */

class myThread1 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println( i +" "+ Thread.currentThread().getName());
		}

	}
}

public class Q44 {

	public static void main(String[] args) {

		myThread1 t1 = new myThread1();
		t1.start();

		 System.out.println("End.....");
	}
}
