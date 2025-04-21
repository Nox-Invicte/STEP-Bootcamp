public class BonusCalculator {
    public static int[][] generateSalariesAndService(int employees) {
        int[][] data = new int[employees][2];
        for (int i = 0; i < employees; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // salary
            data[i][1] = (int)(Math.random() * 10); // years of service
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] data) {
        double[][] updated = new double[data.length][2]; // new salary and bonus
        for (int i = 0; i < data.length; i++) {
            double bonus = data[i][1] > 5 ? 0.05 * data[i][0] : 0.02 * data[i][0];
            updated[i][0] = data[i][0] + bonus;
            updated[i][1] = bonus;
        }
        return updated;
    }

    public static void displaySummary(int[][] original, double[][] updated) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Emp\tOld Salary\tYears\tNew Salary\tBonus");
        for (int i = 0; i < original.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t%.2f\n", i+1, original[i][0], original[i][1], updated[i][0], updated[i][1]);
            totalOld += original[i][0];
            totalNew += updated[i][0];
            totalBonus += updated[i][1];
        }
        System.out.printf("\nTotal Old Salary: %.2f, Total New Salary: %.2f, Total Bonus: %.2f\n", totalOld, totalNew, totalBonus);
    }

    public static void main(String[] args) {
        int[][] data = generateSalariesAndService(10);
        double[][] updated = calculateBonus(data);
        displaySummary(data, updated);
    }
}