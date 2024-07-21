package practice;

interface demo {
	public default void print() {
		System.out.println("fFrom demo Interface");
	}
}

interface demo2  {
	public default void print() {
		System.out.println("From demo 2 Interface");
	}
}

public class DemoInterface implements demo, demo2 {

	public static void main(String[] args) {
		DemoInterface df = new DemoInterface();
		df.print();
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		demo2.super.print();
		demo.super.print();
		
		
	}

	

}
