import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the weight in pounds: ");
        double weight = sc.nextDouble();

        double weightInKg = weight * 0.453592;
        System.out.println("The weight in kilograms = " + weightInKg + " Kg");

        sc.close();
    }
}
