//URI Java 1134
package ExerciciosEstRepWhile;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int codCombustivel = sc.nextInt();
		int contA = 0;
		int contG = 0;
		int contD = 0;
				
		while (codCombustivel > 0 || codCombustivel <= 4) {
						
			if (codCombustivel == 1) {
				System.out.println("�lcool");
				contA = contA + 1;
				
			}
			else if (codCombustivel == 2) {
				System.out.println("Gasolina");
				contG = contG + 1;
				
			}
			else if (codCombustivel == 3) {
				System.out.println("Diesel");
				contD = contD + 1;
				
			}
			
			else if (codCombustivel == 4){
				System.out.println("MUITO OBRIGADO ");
				System.out.println("�lcool: " + contA );
				System.out.println("Gasolina: " + contG );
				System.out.println("Diesel: " + contD);
				break;
			}
			else  {
				System.out.println("Insira um codigo v�lido");	
				 
			 }
			codCombustivel = sc.nextInt();
			
		}
		
		sc.close();
		
	}
	
}
