package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_collection {
	public static void main(String[] args) {
		/************************ Arraylist *********************************/
		List<Integer> al = new ArrayList<>();
		al.add(25);
		al.add(15);
		al.add(35);
		al.add(45);
		al.add(55);
		al.add(65);
		al.add(75);
		al.add(65);
		al.add(75);

		System.out.println("Arraylist : " + al.get(1));
		
		/************************* Linked_List ********************************/
		List<Integer> ll = new LinkedList<Integer>();
		ll.add(25);
		ll.add(15);
		ll.add(35);
		ll.add(45);
		ll.add(55);
		ll.add(65);
		ll.add(75);
		ll.add(65);
		ll.add(75);
		System.out.println("Linked_List : " + ll.get(2));
	}
}
