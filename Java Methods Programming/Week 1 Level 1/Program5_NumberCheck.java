import java.util.*;

class NumberCheck {
    public int checkNumber(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        NumberCheck obj = new NumberCheck();
        int result = obj.checkNumber(num);
        if (result == 1) System.out.println("Positive number");
        else if (result == -1) System.out.println("Negative number");
        else System.out.println("Zero");
    }
}