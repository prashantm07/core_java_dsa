package oops;

interface A{
	void print();
}

interface b{
	void draw(); 
	void print(int a);
}
public class MultipleInheritance implements A,b {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();
		obj.print();
		obj.draw();
	}

	@Override
	public void print(int a) {
		// TODO Auto-generated method stub
		
	}

}
