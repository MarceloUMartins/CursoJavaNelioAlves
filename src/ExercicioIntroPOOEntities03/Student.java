package ExercicioIntroPOOEntities03;

public class Student {
	
	public String name;
	public double a;
	public double b;
	public double c;
	
	public double finalGrade() {
			return a + b + c;
	}
	
	public double missing() {
		return  60 - (a + b + c) ;
	}
	
	public String toString() {
		return name
		+ " "
		+ String.format("%.2f", finalGrade());
	}
}
