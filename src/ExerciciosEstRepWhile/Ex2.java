//URI Java 1115
package ExerciciosEstRepWhile;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		while(X != 0 && Y != 0) {
			 			 
			if(Y > 0 && X > 0) {
				System.out.println("Primeiro");
			}
			else if(Y > 0 && X < 0) {
				System.out.println("Segundo");
			}
			else if(Y < 0 && X < 0) {
				System.out.println("Terceiro");
			}
			else if(Y < 0 && X > 0) {
				System.out.println("Quarto");
			}
			 X = sc.nextInt();
			 Y = sc.nextInt();
			}
		sc.close();
	}

}
