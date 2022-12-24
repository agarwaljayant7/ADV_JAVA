package inheritance;

public class Analyst extends Employee {

	private double commission;

	Analyst(String name, int age, double salary, double commission) {
		super(name, age, salary);
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

}
