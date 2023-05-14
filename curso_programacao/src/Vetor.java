import java.util.Locale;
import java.util.Scanner;

public class Vetor{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma = 0, media = 0;
		
		System.out.print("Informe a quantidade de numeros: ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Informe um valor: ");
			vet[i] = sc.nextDouble();
			soma += vet[i];
			
		}
		media = soma / n;
		
		System.out.print("Valores: ");
		for(int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", vet[i])+" ");
			

		}
		System.out.println();
		System.out.print("Soma: "+String.format("%.2f", soma));
		System.out.println();
		System.out.print("Média: "+String.format("%.2f", media));
		
		
		sc.close();
	}
		
}