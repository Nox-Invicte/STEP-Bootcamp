import java.util.Scanner;

class Division{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double number1, number2;
		
		System.out.println("Enter Number 1: ");
		number1 = input.nextDouble();
		
		System.out.println("Enter Number 2: ");
		number2 = input.nextDouble();

		double quotient = number1 / number2;
		double remainder = number1 % number2;
		
		System.out.println("Quotient : "+(int)(quotient)+"\nRemainder : "+(int)(remainder));
	}
}