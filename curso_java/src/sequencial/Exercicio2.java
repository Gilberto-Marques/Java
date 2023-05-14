package sequencial;

/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste 
círculo com quatro casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, pi = 3.14159, area;
		
		System.out.println("Informe o valore do Raio: ");
		raio = sc.nextDouble();
		area = pi * (Math.pow(raio, 2.0));
		
		System.out.printf("A: %.4f",area);
		
		sc.close();
	}

}