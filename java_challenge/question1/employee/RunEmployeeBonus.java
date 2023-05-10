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
		
		for (int i = 0; i < names.length; i++) {
				employeeBonusDiscount = new EmployeeBonusDiscount(names[i], salaries[i]);
				System.out.println("");
				
				if(salaries[i] <= 2000) {
					System.out.print(employeeBonusDiscount.toString() + "\nBonus: R$ " + employeeBonusDiscount.calculateBonus()+
							"\nLiquid salary: R$ ");
							double liquidSalary  = employeeBonusDiscount.calculateBonus() + salaries[i];
							System.out.println(liquidSalary);
				}
				else if (salaries[i] > 2000) {
					System.out.print(employeeBonusDiscount.toString() + "\nDiscount: R$ "+ employeeBonusDiscount.calculateDiscount()+
							"\nLiquid salary: R$ ");
							double liquidSalary  = salaries[i] - employeeBonusDiscount.calculateDiscount();
							System.out.println(liquidSalary);
			}
		}
		
		
		
		scanner.close();
	}

}
