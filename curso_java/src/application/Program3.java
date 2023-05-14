package application;

import java.util.Scanner;
import entities.Account;
import java.util.Locale;

public class Program3 {

	public static void main(String[] args) {
		Account account;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.println("Enter initial deposit value:");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, name, initialDeposit);
		
		}else {
			account = new Account(number, name);
		}
			
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();

	}

}
