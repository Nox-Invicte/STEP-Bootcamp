import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of chocolates: ");
        double chocolate = sc.nextDouble();
        System.out.print("Enter the number of children: ");
        double children = sc.nextDouble();
        
        double divide = chocolate / children;
        System.out.println("The number of chocolates each child will get = " + divide);
        
        sc.close();
    }
}
