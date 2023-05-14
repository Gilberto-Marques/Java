import java.util.Locale;
import java.util.Scanner;


public class Menor{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Informe o primeiro valor: ");
		num1 = sc.nextInt();
		System.out.print("Informe o segundo valor: ");
		num2 = sc.nextInt();
		System.out.print("Informe o terceiro valor: ");
		num3 = sc.nextInt();
		
		if(num1 <= num2) {
			if(num1 <= num3) {
				System.out.println("Menor: "+num1);
			}else {
				System.out.println("Menor: "+num3);
			}
			
		}else {
			if(num2 <= num3) {
				System.out.println("Menor: "+num2);
			}else {
				System.out.println("Menor: "+num3);
			}
			
		}
			
			
		sc.close();
	}
	
}
