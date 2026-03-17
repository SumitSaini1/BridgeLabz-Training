import java.util.*;
public class EmailValidator {

    public static void main(String[] args) {
        String res="^([a-z]{3,}\\.[a-z]{3,}[0-9]{4,}@(sales|marketing|IT|product)\\.company\\.com)$";
        Scanner sc=new Scanner(System.in);
        try{
            int n=sc.nextInt();
            sc.nextLine();
            for(int i=0;i<n;i++){
                String input=sc.nextLine();
                if(input.matches(res)){
                    System.out.println("Access Granted");
                }else{
                    System.out.println("Access Denied");
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
     
        

    }
}
