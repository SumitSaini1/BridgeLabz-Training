import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.LocalDate;
import java.util.*;
class GlobalShipmentValidator{
    public static boolean validCode(String code){
        if(!code.matches("SHIP-[1-9][0-9]{5}")){
            return false;
        }
        String num=code.substring(5);
        int count =1;
        for(int i=1;i<num.length();i++){
            if(num.charAt(i)==num.charAt(i-1)){
                count++;
                if(count>3){
                    return false;
                }
                
            }else{
                count=1;
            }

        }
        return true;
    }
    public static boolean shipDate(String date){
        if(!date.matches("20[0-9]{2}-[0-9]{2}-[0-9]{2}")){
            return false;

        }
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(year%400==0 || (year %4==0 && year %100 !=0)){
            days[1]=29;
        }
        if(month<1 || month >12){
            return false;
        }
        if(day <1 || day>days[month-1]){
            return false;
        }
        return true;
        

   
    } 
    public static boolean mode(String mode){
        Set<String> modes=new HashSet<>(Arrays.asList("AIR","SEA","ROAD","RAIL","EXPRESS","FREIGHT"));
        return modes.contains(mode);
         
    }
    public static boolean weight(String weight){
        if(!weight.matches("(0|[1-9][0-9]{0,5})(\\.\\d{1,2})?")){
            return false;


        }
        try{
            double wei=Double.parseDouble(weight);
            return wei>0 && wei<=999999.99;
        }catch(Exception e){
            return false;
        }

    }
    public static boolean status(String status){
        Set<String> sta=new HashSet<>(Arrays.asList("DELIVERED","CANCELLED","IN_TRANSIT"));
        return sta.contains(status);

    }

    public static void main(String args[]){
        try{
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            sc.nextLine();
            for(int i=0;i<n;i++){
                String userIn=sc.nextLine();
                String[] split=userIn.split("\\|");
                if(split.length!=5){
                    System.out.println("NON-COMPLIANT RECORD");
                    continue;
                }
                boolean res=validCode(split[0]) && shipDate(split[1]) && mode(split[2]) && weight(split[3]) && status(split[4]);
                if(res){
                    System.out.println("COMPLIANT RECORD");
                }else{
                    System.out.println("NON-COMPLIANT RECORD");
                }

            }
           


        }catch(Exception e){
            e.getMessage();
        }

    }
}