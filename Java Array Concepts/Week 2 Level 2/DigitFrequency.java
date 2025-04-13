import java.util.*;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] frequency = new int[10];

        while (num > 0) {
            frequency[num % 10]++;
            num /= 10;
        }
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) System.out.println(i + " -> " + frequency[i]);
        }
    }
}