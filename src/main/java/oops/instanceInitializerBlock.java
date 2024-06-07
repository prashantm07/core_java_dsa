package oops;


public class instanceInitializerBlock {
	int speed ;
	instanceInitializerBlock() {
		System.out.println("speed is : "+speed);
		{speed = 100;}
	}
	
	public static void main(String[] args) {
		instanceInitializerBlock b1 = new instanceInitializerBlock();
		instanceInitializerBlock b2 = new instanceInitializerBlock();

	}

}
