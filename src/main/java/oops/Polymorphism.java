package oops;

public class Polymorphism {

	public static void main(String[] args) {
		cashPayment cp = new cashPayment();
		cp.pay();
		onlinePayment op = new onlinePayment();
		op.pay();
	}
}

interface payment {
	public void pay();
}

class cashPayment implements payment {
	@Override
	public void pay() {
		System.out.println("cash payment completed....");
	}

}

class onlinePayment implements payment {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("online payment completed....");
	}
}
