package sequencial;

import java.util.Locale;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de 
cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
Calcule e mostre o valor a ser pago.*/

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int /*cod_p1*/ num_p1, /*cod_p2*/ num_p2;
		double valor_p1, valor_p2, valor_total;
		
		System.out.println("Informe os dados da peça 1");
		/*System.out.print("Código: ");
		cod_p1 = sc.nextInt();
		*/
		System.out.print("Numero: ");
		num_p1 = sc.nextInt();
		System.out.print("Valor: ");
		valor_p1 = sc.nextDouble();
		
		System.out.println("Informe os dados da peça 2");
		/*System.out.print("Código: ");
		cod_p2 = sc.nextInt();
		*/
		System.out.print("Numero: ");
		num_p2 = sc.nextInt();
		System.out.print("Valor: ");
		valor_p2 = sc.nextDouble();
		
		valor_total = (num_p1 * valor_p1) + (num_p2 * valor_p2);
		System.out.println("VALOR A PAGAR: R$ "+String.format("%.2f", valor_total));
		
		sc.close();
	}

}
