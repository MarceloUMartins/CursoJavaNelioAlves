package ExerciciosEstCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		if(salario > 0.00 && salario <= 2000.00) {
			System.out.println("Isento");
		} else if(salario > 2000.01 && salario <= 3000.00) {
			System.out.printf("R$: %.2f%n" , salario * 0.08); 
		}else if(salario > 3000.01 && salario <= 4500.00) {
			System.out.printf("R$: %.2f%n" , (salario - 3000.00) * 0.18 + (salario - 2002) * 0.08); 
		}else if(salario > 4500.00) {
			System.out.printf("R$: %.2f%n" , salario * 0.28); 
		}
		
			sc.close();
	}

}
