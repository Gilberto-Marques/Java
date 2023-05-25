package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Room;

public class Hotel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		
		int n = sc.nextInt();
		Room[] r = new Room[n];
		
		for(int i=0; i< r.length; i++) {
			System.out.printf("RENT #%d:",i+1);
			System.out.println();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			r[i] = new Room(name, email, room);
		}

		System.out.println();
		System.out.println("Busy rooms: ");
		
		for(int i=0; i<r.length; i++) {
			if(r[i] != null) {
				System.out.print(i+": "+r[i]);
				System.out.println();
			}		
		}
		
		sc.close();
	}

}
