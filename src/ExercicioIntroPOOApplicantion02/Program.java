package ExercicioIntroPOOApplicantion02;

import java.util.Locale;
import java.util.Scanner;

import ExercicioIntroPOOEntities02.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("");
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
				
		System.out.println("Employee: " + employee );
		
		System.out.println("which percentage to increase salary?");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
								
		System.out.println("Updated data: " + employee );
		
		
		sc.close();
	}

}
