package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import java8.java8_exp.MyFunctionalInterface;

public class java8_exp {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(1, "A", 45000));
		list.add(new Employee(1, "A", 87000));
		list.add(new Employee(1, "A", 74000));
		list.add(new Employee(1, "A", 72000));
		list.add(new Employee(1, "A", 45000));
		list.add(new Employee(1, "A", 45045));
		list.add(new Employee(1, "A", 45080));
		list.add(new Employee(1, "A", 45100));

		Optional<Double> salary = list.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder())
				.skip(2 ).findFirst();
//		System.out.println(salary.get());
		
		myClass mc = new myClass();
		mc.execute();
		mc.demo();
		MyFunctionalInterface.print();
		
		
	}
	
	@FunctionalInterface
	interface MyFunctionalInterface {
	    void execute();
	     
	    static void print() {
	    	System.out.println("print");
	    }
	    
	      default void demo() {
	    	System.out.println("form demo method");
	    }
	}
	
}

class myClass implements MyFunctionalInterface{

	@Override
	public void execute() {
		System.out.println("execute");
		
	}
	
	
	
	
}
