package sequencial;
/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, area;
		
		System.out.println("Informe os valores de A, B e C para calcular ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		area = A * C / 2;
		System.out.println("TRIÂNGULO: "+String.format("%.3f", area));
		
		area = 3.14159 * (Math.pow(C, 2.0));
		System.out.println("CIRCULO: "+String.format("%.3f", area));
		
		area = (A+B) * C / 2;
		System.out.println("TRAPÉZIO: "+String.format("%.3f", area));
		
		area = Math.pow(B, 2.0);
		System.out.println("QUADRADO: "+String.format("%.3f", area));
		
		area = A * B;
		System.out.println("RETâNGULO: "+String.format("%.3f", area));
			
		sc.close();
	}

}
