package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class java8Features {
	public static void main(String[] args) {
//		lambda expression
		new Thread(()->{
			System.out.println("new thread is start");
		}).start();
		
//		method reference
		Consumer<Integer> printer = System.out::println;
		printer.accept(10);
		printer.accept(45);
		
		List<String> list = Arrays.asList("google","microsft","apple");
		
//		cfreating new coparator 
		Comparator<String> com = (String t1 , String t2) -> t1.compareTo(t2);
		
//		sorting the list
		Collections.sort(list,com);
		
		for(String name : list) {
			System.out.println(name+" ");
			
		}
	} 

}
