package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Comparator_ex {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(50);
		list.add(90);
		list.add(45);
		
//		creating new comparator
		Comparator<Integer> com = (Integer t1 , Integer t2) -> t1.compareTo(t2);
		
//		sorting list
//		Collections.sort(list,com);
		Collections.sort(list);
		for(int num : list) {
			System.out.print(num+ " ");
		}
//		
//		 list.stream().sorted().forEach(System.out::println);
	}

}
