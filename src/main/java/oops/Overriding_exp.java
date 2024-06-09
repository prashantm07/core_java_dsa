package oops;

class bank {
	 int  getRateOfInterest() {
		return 0;
	}
}

class sbi extends bank {
	int getRateOfInterest() {
		return 8;
	}
}


class hdfc extends bank {
	int getRateOfInterest() {
		return 7;
	}
}

class axis extends bank {
	int getRateOfInterest() {
		return 5;
	}
}

public class Overriding_exp {

	public static void main(String[] args) {
		sbi s = new sbi();
		hdfc h = new hdfc();
		axis a = new axis();
		
		System.out.println(s.getRateOfInterest());
		System.out.println(h.getRateOfInterest());
		System.out.println(a.getRateOfInterest());

	}

} 
