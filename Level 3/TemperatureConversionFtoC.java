import java.util.Scanner;

class TemperatureConversionFtoC{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Temperature in Fahrenheit: ");
		double tempF = input.nextDouble();
		
		double tempC = (tempF - 32)*5/9;
		
		System.out.println("Temperature in Celsius: "+tempC);
	}
}