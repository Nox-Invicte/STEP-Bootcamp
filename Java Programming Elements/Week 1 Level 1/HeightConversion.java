import java.util.Scanner;

class HeightConversion {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your height in centimeters: ");
		double heightCm = input.nextDouble();
		
		// 1 inch = 2.54 cm
		double heightInches = heightCm / 2.54;
		
		// 1 foot = 12 inches
		int feet = (int) (heightInches / 12); // Get whole feet
		
		double remainingInches = heightInches % 12; // Get remaining inches
		
		System.out.println("Your Height in cm is " + heightCm);
		System.out.println("while in feet is " + feet);
		System.out.println("and inches is " + remainingInches);
	}
}