public class NumberCheckerUtility1 {
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, digits.length);
        }
        return sum == number;
    }

    public static int[] findTwoLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : digits) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                second = n;
            }
        }
        return new int[]{largest, second};
    }

    public static int[] findTwoSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int n : digits) {
            if (n < smallest) {
                second = smallest;
                smallest = n;
            } else if (n < second && n != smallest) {
                second = n;
            }
        }
        return new int[]{smallest, second};
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = getDigits(number);
        System.out.println("Number: " + number);
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(number));
        int[] largest = findTwoLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);
        int[] smallest = findTwoSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}