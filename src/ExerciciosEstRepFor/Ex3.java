//URI Java 1079

package ExerciciosEstRepFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

StringBuilder result = new StringBuilder();
		
		int N = sc.nextInt();
		double p2 = 2;
		double p3 = 3;
		double p5 = 5;

		double medPond2 = 0;
		
		for (int i = 0; i < N; i++) {
			double v1Ent1 = sc.nextDouble();
			double v2Ent1 = sc.nextDouble();
			double v3Ent1 = sc.nextDouble();
			medPond2 = (((p2 * v1Ent1) + (p3 * v2Ent1) + (p5 * v3Ent1)) / (p2 + p3 + p5));
			result.append(String.format("%.1f%n", medPond2));
			
		}
		
		//System.out.printf("%.1f%n", result.toString());
		System.out.println( result.toString());
		sc.close();
	}

}


/*
int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
*/
