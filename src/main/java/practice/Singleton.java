package practice;

public class Singleton {
	
//	1. creating new instance at time of class loading 
	private static Singleton instance ;

//	 2. private constructor to prevent instantiation 
	private Singleton() {
	}

//	3.  Provide a public static method to return the instance of the class.
	public static Singleton getInstance() {
//		if(instance == null) {
//			instance = new Singleton();
//		}
		return instance;
	}

}
