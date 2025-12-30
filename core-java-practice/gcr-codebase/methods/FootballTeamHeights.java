public class FootballTeamHeights {

    // generate random number 
    public static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }

    // find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    // main method
    public static void main(String[] args) {

        int[] heights = generateHeights();

        System.out.println("Players Heights (cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\n\nResults:");
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height : " + findTallest(heights) + " cm");
        System.out.println("Mean Height    : " + findMean(heights) + " cm");
    }
}
