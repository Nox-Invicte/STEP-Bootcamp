import java.util.Scanner;

class UserFeeDiscount {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the student fee: ");
		int fee = input.nextInt();

		System.out.print("Enter the discount percentage: ");
		int discountPercent = input.nextInt();

		double discount = (double) fee * discountPercent / 100;

		double discountedFee = fee - discount;

		System.out.println("The discount amount is INR " + discount);
		System.out.println("and final discounted fee is INR " + discountedFee);
	}
}