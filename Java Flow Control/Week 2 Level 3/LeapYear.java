import java.util.*;

class LeapYear{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		if (year%4 == 0){
			System.out.println("Leap Year");
		} else {
			System.out.println("Not Leap Year");
		}
	}
}