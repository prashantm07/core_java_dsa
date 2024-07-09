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
		ll.add(12);
		ll.add(35);
		ll.add(45);
		ll.add(55);
		ll.add(65);
		ll.add(75);
		ll.add(65);
		ll.add(75);
		System.out.println("Linked_List : " + ll);
		
		List<Integer> sumList = new ArrayList<Integer>();
		for(int i =0; i < ll.size();i++) {
			if(ll.get(i) %2 == 0) {
				sumList.add(ll.get(i));
			}
		}
		System.out.println(sumList + " sumList");
		
		List list = new ArrayList();
		list.add(1);
		list.add(" prashant");
		System.out.println(list);
	}
}
