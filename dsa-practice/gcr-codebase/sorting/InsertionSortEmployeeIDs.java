public class InsertionSortEmployeeIDs {

    public static void sort(int marks[]) {
        for (int i = 1; i < marks.length; i++) {
            int curr = marks[i];     // element to be inserted
            int prev = i - 1;

            while (prev >= 0 && marks[prev] > curr) {
                marks[prev + 1] = marks[prev];
                prev--;
            }
            marks[prev + 1] = curr;
        }
    }

    public static void print(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] marks = { 5, 4, 2, 3, 9, 6 };
        sort(marks);
        print(marks);
    }
}
