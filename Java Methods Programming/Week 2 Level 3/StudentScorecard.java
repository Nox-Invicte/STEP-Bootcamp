public class StudentScorecard {
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3]; // PCM
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 50) + 50; // 2-digit scores
            }
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // total, average, percentage
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100) / 100.0;
            results[i][2] = Math.round(percent * 100) / 100.0;
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Stu\tPhysics\tChemistry\tMath\tTotal\tAvg\tPercent");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t%.0f\t%.2f\t%.2f\n", i+1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}