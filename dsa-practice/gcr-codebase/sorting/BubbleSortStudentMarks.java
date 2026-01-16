public class BubbleSortStudentMarks  {
	public static void sort(int[] marks) {
		for(int turn=0;turn<marks.length-1;turn++) {
			for(int j=0;j<marks.length-1-turn;j++) {
				if(marks[j]>marks[j+1]) {
					int temp=marks[j];
					marks[j]=marks[j+1];
					marks[j+1]=temp;
					
				}
			}
		}
	}
	public static void print(int marks[]) {
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] marks= {5,4,2,3,9,6};
		sort(marks);
		print(marks);
		

	}

}
