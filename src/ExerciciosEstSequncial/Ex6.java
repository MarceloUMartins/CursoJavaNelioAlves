package ExerciciosEstSequncial;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
						
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double pi = 3.14159;
		
		double areaTri = A * C / 2;
		double areaCir = pi * C * C;
		double areaTra = (A + B) * C / 2;
		double areaQua = B * B;
		double areaRet = A * B;

		System.out.printf("TRIANGULO: R$ %.3f%n ", areaTri);
		System.out.printf("CIRCULO: R$ %.3f%n ", areaCir);
		System.out.printf("TRAPEZIO: R$ %.3f%n ", areaTra);
		System.out.printf("QUADRADO: R$ %.3f%n ", areaQua);
		System.out.printf("RETANGULO: R$ %.3f%n ", areaRet);
		sc.close();
	}

}
