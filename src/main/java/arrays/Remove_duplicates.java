package arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_duplicates {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,1,2,3};
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		System.out.println(set);
		
	}

}
