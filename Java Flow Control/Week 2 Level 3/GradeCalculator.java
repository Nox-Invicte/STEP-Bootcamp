import java.util.*;

class GradeCalculator{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Physics Marks: ");
		double phy = input.nextDouble();
		
		System.out.println("Enter Chemistry Marks: ");
		double chem = input.nextDouble();
		
		System.out.println("Enter Maths Marks: ");
		double math = input.nextDouble();
		
		double average = (phy+chem+math)/3;
		
		if (average >= 80){
			System.out.println("Average Marks: "+average+"\nGrade: A");
		}
		else if (average >= 70){
			System.out.println("Average Marks: "+average+"\nGrade: B");
		}
		else if (average >= 60){
			System.out.println("Average Marks: "+average+"\nGrade: C");
		}
		else if (average >= 50){
			System.out.println("Average Marks: "+average+"\nGrade: D");
		}
		else if (average >= 40){
			System.out.println("Average Marks: "+average+"\nGrade: E");
		}
		else {
			System.out.println("Average Marks: "+average+"\nGrade: R");
		}
	}
}