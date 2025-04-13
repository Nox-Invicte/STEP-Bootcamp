import java.util.Scanner;

class DoubleOpt{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Enter Number 1: ");
		a = input.nextDouble();
		
		System.out.println("Enter Number 2: ");
		b = input.nextDouble();

		System.out.println("Enter Number 3: ");
		c = input.nextDouble();
		
		double operator1 = a + b * c;
		double operator2 = a * b + c;
		double operator3 = c + a / b;
		double operator4 = a % b + c;
		
		System.out.println("Operation 1: "+operator1);
		System.out.println("Operation 2: "+operator2);
		System.out.println("Operation 3: "+operator3);
		System.out.println("Operation 4: "+operator4);
	}
}