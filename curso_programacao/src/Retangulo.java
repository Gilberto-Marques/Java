import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area, perimetro, diagonal;
		
		System.out.print("Informe o valor da base: ");
		base = sc.nextDouble();
		
		System.out.print("Informe o valor da aluta: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		
		perimetro = ((base*2) + (altura*2));
		
		diagonal = (base * 2)+(altura * 2);
		diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		System.out.println("área: "+String.format("%.4f", area));
		
		System.out.println("Perímetro: "+String.format("%.4f", perimetro));
		
		System.out.println("Diagonal: " +String.format("%.4f",diagonal));
		
		
		sc.close();
		
	}

}
