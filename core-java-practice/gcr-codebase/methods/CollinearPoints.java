public class CollinearPoints {

    // method to check collinearity using slope formula
    public static boolean isCollinearUsingSlope(
            int x1, int y1,
            int x2, int y2,
            int x3, int y3) {

        // calculate slopes using double to avoid integer division
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        // ff all slopes are equal, points are collinear
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // method to check collinearity using area of triangle formula
    public static boolean isCollinearUsingArea(
            int x1, int y1,
            int x2, int y2,
            int x3, int y3) {

        // area of triangle formula
        double area = 0.5 * (
                x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2)
        );

        // if area is 0, points are collinear
        return area == 0;
    }

   
    public static void main(String[] args) {

        
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        System.out.println("Point A (" + x1 + ", " + y1 + ")");
        System.out.println("Point B (" + x2 + ", " + y2 + ")");
        System.out.println("Point C (" + x3 + ", " + y3 + ")\n");

        // check using slope method
        if (isCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using SLOPE formula.");
        } else {
            System.out.println("Points are NOT collinear using SLOPE formula.");
        }

        // check using area method
        if (isCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using AREA formula.");
        } else {
            System.out.println("Points are NOT collinear using AREA formula.");
        }
    }
}
