package Thread;

class myThread extends Thread{
	
	  public void run() {

			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(2 * i);
			}
	  }
}

public class JavaThreadJoin {
    
	public static void main(String[] args) {
		
		myThread t1=new myThread();
		myThread t2=new myThread();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Both Thread Ends...");
		
	}
}
