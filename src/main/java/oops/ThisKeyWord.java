package oops;

public class ThisKeyWord {
	String colour = "black";

	public void print() {
		String colour = "white";
		System.out.println(colour);
		System.out.println(this.colour);
	}
	public static void main(String[] args) {
		ThisKeyWord th = new ThisKeyWord();
		th.print();

	}

}
