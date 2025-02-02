/*
 * W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set 
  Daemon () method of Thread class and check whether the thread is set daemon or 
   not by using is Daemon () method. 
   TestDaemonThread2 t1=new TestDaemonThread2(); 
   TestDaemonThread2 t2=new TestDaemonThread2(); t1.start(); 
    t1.setDaemon(true);//will throw exception here t2.start(); 
 */
class TestDemonThread extends Thread {

	public void run() {
		if (currentThread().isDaemon()) {
			System.out.println("Daemon Work...");
		} else {
			System.out.println("Thread Run...");
		}
	}
}

public class Q47 {

	public static void main(String[] args) {

		TestDemonThread t1 = new TestDemonThread();
		TestDemonThread t2 = new TestDemonThread();

		t1.setDaemon(true);
		
		t1.start();
		t2.start();

	}
}
