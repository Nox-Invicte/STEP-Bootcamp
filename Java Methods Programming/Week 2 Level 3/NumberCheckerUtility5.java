public class NumberCheckerUtility5 {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[idx++] = i;
        }
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int max = 0;
        for (int f : factors) if (f > max) max = f;
        return max;
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static int productFactors(int[] factors) {
        int product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double cubeProduct(int[] factors) {
        double product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    public static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum > number;
    }

    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum < number;
    }

    public static boolean isStrong(int number) {
        int temp = number, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    public static void main(String[] args) {
        int number = 28;
        int[] factors = findFactors(number);
        System.out.println("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nGreatest: " + greatestFactor(factors));
        System.out.println("Sum: " + sumFactors(factors));
        System.out.println("Product: " + productFactors(factors));
        System.out.println("Cube Product: " + cubeProduct(factors));
        System.out.println("Is Perfect: " + isPerfect(number));
        System.out.println("Is Abundant: " + isAbundant(number));
        System.out.println("Is Deficient: " + isDeficient(number));
        System.out.println("Is Strong: " + isStrong(number));
    }
}