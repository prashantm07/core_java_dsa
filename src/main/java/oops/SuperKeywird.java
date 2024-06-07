package oops;

class animal{
	String color = "black";
}

class dog extends animal{
	String color = "white";
	
	public void print() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class SuperKeywird {

	public static void main(String[] args) {
		dog dog = new dog();
		dog.print();

	}

}
