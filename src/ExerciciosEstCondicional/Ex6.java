package ExerciciosEstCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double intEntrada = sc.nextDouble();

		String intervalo;

		if (intEntrada >= 0 && intEntrada <= 25) {
			intervalo = "Intervalo [0,25]";
		} else if (intEntrada > 25 && intEntrada <= 50) {
			intervalo = "Intervalo [25,50]";
		} else if (intEntrada > 50 && intEntrada <= 75) {
			intervalo = "Intervalo [50,75]";
		} else if (intEntrada > 75 && intEntrada <= 100) {
			intervalo = "Intervalo [75,100]";
		} else {
			intervalo = "Fora de intervalo";
		}
		System.out.println(intervalo);

		sc.close();
	}

}
