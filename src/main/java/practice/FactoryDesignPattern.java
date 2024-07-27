package practice;

 interface PrintInterface {
	public void print();

}

class RectangleClass implements PrintInterface {
	@Override
	public void print() {
		 System.out.println("Inside Rectangle::draw() method.");
	}

}
class SquareClass implements PrintInterface{

	@Override
	public void print() {
		  System.out.println("Inside Square::draw() method.");
		
	}
	
}
public class FactoryDesignPattern {
	public static void main(String[] args) {
		System.out.println(12345);
	}
}