package application;

import java.util.Locale;
import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		System.out.println();
		
		int[] vect = new int[n];
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			
		}
		int cont = 0;
		System.out.println("NUMEROS PARES: ");
		for(int i=0; i<vect.length; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(" "+vect[i]);
				cont ++;
				
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = "+cont);
		
		
		
		sc.close();

	}

}
