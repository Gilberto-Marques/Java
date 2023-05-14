package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Employee employee = new Employee();
		employee = new Employee();
		
		System.out.println("Enter data of employee");
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: "+employee.name+ ", $ "+employee.netSalary());
		
		System.out.println("Which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.print("Updated data: "+employee.name+ ", $ "+ String.format("%.2f", employee.netSalary()));
		
		
		sc.close();
	}

}
