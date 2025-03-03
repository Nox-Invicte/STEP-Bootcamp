import java.util.Scanner;

class YardAndMiles{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Distance in Feet: ");
		double feet = input.nextDouble();
		double yards = feet/3;
		double miles = yards/1760;
		
		System.out.println("Distance in Yards: "+yards+"\nDistance in Miles: "+miles);
	}
}