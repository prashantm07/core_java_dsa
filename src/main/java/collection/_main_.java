package collection;

import java.util.ArrayList;

public class _main_ {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("prashant",25));
		
		for(Student st : al) {
			System.out.println(st);
		}

	}

}