package ExerciciosEstSequncial;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double a = Math.pow(raio, 2);
		double area = pi * a;
		
		System.out.printf("A = %.4f%n", area);
		sc.close();
	}

}

//Maneira simples
/*
 * import java.util.Locale; import java.util.Scanner;
 * 
 * public class uri1002 {
 * 
 * public static void main(String[] args) {
 * 
 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
 * 
 * double R, A, pi = 3.14159;
 * 
 * R = sc.nextDouble();
 * 
 * A = pi * R * R;
 * 
 * System.out.printf("A=%.4f%n", A);
 * 
 * sc.close(); } }
 */
