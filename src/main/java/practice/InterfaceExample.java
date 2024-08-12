package practice;

import java.util.ArrayList;
import java.util.List;

class animal{
	
	public void voice() {
		System.out.println("in animal class");
	}
}

class dog extends animal{
 public void voice() {
	 System.out.println("in Animal class");
 }
}

public class InterfaceExample  {

	public static void main(String[] args) {

//		List<String> sList = new ArrayList<String>();
//		sList.add("prashnt");
//		System.out.println(sList);
//		List<String> oList = new ArrayList<String>();
//		oList = sList;
//		System.out.println(oList);
		
		animal a = new dog();
		a.voice();
		
	}

}
