package ExercicioFixMembroEstaticoPOOEntities01;

public class CurrencyConverter {
		
	public static final double IOF = 0.06;

	public static double convertDollarToReal(double a, double b) {
		return (a * b * IOF) + (a * b);
	}
	
}

