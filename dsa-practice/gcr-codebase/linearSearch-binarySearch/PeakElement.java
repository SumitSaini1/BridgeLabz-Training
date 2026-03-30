
public class PeakElement {
    public static int findPeakElement(int array[]){
        int left=0;
        int right=array.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(array[mid]>array[mid-1] & array[mid]>array[mid+1]){
                return mid;
            }else if(array[mid]<array[mid-1]){
                right=mid-1;
            }else if(array[mid]<array[mid+1]){
                left=mid+1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[] array = {1, 3, 20, 4, 1, 0};

        int index = findPeakElement(array);

        System.out.println("Peak element index: " + index);
        System.out.println("Peak element value: " + array[index]);
        
    }    
}
