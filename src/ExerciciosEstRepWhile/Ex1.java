//URI Java 1114 
package ExerciciosEstRepWhile;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Incorreta");
			senha = sc.nextInt();
			if (senha == 2002) {
				System.out.println("Acesso Permitido");
			}
		}
		
		
		sc.close();

	}

}
