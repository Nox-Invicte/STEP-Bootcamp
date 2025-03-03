import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Invalid input. Enter a non-negative integer.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
        input.close();
    }
}
