import java.util.*;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[] physics = new double[n], chemistry = new double[n], maths = new double[n], percentage = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for Physics, Chemistry, and Maths: ");
            physics[i] = sc.nextDouble();
            chemistry[i] = sc.nextDouble();
            maths[i] = sc.nextDouble();
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;
            grades[i] = (percentage[i] >= 90) ? "A" : (percentage[i] >= 80) ? "B" : (percentage[i] >= 70) ? "C" : "D";
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " -> Percentage: " + percentage[i] + " Grade: " + grades[i]);
        }
    }
}