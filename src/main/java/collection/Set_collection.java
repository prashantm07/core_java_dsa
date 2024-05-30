package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_collection {
	public static void main(String[] args) {
		/************** hash_set *********************************/

		Set<Integer> hash_set = new HashSet<Integer>();
		hash_set.add(15);
		hash_set.add(25);
		hash_set.add(15);
		hash_set.add(35);
		hash_set.add(45);
		hash_set.add(55);
		hash_set.add(65);
		hash_set.add(75);
		hash_set.add(65);
		hash_set.add(75);

		System.out.println("hash_set: " + hash_set);

		/******************** linked_Hash_set *********************************/
		
		Set<Integer> linked_Hash_set = new LinkedHashSet<Integer>();

		linked_Hash_set.add(15);
		linked_Hash_set.add(75);
		linked_Hash_set.add(25);
		linked_Hash_set.add(15);
		linked_Hash_set.add(35);
		linked_Hash_set.add(45);
		linked_Hash_set.add(55);
		linked_Hash_set.add(65);
		linked_Hash_set.add(75);
		linked_Hash_set.add(65);

		System.out.println("linked_Hash_set : " + linked_Hash_set);

		/******************** tree_set *********************************/
		Set<Integer> tree_set = new LinkedHashSet<Integer>();
		tree_set.add(75);
		tree_set.add(15);
		tree_set.add(25);
		tree_set.add(15);
		tree_set.add(35);
		tree_set.add(45);
		tree_set.add(55);
		tree_set.add(65);
		tree_set.add(75);
		tree_set.add(65);

		Iterator it = tree_set.iterator();
		
		System.out.println("tree_set : ");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
//		System.out.println("tree_set : " + tree_set);
	}
}
