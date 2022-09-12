//URI Java 1126

package ExerciciosEstRepFor;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			double a = sc.nextInt();
			double b = sc.nextInt();

			double div = a / b;

			if (b == 0 && div != 0) {
				System.out.println(" Divisão Impossivel ");
			} else {

				System.out.printf("%.1f%n", div);
			}
		}

		sc.close();
	}

}
