import java.util.Scanner;

class TotalIncome{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Salary: ");
		double salary = input.nextDouble();
		
		System.out.println("Enter Bonus: ");
		double bonus = input.nextDouble();
		
		double income = salary + bonus;
		
		System.out.println("Total Income is "+income);
	}
}