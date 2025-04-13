import java.util.*;

class TriangularPark {
    public double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side A: ");
        double a = sc.nextDouble();
        System.out.print("Enter side B: ");
        double b = sc.nextDouble();
        System.out.print("Enter side C: ");
        double c = sc.nextDouble();

        TriangularPark obj = new TriangularPark();
        double rounds = obj.calculateRounds(a, b, c);
        System.out.println("Rounds needed to complete 5km: " + rounds);
    }
}