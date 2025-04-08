import java.util.*;

public class DynamicArrayLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        List<Integer> digits = new ArrayList<>();
        
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        Collections.sort(digits, Collections.reverseOrder());
        System.out.println("Largest: " + digits.get(0) + ", Second Largest: " + (digits.size() > 1 ? digits.get(1) : "N/A"));
    }
}
