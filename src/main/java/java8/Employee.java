package java8;

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
	
	

}
