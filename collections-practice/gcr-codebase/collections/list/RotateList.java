import java.util.ArrayList;
import java.util.Collections;

class RotateList {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);
        marks.add(50);
        Collections.rotate(marks, 3);
        System.out.println(marks);

    }
    
}