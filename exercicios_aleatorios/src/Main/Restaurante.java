package Main;

import java.util.Locale;
import java.util.Scanner;
import entidades.Pedido;

public class Restaurante {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Pedido cliente = new Pedido();
		
		int pedido;
		do {
			System.out.println("Boa noitee seja bem vindo!");
			System.out.println("1- Cardápio");
			System.out.println("2- Conta");
			System.out.println("3- Sair");
			pedido =sc.nextInt();
			recebePedido(pedido);
		}while(pedido == 1 || pedido == 2);
		
		
		
		sc.close();
	
	}


}
