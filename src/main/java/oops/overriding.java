package oops;

abstract class superClass {

	public abstract void a();
	public abstract String c();

}

class subclass extends superClass {

	public void b() {
		System.out.println("from B method");
	}

	@Override
	public void a() {
		System.out.println("From a Method");

	}

	@Override
	public String c() {
		System.out.println("hello from string ");
		return "hello from string";
	}

	
}

public class overriding {

	public static void main(String[] args) {
		subclass b = new subclass();
		b.a();
		b.c();

	}

}
