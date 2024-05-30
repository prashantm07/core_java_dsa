package multithreading;

public class MultithreadingDemo {
	public static void main(String[] args) {

		Mythread t1 = new Mythread();
		Mythread t2 = new Mythread();
		Mythread t3 = new Mythread();
		Thread t4 = new Thread("My first thread.....");
//		t1.setName("prashant");
//		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
	}

}

class Mythread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(10);
			System.out.println(Thread.currentThread().getName()+" ");
		} catch (Exception e) {
			System.out.println("exception caught");
		}
	}
}
