package oops;

abstract class superClass {

	public abstract void a();

}

class subclass extends superClass {

	public void b() {
		System.out.println("from B method");
	}

	@Override
	public void a() {
		System.out.println("From a Method");

	}
}

public class overriding {

	public static void main(String[] args) {
		subclass b = new subclass();
		b.a();

	}

}
