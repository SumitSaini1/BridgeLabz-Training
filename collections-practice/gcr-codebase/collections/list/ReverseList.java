import java.util.*;
public class ReverseList{
    public static void ReverseArrayList(){
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(35);
        marks.add(56);
        marks.add(85);
        ArrayList<Integer> reverseArrayList=new ArrayList<>();
        for(int i=marks.size()-1;i>=0;i--){
            reverseArrayList.add(marks.get(i));
        }
        
        System.out.println("Reverse ArrayList:"+reverseArrayList);

    }
    public static void ReverseLinkedList(){
        LinkedList<Integer> marks=new LinkedList<>();
        marks.add(35);
        marks.add(56);
        marks.add(85);
        LinkedList<Integer> reverseLinkedList=new LinkedList<>();
        for(int i=marks.size()-1;i>=0;i--){
            reverseLinkedList.add(marks.get(i));
        }
        System.out.println("Reverse LinkedList :"+reverseLinkedList);

    }

    public static void main(String[] args) {
        ReverseArrayList();
        ReverseLinkedList();
        
    }
}