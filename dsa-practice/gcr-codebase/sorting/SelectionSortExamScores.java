public class SelectionSortExamScores {
    public static void sort(int marks[]) {
        for (int turn = 0; turn < marks.length - 1; turn++) {
            int min = turn;
            for (int j = turn + 1; j < marks.length; j++) {
                if (marks[j] < marks[min]) {
                    min = j;

                }
            }
            if (min != turn) {
                int temp = marks[turn];
                marks[turn] = marks[min];
                marks[min] = temp;

            }

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
