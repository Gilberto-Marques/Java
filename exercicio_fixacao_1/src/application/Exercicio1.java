package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle r = new Rectangle();
		r = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		System.out.println();
		System.out.print("AREA = " + String.format("%.2f", r.area()));
		
		System.out.println();
		System.out.print("PERIMETER = " + String.format("%.2f", r.perimeter()));
		
		System.out.println();
		System.out.println("DIAGONAL = " + String.format("%.2f", r.diagonal()));
		
		
		sc.close();
	}

}
