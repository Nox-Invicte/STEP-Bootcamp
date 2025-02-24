import java.util.Scanner;

class AreaOfTriangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double height,base;
		
		System.out.println("Enter height: ");
		height = input.nextDouble();
		
		System.out.println("Enter base: ");
		base = input.nextDouble();

		double area = 0.5*height*base;
		
		System.out.println("Area of triangle : "+area);
	}
}