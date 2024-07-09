package oops;

class child{
	public void print() {
		System.out.println("in A class");
	}
}
class baa extends child{
	public void print() {
		System.out.println("in B class");
	}
}

public class Overriding_exp2 {
	public static void main(String[] args) {
		
		baa b = new baa();
		b.print();
	}

}
