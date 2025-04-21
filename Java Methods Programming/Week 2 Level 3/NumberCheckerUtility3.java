public class NumberCheckerUtility3 {
    public static int[] getDigits(int number) {
        String str = String.valueOf(number);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseDigits(digits);
        return areEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 121;
        int[] digits = getDigits(number);
        System.out.println("Is Palindrome? " + isPalindrome(number));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
    }
}