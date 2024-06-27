package collection;

import java.util.ArrayList;

public class _main_ {

	public static void main(String[] args) {
		ArrayList<Students> al = new ArrayList<Students>();
		al.add(new Students("prashant",25));
		
		for(Students st : al) {
			System.out.println(st);
		}

	}

}
