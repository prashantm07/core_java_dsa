package oops;

interface draw {
	void draw();
}

class rectangle1 implements draw {

	@Override
	public void draw() {
		System.out.println("circle is drawing...!");
		System.out.println("circle is drawing...!");

	}

}

class circle1 implements draw {

	@Override
	public void draw() {
		System.out.println("circle is drawing...!");

	}

}

public class FactoryDesign {

	public static void main(String[] args) {
	circle1 c = new circle1();
	c.draw();

	}

}
