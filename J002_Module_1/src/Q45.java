/*
 *  W.A.J.P to create 2 threads and execute that threads by providing sleep time as 
    2000ms and check the execution. 
 */
public class Q45 {

	public static void main(String[] args) {

		Thread t1 = new Thread();
		t1.start();

		try {
			System.out.println("Thread 1 is running.");
			t1.sleep(2000);
			System.out.println("Thread 1 Complete...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Thread t2 = new Thread();
		t2.start();

		try {

			System.out.println("Thread 2 is running.");
			t2.sleep(2000);
			System.out.println("Thread 2 Complete...");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
