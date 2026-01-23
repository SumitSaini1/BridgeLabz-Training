import java.util.List;
import java.util.ArrayList;
public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> marks=new ArrayList<>();
        marks.add(35);
        marks.add(85);
        marks.add(56);
        marks.add(56);
        marks.add(85);
        marks.add(56);
        List<Integer> removeDuplicate=new ArrayList<>();
        for(int i=0;i<marks.size();i++){
            if(!removeDuplicate.contains(marks.get(i))){
                removeDuplicate.add(marks.get(i));
            }

        }
        System.out.println(removeDuplicate);

        
    }
    
}
