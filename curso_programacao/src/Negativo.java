import java.util.Scanner;

public class Negativo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, negativo = 0;
		
		System.out.print("Informe a ordem da matriz quadrada: ");
		n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		System.out.println("Informe os valores da matriz: ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("Posição ["+i+"]["+j+"]:");
				matriz[i][j] = sc.nextInt();

				if(matriz[i][j] < 0) {
					negativo++;
				}
			}
		}
		
		System.out.print("Diagonal principal: ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i == j) {
					System.out.print(matriz[i][j]+" ");
				}
				
			}
		}
		System.out.println();
		System.out.println("Quantidade de negativos: "+negativo);
		
		
		
		
		sc.close();
	}
		
}