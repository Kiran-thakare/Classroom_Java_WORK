package Thread;

class Table {

	// synchronized method
	/*
	 * synchronized void printTable(int num)
	 *  { for (int i = 1; i <= 10; i++) {
	 * System.out.println(Thread.currentThread().getName() + " : " + num * i); 
	 * try {
	 * Thread.sleep(500); } 
	 * catch (InterruptedException e)
	 *  { // TODO Auto-generated
	 * catch block e.printStackTrace(); 
	 * } } }
	 */

	void printTable(int num) {
			//synchronized block
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + num * i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}

class T1 extends Thread {

	Table table;

	public T1(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		table.printTable(9);
	}

}

class T2 implements Runnable {

	Table table;

	public T2(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		table.printTable(7);
	}

}

public class JavaSynchronizedBlock {

	public static void main(String[] args) {
		Table table = new Table();
		table.printTable(5);

		T1 t1 = new T1(table);
		T2 t2 = new T2(table);
		Thread thread = new Thread(t2);

		t1.start();
		thread.start();
	}
}
