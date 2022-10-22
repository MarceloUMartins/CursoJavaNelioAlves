package ExercicioIntroPOOApplicantion03;

import java.util.Locale;
import java.util.Scanner;

import ExercicioIntroPOOEntities03.Student;

public class Program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = sc.nextLine();
		
		System.out.print("Insert the first note: ");
		student.a = sc.nextDouble();
		
		System.out.print("Insert the second note: ");
		student.b = sc.nextDouble();
		
		System.out.print("Insert the third note: ");
		student.c = sc.nextDouble();
		
		if(student.a + student.b + student.c >= 60 ) {
			System.out.println("FINAL GRADE = " + student );
			System.out.println("PASS");
			
		}else if(student.a + student.b + student.c < 60){
			System.out.println("FINAL GRADE = " + student );
		    System.out.println("FAILED");						
			double missing = student.missing();
			System.out.println("MISSING: " + missing );
		}
		sc.close();
	}

}
