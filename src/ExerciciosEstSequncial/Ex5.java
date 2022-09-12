package ExerciciosEstSequncial;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1 = sc.nextInt();
		int numPeca1 = sc.nextInt();	
		double valorUnitPeca1 = sc.nextDouble();
		double valorTotalPeca1 = numPeca1 * valorUnitPeca1;
		
		int codPeca2 = sc.nextInt();
		int numPeca2 = sc.nextInt();	
		double valorUnitPeca2 = sc.nextDouble();
		double valorTotalPeca2 = numPeca2 * valorUnitPeca2;
		
		double valorTotalPagar = valorTotalPeca1 + valorTotalPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n ", valorTotalPagar);
		sc.close();

	}

}
