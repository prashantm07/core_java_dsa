package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
//		Employee emp = new Employee();
//		emp.setId(10);
//		emp.setNmae("X");
//		emp.setSalary(700);
//		list.add(emp);

		Employee emp1 = new Employee();
		emp1.setId(20);
		emp1.setName("Y");
		emp1.setSalary(900);
		list.add(emp1);

		list.add(new Employee(1, "A", 522));
		list.add(new Employee(2, "B", 400));
		list.add(new Employee(3, "C", 200));
		list.add(new Employee(4, "D", 300));
		list.add(new Employee(5, "E", 100));
		list.add(new Employee(6, "F", 700));

//		List<Employee> sortedEmp = list.stream()
//				.sorted(Comparator.comparingDouble(Employee::getSalary))
//				.collect(Collectors.toList());

		System.out.println("******************sorted Salary *************************");
		List<Employee> sortedEmp = list.stream().sorted(Comparator.comparing(Employee::getSalary))
				.collect(Collectors.toList());

		sortedEmp.forEach(System.out::println);
//*************************************************************************************************
		System.out.println("****************filter and store into map***************************");

		Map<String, Double> productPriceMap = list.stream().filter(s -> s.getSalary() >= 400)
				.collect(Collectors.toMap(p -> p.getName(), p -> p.getSalary()));

		for (Entry<String, Double> entry : productPriceMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

//		*************************************************************************************************************************
		System.out.println("************ summary Statistics *******************************");
		DoubleSummaryStatistics summary_Statistics = list.stream()
				.collect(Collectors.summarizingDouble(p -> p.getSalary()));

		System.out.println("Sum of Salary : " + summary_Statistics.getSum());
		System.out.println("Avg of Salary : " + summary_Statistics.getAverage());
		System.out.println("Min of Salary : " + summary_Statistics.getMin());
		System.out.println("Max of Salary : " + summary_Statistics.getMax());
		System.out.println("Salary Count : " + summary_Statistics.getCount());

		System.out.println("************ Min Max Salary *******************************");
//		min salary
		Employee max = list.stream().max((a, b) -> a.getSalary() > b.getSalary() ? 1 : -1).get();
		System.out.println("max : " + max);

//		 Max Salary
		Employee min = list.stream().min((a,b) -> a.getSalary() > b.getSalary() ? 1 : -1).get();
		System.out.println("min : "+min);
		
//		**************Convert to set*********************
		System.out.println("************ Convert to set *******************************");
		
		Set<Double> salary_set = list.stream().map(a -> a.getSalary()).collect(Collectors.toSet());
		System.out.println(salary_set);
		
//		System.out.println(productPriceMap);

	}

}
