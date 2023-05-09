package employee;

import java.util.Scanner;

public class RunEmployeeBonus {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many employees will be registered? ");
		
		int countEmployees = scanner.nextInt();
		scanner.nextLine();
		String[] names = new String[countEmployees];
		double[] salaries = new double[countEmployees];
		
		String employeeName;
		double employeeSalary;
		
		EmployeeBonusDiscount employeeBonusDiscount = null;
		
		for (int i = 0; i < salaries.length; i++) {
			
			System.out.println("Register the employee's name here. ");
			employeeName = scanner.nextLine();
			System.out.println("Register the employee's salary here. ");
			employeeSalary = scanner.nextDouble();
			scanner.nextLine();
			names[i]= employeeName;
			salaries[i] = employeeSalary;
		}
		
		for (double salary : salaries) {
			for (String name : names) {
				employeeBonusDiscount = new EmployeeBonusDiscount(name, salary);
				
				if(salary <= 2000) {
					System.out.print("Employee: " + name + "\nSalary: R$" + salary +
							"\n Bonus: R$"+ employeeBonusDiscount.calculateBonus()+
							"Liquid salary: R$");
							double liquidSalary  = employeeBonusDiscount.calculateBonus() + salary;
							System.out.println(liquidSalary);
				}
				else if (salary > 2000) {
					System.out.print("Employee: " + name + "\nSalary: R$" + salary +
							"\n Bonus: R$"+ employeeBonusDiscount.calculateDiscount()+
							"Liquid salary: R$");
							double liquidSalary  = salary - employeeBonusDiscount.calculateDiscount();
							System.out.println(liquidSalary);
				}
			}
		}
		
		
		
		scanner.close();
	}

}
