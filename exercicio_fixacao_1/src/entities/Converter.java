package entities;

public class Converter {
	public static double value;
	public static double amount;
	
	public static void currencyConverter() {
		
		double dollar = value * amount;
		dollar += (6.0/100 * dollar);
		System.out.print(String.format("%.2f", dollar));
	}

}
