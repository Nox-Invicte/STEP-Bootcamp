import java.util.Scanner;

class PerimeterOfSquare{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Side of Square: ");
		double side = input.nextDouble();
		double perimeter = 4*side;
		
		System.out.println("Perimeter Of Square is: "+perimeter);
	}
}