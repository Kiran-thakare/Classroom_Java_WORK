/*
 * W.A.J.P to start the same Thread twice by calling start () method twice. Test 
   ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start (); 
 */

class myThreadd extends Thread {

	public void run() {

		System.out.println("Thread Start....");
	}
}

public class Q46 {

	public static void main(String[] args) {

		myThreadd t1 = new myThreadd();
		t1.start();
        
		
		t1.start();
	}
}
