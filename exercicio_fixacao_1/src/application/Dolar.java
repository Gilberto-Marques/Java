package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Converter;

public class Dolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		Converter.value = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		Converter.amount = sc.nextDouble();
		System.out.println("Amount to be paid in Reais : ");
		Converter.currencyConverter();
		
		sc.close();
	}

}
