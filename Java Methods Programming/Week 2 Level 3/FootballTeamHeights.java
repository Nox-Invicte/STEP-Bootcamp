public class FootballTeamHeights {
    public static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        return heights;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) sum += i;
        return sum;
    }

    public static double mean(int[] array) {
        return (double)sum(array) / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i : array) if (i < min) min = i;
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i : array) if (i > max) max = i;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.print("Player Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest Height: " + min(heights));
        System.out.println("Tallest Height: " + max(heights));
        System.out.println("Mean Height: " + mean(heights));
    }
}