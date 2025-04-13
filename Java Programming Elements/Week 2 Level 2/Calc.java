import java.util.Scanner;

class Calc{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double number1, number2;
		
		System.out.println("Enter Number 1: ");
		number1 = input.nextDouble();
		
		System.out.println("Enter Number 2: ");
		number2 = input.nextDouble();

		double sum = number1 + number2;
		double difference = number1 - number2;
		double product = number1 * number2;
		double divide = number1 / number2;
		
		System.out.println("Sum : "+sum+"\nDifference : "+difference+"\nProduct : "+product+"\nDivide : "+divide);
	}
}