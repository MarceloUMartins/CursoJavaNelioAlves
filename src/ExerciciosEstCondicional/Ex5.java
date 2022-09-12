package ExerciciosEstCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		double quantidade = sc.nextDouble();
		double preco;

		if (cod == 1) {
			preco = 4.00;
		} else if (cod == 2) {
			preco = 4.50;
		} else if (cod == 3) {
			preco = 5.00;
		} else if (cod == 4) {
			preco = 2.00;
		} else if (cod == 5) {
			preco = 1.50;
		} else {
			preco = 00;
		}
		double valorTotal = preco * quantidade;
		System.out.printf("TOTAL = %.2f%n", valorTotal);
		sc.close();

	}

}
