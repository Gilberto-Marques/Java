package sequencial;
/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
 o valor que recebe por hora e calcula o salário desse funcionário. A seguir, 
 mostre o número e o salário do funcionário, com duas casas decimais.*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, hora_trabalhada;
		double valor_hora, salario;
		
		System.out.println("Informe alguns dados do funcionário");
		System.out.print("Número: ");
		num = sc.nextInt();
		System.out.print("Horas trabalhas: ");
		hora_trabalhada = sc.nextInt();
		System.out.println("Valor a receber por hora: ");
		valor_hora = sc.nextDouble();
		salario = hora_trabalhada * valor_hora;
		System.out.print("NUMBER: "+num);
		System.out.printf("\nSALARY: U$%.2f",salario);
		
		sc.close();
	}

}
