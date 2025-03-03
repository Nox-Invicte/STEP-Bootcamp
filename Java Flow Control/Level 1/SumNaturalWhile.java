import java.util.Scanner;

class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0, i = 1;
        while (i <= n) {
            sum += i++;
        }
        System.out.println("Sum: " + sum);
        input.close();
    }
}