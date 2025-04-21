import java.util.Scanner;

public class NumberAnalysis {
    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        return Integer.compare(a, b); // -1 if a < b, 0 if a == b, 1 if a > b
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (isPositive(numbers[i])) {
                System.out.print("Positive ");
                System.out.println(isEven(numbers[i]) ? "Even" : "Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int cmp = compare(numbers[0], numbers[4]);
        if (cmp == 0) System.out.println("First and last are Equal");
        else if (cmp > 0) System.out.println("First is Greater");
        else System.out.println("First is Lesser");
    }
}
