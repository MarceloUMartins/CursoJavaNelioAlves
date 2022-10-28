package ExercicioFixMembroEstaticoPOOApplicantion01;

import java.util.Locale;
import java.util.Scanner;

import ExercicioFixMembroEstaticoPOOEntities01.CurrencyConverter;

public class Program {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Waht is the dollar price? ");
		double a = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double b = sc.nextDouble();
				
		double c = CurrencyConverter.convertDollarToReal(a, b);
		System.out.printf("Amount to be paid in reais = %.2f " , c);
		
		
		sc.close();
	}
}
