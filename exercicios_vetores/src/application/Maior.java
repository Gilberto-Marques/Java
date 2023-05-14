package application;

import java.util.Locale;
import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		System.out.println();
		double[] vect = new double [n];
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double maior = vect[0];
		int posicao = 0;
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i] > maior ) {
				maior = vect[i];
				posicao = i;
			}
			
		}
		System.out.println();
		System.out.print("MAIOR VALOR = "+maior);
		System.out.println();
		System.out.print("POSICAO DO MAIOR = "+posicao);
		
		sc.close();

	}

}
