package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de numeros da matriz: ");
		int n = sc.nextInt();
		int [][] mat = new int [n][n];
		
		System.out.println("Informe os valores: ");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println();
		
		System.out.println("Main diagonal: ");
		for(int i=0; i<mat.length; i++) {
			System.out.println(mat[i][i]+"");
		}
		System.out.println();
		
		int count=0;
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers= "+count);
		
		sc.close();
	}

}
