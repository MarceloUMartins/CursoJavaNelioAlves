//URI Java 1072

package ExerciciosEstRepFor;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int contIn = 0;
		int contOut = 0;

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();

			if (x >= 10 && x <= 20) {

				contIn = contIn + 1;
			} else {

				contOut = contOut + 1;
			}

		}
		System.out.println(contIn + " in ");
		System.out.println(contOut + " out ");

		sc.close();

	}

}
