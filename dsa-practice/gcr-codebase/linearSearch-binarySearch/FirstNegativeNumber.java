public class FirstNegativeNumber {
    public static void main(String[] args) {
        int[] numbers={2,3,5,-3,6,-8,-2};
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<0){
                System.out.println("First negative Number:"+numbers[i]);
                return;
            }else{
                System.out.println("No negative found");
            }
        }
    }
    
}
