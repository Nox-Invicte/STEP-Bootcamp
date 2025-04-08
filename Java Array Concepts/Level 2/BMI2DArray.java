import java.util.*;
public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height and weight: ");
            personData[i][0] = sc.nextDouble();
            personData[i][1] = sc.nextDouble();
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            status[i] = (personData[i][2] < 18.5) ? "Underweight" : (personData[i][2] < 25) ? "Normal" : "Overweight";
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " -> BMI: " + personData[i][2] + " Status: " + status[i]);
        }
    }
}