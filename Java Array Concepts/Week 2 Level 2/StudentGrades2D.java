import java.util.*;
public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for Physics, Chemistry, and Maths: ");
            marks[i][0] = sc.nextDouble();
            marks[i][1] = sc.nextDouble();
            marks[i][2] = sc.nextDouble();
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            grades[i] = (percentage[i] >= 90) ? "A" : (percentage[i] >= 80) ? "B" : (percentage[i] >= 70) ? "C" : "D";
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " -> Percentage: " + percentage[i] + " Grade: " + grades[i]);
        }
    }
}