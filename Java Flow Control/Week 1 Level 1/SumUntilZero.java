import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0, num;
        while ((num = input.nextDouble()) != 0) {
            total += num;
        }
        System.out.println("Total sum: " + total);
        input.close();
    }
}