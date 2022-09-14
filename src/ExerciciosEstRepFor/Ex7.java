package ExerciciosEstRepFor;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		
		for (double i = 1; i <= N; i++) {
			if (N > 0) {
				double a = Math.pow(i, 2);
				double b = Math.pow(i, 3);
				
				System.out.printf("%.0f%n", i);
				System.out.printf("%.0f%n", a);
				System.out.printf("%.0f%n", b);

			}
		}

		sc.close();
	}

}
