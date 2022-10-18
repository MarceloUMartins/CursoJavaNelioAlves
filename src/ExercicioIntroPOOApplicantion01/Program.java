package ExercicioIntroPOOApplicantion01;

import java.util.Locale;
import java.util.Scanner;

import ExercicioIntroPOOEntities01.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
				
		System.out.println("Enter rectangle width and heigth: ");
		rectangle.a = sc.nextDouble();
		rectangle.b = sc.nextDouble();
		
		double area = rectangle.area();
		System.out.printf("AREA = %.2f%n", area);
		
		double perimeter = rectangle.perimeter();
		System.out.printf("PERIMETER = %.2f%n", perimeter);
		
		double diagonal = rectangle.diagonal();
		System.out.printf("DIAGONAL = %.2f%n", diagonal);					
		
		sc.close();
		
	}

}
