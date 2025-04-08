import java.util.*;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder(String.valueOf(num)).reverse();
        System.out.println("Reversed Number: " + sb);
    }
}