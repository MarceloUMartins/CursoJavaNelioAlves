package ExerciciosEstSequncial;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nFuncio = sc.nextInt();
		double hTrab = sc.nextDouble();
		double valorHTrab = sc.nextDouble();
		double salario = hTrab * valorHTrab;
		
		System.out.println("NUMBER = " + nFuncio);
		System.out.printf("SALARY = %.2f%n ", salario);
		sc.close();
	}

}
