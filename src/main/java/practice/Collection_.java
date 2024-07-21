package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Collection_ {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
//		Used to iterate collection of object in forword direction 
		Iterator<Integer> iterator = list.iterator();

////	used to iterate reverse direction 
		ListIterator<Integer> listIterator = list.listIterator(list.size());

		System.out.println("forword Direction");
		while (iterator.hasNext()) {
			Integer num = iterator.next();
			System.out.print(num + " ");

		}

		System.out.println("\n----------------");

		System.out.println("reverse  Direction");
		while (listIterator.hasPrevious()) {
			Integer num = listIterator.previous();
			System.out.print(num + " ");

		}
		System.out.println();
//		for (int a : list) {
//			System.out.print(a + " ");
//		}
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		
		Iterator<Integer> interater = set.iterator();
		System.out.println("-------------- set iterater-----");
		System.out.println("forword Direction");
		while (interater.hasNext()) {
			int num = interater.next();
			System.out.print(num+" ");
			
		}
		System.out.println("\nreverse  Direction");
	}

}
