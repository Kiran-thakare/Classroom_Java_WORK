package Thread;

class Thread1 extends Thread {

	public void run() {

		for (int i = 0; i < 50; i++) {
			System.out.println(i + ":" + Thread.currentThread().getName());
		}
	}
}

class Thread2 implements Runnable {

	public void run() {

		for (int i = 0; i < 50; i++) {
			System.out.println(i + ":" + Thread.currentThread().getName());
		}

	}

}

public class JavaThread {

	public static void main(String[] args) {

		Thread1 t1 = new Thread1();
		t1.setName("First");
		t1.start();

		Thread2 runable = new Thread2();
		Thread t2 = new Thread(runable);
		t2.setName("Second");
		t2.start();

		System.out.println("Program Start....");

		System.out.println("Thread Starts:" + Thread.currentThread().getName());

		for (int i = 0; i < 10; i++) {
			System.out.println(i + ":" + Thread.currentThread().getName());
		}

		System.out.println("Program End....");
	}
}
