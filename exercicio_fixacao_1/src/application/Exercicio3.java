package application;

import java.util.Scanner;

import entities.Studant;

import java.util.Locale;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Studant stud = new Studant();
		stud = new Studant();
		
		System.out.println("Enter data of studant");
		System.out.println("Name: ");
		stud.name = sc.nextLine();
		
		System.out.println("Three notes: ");
		stud.verifySituation(sc.nextDouble());
		stud.verifySituation(sc.nextDouble());
		stud.verifySituation(sc.nextDouble());
		
		System.out.println(stud.position());
		
		
		sc.close();
	}

}
