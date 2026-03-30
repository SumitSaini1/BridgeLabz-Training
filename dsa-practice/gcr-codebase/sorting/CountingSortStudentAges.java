import java.util.*;
public class CountingSortStudentAges {
	public static void sort(int age[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<age.length;i++) {
			max=Math.max(max, age[i]);
		}
		
		int[] count=new int[max+1];
		for (int i=0;i<age.length;i++) {
			count[age[i]]++;
		}
		
		int index=0;
		for(int i=0;i<count.length;i++) {
			while(count[i]>0) {
				age[index]=i;
				index++;
				count[i]--;
				
				
			}
			
			
		}
		
		
	}

	public static void main(String[] args) {
		int[] age = { 10, 18, 13, 17, 12, 14};
        sort(age);
		System.out.println(Arrays.toString(age));
		

	}

}
