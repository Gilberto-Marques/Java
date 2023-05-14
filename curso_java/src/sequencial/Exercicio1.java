package sequencial;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("Informe dois valores inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;
		
		System.out.printf("SOMA: %d",soma);
		
		sc.close();
	}

}
