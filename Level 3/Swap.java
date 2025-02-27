import java.util.Scanner;

class Swap{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number 1: ");
		double num1 = input.nextDouble();
		
		System.out.println("Enter Number 2: ");
		double num2 = input.nextDouble();
		
		System.out.println("Before Swap: "+num1+" "+num2);
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("After Swap: "+num1+" "+num2);
	}
}