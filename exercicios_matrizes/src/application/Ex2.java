package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de linhas da matriz: ");
		int l = sc.nextInt();
		
		System.out.println("Informe a quantidade de colunas da matriz: ");
		int c = sc.nextInt();
		
		int[][] mat = new int [l][c];
		
		System.out.println("Informe os valores da matriz: ");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j< mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println("Valores digitados: ");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("Informe um valor da matriz, e encontrar os valores da esquerda, cima, direita, baixo dele(se houver)");
		int find = sc.nextInt();
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(find == mat[i][j]) {
					System.out.println("Position ["+i+"]["+j+"] ");
					if(i >= 0 && j>0) {
						System.out.println("Left: "+mat[i][j-1]);
					}
					if(i >=0 && j<c-1) {
						System.out.println("Right: "+mat[i][j+1]);
					}
					if(i>0) {
						System.out.println("Up: "+mat[i-1][j]);
					}
					if(i<l) {
						System.out.println("Down: "+mat[i+1][j]);
					}
				}
				
			}
		}
		
		sc.close();
	}

}
