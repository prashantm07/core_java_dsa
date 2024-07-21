package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Duplicate {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(10);

		
         Comparator<Integer> com = (Integer t1 , Integer t2) -> t1.compareTo(t2);
         
         Collections.sort(list,com);
		
		for (int i = 0; i < list.size(); i++) {
			int count =0;
			for (int j = 0; j < list.size(); j++) {
				if(list.get(i)==list.get(j)) {
					count++;
					
				}
				
			}
			if(count >= 2) {
				System.out.println(list.get(i));
			}
			
		}
//		Set<Integer> set = new HashSet();
//		Set<Integer> duplicate = new HashSet();
//
//		for(Integer element : list){
//		if(!set.add(element)){
//		duplicate.add(element);
//		}
//		}
//		System.out.println(duplicate);

	}

}
