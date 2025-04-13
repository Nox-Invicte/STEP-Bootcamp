import java.util.Scanner;

class TemperatureConversionCtoF{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Temperature in Celsius: ");
		double tempC = input.nextDouble();
		
		double tempF = (tempC*9/5) + 32;
		
		System.out.println("Temperature in Fahrenheit: "+tempF);
	}
}