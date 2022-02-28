package curs2tema;

import java.util.Scanner;

public class IfElseTema {

	public static void main(String[] args) {
		
		
		System.out.println("Introdu punctajul testului: ");
		Scanner scan = new Scanner(System.in);
		int valoare = scan.nextInt();
		
		if ( valoare < 0 ) {
			System.out.println("Invalid Input!");
		}
		
		else if ((valoare >= 0) && (valoare <= 65)) {
			System.out.println("Ai picat, mai incearca!");
			
		}
		else if (valoare >= 66){
			System.out.println("Felicitari! ai trecut!");
			
			
		
		}
		
		
	

	}

}
