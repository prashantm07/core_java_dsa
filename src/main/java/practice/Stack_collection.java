package practice;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_collection {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.pop();
		System.out.println(stack);

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);

		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.peek());
		System.out.println(queue.isEmpty());
		System.out.println(queue);

		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		ht.put(10, 1);
		ht.put(20, 2);
		ht.put(30, 3);
		ht.put(40, 4);
		ht.put(20, 5);
		ht.put(null, null);
		ht.put(null, null);
		System.out.println(ht);
	}

}
