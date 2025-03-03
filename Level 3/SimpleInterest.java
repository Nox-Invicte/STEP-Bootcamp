import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double Principal = sc.nextDouble();
        System.out.print("Enter the Rate: ");
        double Rate = sc.nextDouble();
        System.out.print("Enter the Time: ");
        double Time = sc.nextDouble();

        double SimpleInterest = (Principal * Rate * Time) / 100;
        System.out.println("The Simple Interest amount is = " + SimpleInterest);

        sc.close();
    }
}
