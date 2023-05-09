package employee;

public class EmployeeBonusDiscount {
	
	private String name;
	private double salary;
	
	public EmployeeBonusDiscount(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	double calculateBonus() {
		double bonus = 0;
		
		if (this.salary <= 1000) {
			bonus = this.salary * 20 /100;
		} else if (this.salary > 1000 && this.salary <= 2000) {
			bonus = this.salary * 10 /100;
		}
		return bonus;
	}
	
	double calculateDiscount() {
		double discount = this.salary * 10/100;
		return discount;
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
	
	
	
}
