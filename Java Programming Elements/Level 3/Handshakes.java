import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        int handshake = (students * (students - 1)) / 2;
        System.out.println("The number of handshakes done by students = " + handshake);

        sc.close();
    }
}
