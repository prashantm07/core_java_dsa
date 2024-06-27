package oops;

class animal{
	String color = "black";
}

class dog extends animal{
	String color = "white";
	
	public void print() {
		System.out.println( );
		System.out.println(super.color);
	}
}
public class SuperKeywird {

	public static void main(String[] args) {
		String s1 = new String("prashant");
		String s = "prashant";
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
		dog dog = new dog();
//		dog.print();

	}

}
