import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] weight = new double[n], height = new double[n], bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height and weight: ");
            height[i] = sc.nextDouble();
            weight[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            status[i] = (bmi[i] < 18.5) ? "Underweight" : (bmi[i] < 25) ? "Normal" : "Overweight";
        }
        System.out.println("BMI and Status:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " -> BMI: " + bmi[i] + " Status: " + status[i]);
        }
    }
}