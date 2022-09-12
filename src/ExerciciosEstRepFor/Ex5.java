//URI Java 1153

package ExerciciosEstRepFor;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int fatorial = 0;

		for (int i = 0; i < N; i++) {
			fatorial = ((N * (N - 1)) * ((N - 2) * (N - 3)));

		}
		if (fatorial == 0) {

			System.out.println(fatorial + 1);
		} else {
			System.out.println(fatorial);
		}

		sc.close();
	}

}
