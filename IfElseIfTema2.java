package curs2tema;

import java.util.Scanner;

public class IfElseIfTema2 {

	public static void main(String[] args) {
		
		System.out.println("Ce varsta ai?");
		Scanner scan = new Scanner (System.in);
		int varsta = scan.nextInt();
		
		
		if ( varsta < 1 ) {
			System.out.println("Invalid Input!");			
		}
		
		else if ((varsta <= 1) && (varsta < 18)) {
			System.out.println("Esti minor!"); 
		}
		
		else if (( varsta >= 18 ) && ( varsta <= 65 )) {
			System.out.println("Esti adult!");
		}
		
		else if ( varsta > 65 ) {
			System.out.println("Esti batran!");
		}
		
	}

}
