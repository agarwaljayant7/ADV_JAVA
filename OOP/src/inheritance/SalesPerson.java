package inheritance;

public class SalesPerson extends Employee {

	private double bonus;

	SalesPerson(String name, int age, double salary, double bonus) {
		super(name, age, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

}
