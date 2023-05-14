package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class ExLista {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		
		List<Funcionario> list = new ArrayList<>();
	
		for(int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Employee #"+(i+1)+": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			
			Funcionario emp = new Funcionario(id, name, salary);
			list.add(emp);
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary  increse:");		
		int idsalary = sc.nextInt();
		
		Funcionario emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		//Integer pos = position(list, idsalary);
		
		if(emp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the porcentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employee: ");
		for(Funcionario em : list) {
			System.out.println(em);
		}
		
		
		
		sc.close();
	}
	public static Integer position(List<Funcionario>list, int id) {
		for(int i=0; i< list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Funcionario>list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp !=null;
	}
	
}


