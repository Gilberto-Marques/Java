package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] vect = new Pessoa[n];
		for(int i=0; i<vect.length; i++) {
			System.out.println("Dados da "+(i+1)+" pessoa:");
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vect[i] = new Pessoa(nome, idade, altura);
						
		}
		double soma = 0.0;
		for(int i=0; i<vect.length; i++) {
			soma += vect[i].getAltura();
			
		}
		double media = soma / vect.length;
		System.out.printf("Altura media:%.2f ",media);
		
		double menor = 0;
		for(int i=0; i<vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				menor ++;								
				
			}	
		}
		double porcentagem = menor / vect.length * 100;
		
		
		System.out.println();
		System.out.printf("Pessoas com menos de 16 anos:%.2f %% ",porcentagem);
		System.out.println();
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());								
				
			}	
		}
		
		
		sc.close();
	}

}
