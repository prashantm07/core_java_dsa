package practice;

public class Singleton {
//	creating new instance at time of class loading 
	private static final Singleton instance = new Singleton();

//	private constructor to prevent instantiation 
	public Singleton() {
	}

//	access the instance
	public static Singleton getInstance() {
		return instance;
	}

}
