package inheritance;

public class Employee extends Person{

	
	private double salary;
	
	public Employee(String name, int age, double salary) {
		
		super(name, age);
		this.salary = salary;
	}

	public String getName() {
		return super.name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}
	
	
}
