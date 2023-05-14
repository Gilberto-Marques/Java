import java.util.Scanner;

public class Impares{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma = 0;
		
		System.out.println("Informe dois valores: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x < y){
			for (int i = x+1; i < y; i++){
				if(i % 2 != 0) {
					soma += i;
				}
				
			}
		}else {
			for (int i = y+1; i < x; i++){
				if(i % 2 != 0) {
					soma += i;
				}
				
			}
			
		}
		System.out.print("Total soma dos impares entre "+x+ " e "+y+": "+soma);
		
		
		sc.close();
	}
	
}