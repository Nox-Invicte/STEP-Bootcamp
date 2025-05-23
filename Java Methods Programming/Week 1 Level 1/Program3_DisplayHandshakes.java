import java.util.*;

class DisplayHandshakes {
    public int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        DisplayHandshakes obj = new DisplayHandshakes();
        int handshakes = obj.calculateHandshakes(n);
        System.out.println("Maximum number of handshakes: " + handshakes);
    }
}