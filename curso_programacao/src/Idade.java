import java.util.Locale;
import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		int idade1, idade2;
		double media;
		
		
		System.out.print("Informe o nome da primeira pessoa: ");
		nome1 = sc.nextLine();
		
		System.out.print("Informe sua idade: ");
		idade1 = sc.nextInt();
		
		System.out.println();
		
		
		System.out.print("Informe o nome da segunda pessoa: ");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.print("informe sua idade: ");
		idade2 = sc.nextInt();
		
		media = (double)(idade1 + idade2)/2;
		
		System.out.println("A média de idade de "+nome1+" e "+nome2+" é de: "+String.format("%.1f", media)+ " anos.");
		
		
		sc.close();
	}

}
