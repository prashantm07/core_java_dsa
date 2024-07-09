package multithreading;

public class ThreadMethods extends Thread {
public static void main(String[] args) {
	Thread myThread1 = new Thread();
	Thread myThread2 = new Thread();
	
	myThread1.start();
	myThread1.setName("T1");
	myThread2.setName("T1");
	myThread2.setPriority(MAX_PRIORITY);
	System.out.println(myThread1.getName());
	System.out.println(myThread2.getName());
	System.out.println(myThread1.getId());
	System.out.println(myThread2.getId());
//	myThread1.setDaemon(true);
	
	System.out.println(myThread1.isDaemon());
	System.out.println(myThread1.getPriority());
//	myThread1.setDaemon(false);
//	System.out.println(myThread1.isDaemon());
	
	
}
}
