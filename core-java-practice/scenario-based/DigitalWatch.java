
public class DigitalWatch {
    public static void watch(){
        // outer loop handle the hours One day = 24 hours 
        for(int hour=0;hour<24;hour++){
            // inner loop handle the minutes one hours=60 minutes
            for(int minute=0;minute<60;minute++){
                // if hour 13 and minute 0 so power cut and break
                if(hour==13 && minute==0){
                    System.out.println("Power Cut at 13:00");
                    break;
                }
                System.out.println("Time:  " + hour + ":" + minute);
            }
            // break when houw 13
            
            if(hour==13){
                break;
            }
        }
    }
    public static void main(String[] args) {
        watch();
    }
    
}
