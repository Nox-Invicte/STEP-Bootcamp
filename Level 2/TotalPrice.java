import java.util.Scanner;

class TotalPrice{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double unitPrice, quantity;
		
		System.out.println("Enter Price of 1 Unit: ");
		unitPrice = input.nextDouble();
		
		System.out.println("Enter Quantity: ");
		quantity = input.nextDouble();

		double totalPrice = unitPrice*quantity;
		
		System.out.println("Total Price is "+totalPrice);
	}
}