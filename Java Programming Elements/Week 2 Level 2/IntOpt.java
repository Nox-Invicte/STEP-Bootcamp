import java.util.Scanner;

class IntOpt{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Enter Number 1: ");
		a = input.nextInt();
		
		System.out.println("Enter Number 2: ");
		b = input.nextInt();

		System.out.println("Enter Number 3: ");
		c = input.nextInt();
		
		int operator1 = a + b * c;
		int operator2 = a * b + c;
		int operator3 = c + a / b;
		int operator4 = a % b + c;
		
		System.out.println("Operation 1: "+operator1);
		System.out.println("Operation 2: "+operator2);
		System.out.println("Operation 3: "+operator3);
		System.out.println("Operation 4: "+operator4);
	}
}