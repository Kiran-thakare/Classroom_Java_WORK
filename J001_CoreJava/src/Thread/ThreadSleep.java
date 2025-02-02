package Thread;

public class ThreadSleep {

	public static void main(String[] args) {

		System.out.println("Program Starts...");

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(2 * i);
		}

		System.out.println("Program End...");
	}
}
