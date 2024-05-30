package collection;

import java.util.Stack;

public class StackMethod {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		stk.add(10);
		stk.add(30);
		stk.add(40);
		stk.add(30);
		stk.add(60);
		stk.add(80);
		stk.add(50);
		stk.add(20);
		stk.add(10);

		stk.pop();
		stk.push(565);
		Integer First_element = stk.firstElement();
		Integer last_element = stk.lastElement();
		System.out.println("First_element: "+First_element);
		System.out.println("last_element: "+last_element);

		System.out.println("Stack : " + stk);

//		Queue<Integer> que = new StackMethod();

	}

}
