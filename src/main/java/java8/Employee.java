package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

	private int id;
	private String nmae;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String nmae, double salary) {
		super();
		this.id = id;
		this.nmae = nmae;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNmae() {
		return nmae;
	}

	public void setNmae(String nmae) {
		this.nmae = nmae;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", nmae=" + nmae + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Employee emp = new Employee();
		emp.setId(10);
		emp.setNmae("X");
		emp.setSalary(700);
		list.add(emp);
		
		Employee emp1 = new Employee();
		emp1.setId(20);
		emp1.setNmae("Y");
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
		
		List<Employee> sortedEmp = list.stream().sorted(Comparator.comparing(Employee :: getSalary))
				.collect(Collectors.toList());
		
		
		sortedEmp.forEach(System.out::println);

	}

}
