package collection;

import java.util.ArrayList;
import java.util.Collections;

class student implements Comparable<student> {

	private int id;
	private String name;
	private int age;

	public student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;

	}

	@Override
	public int compareTo(student c) {
		if (age == c.age) {
			return 0;
		} else if (age > c.age) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class Comparable_ex {
	public static void main(String[] args) {
		ArrayList<student> sd = new ArrayList<student>();
		
		sd.add(new student(1, "AAA", 25));
		sd.add(new student(2, "BBB", 15));
		sd.add(new student(3, "CC", 16));
		
		Collections.sort(sd);
		for(student st : sd) {
			System.out.println();
		}
	}

}
