package ExerciciosEstCondicional;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaEntrada = sc.nextInt();
		int horaSaida = sc.nextInt();
		int horaMax = 24;
		int horaMin = 1;
		
		if (horaEntrada < horaSaida ) {
			System.out.println("O JOGO DUROU " + (horaSaida - horaEntrada) + " HORA(S)");
		}
		else  {
			System.out.println("O JOGO DUROU " + (horaSaida - horaEntrada + horaMax) + " HORA(S)");
		}
				
		sc.close();
	}

}
